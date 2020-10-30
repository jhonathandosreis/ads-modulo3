/*
 *  -------------------------------------------------------------------------------------------------->
 *  Licença    : MIT - Copyright 2019 Jhonathan dos reis (jhonlinux) <jhonathan.rosa@maximatech.com.br>
 *  Criado em  : 29/10/2020 13:50:44 
 *  Instituição: FACULDADE SENAI FATESG
 *  Curso      : Análise e Desenvolvimento de sistemas - Módulo 3 - 2020/2
 *  Disciplina : mbd - Modelagem de banco de dados
 *  Aluno      : Jhonathan dos reis
 *  Projeto    : PROJETO CAMADAS
 *  Exercício  : Cadastro de miniaturas
 *  ---------------------------------------------------------------------------------------------------
 *  Propósito do arquivo (Pregu;á náo deicha preencher).
 *  ---------------------------------------------------------------------------------------------------| 
 */
package br.com.torrentz.bll;

import static br.com.torrentz.bll.ValidacoesBll.*;
import br.com.torrentz.dal.CategoriasDal;
import br.com.torrentz.model.Categorias;
import java.util.ArrayList;

/**
 *
 * @author JHONATHAN
 */
public class CategoriaBll {

    private CategoriasDal categoriadal;

    public CategoriaBll() throws Exception {
        categoriadal = new CategoriasDal();
    }

    public void Adicionar(Categorias categorias) throws Exception {

        try {
            validarNome(categorias.getCat_nome());           
            categoriadal.addCategoria(categorias);
        } catch (Exception e) {
            String mensagem = e.getMessage();
            if (mensagem.contains("duplicate")) {
                mensagem = "Já existe uma categoria com este nome!";
            }
            throw new Exception(mensagem);
        }
    }

    public void Alterar(Categorias categorias) throws Exception {

        try {
            validarNome(categorias.getCat_nome());
            categoriadal.updateCategoria(categorias);
        } catch (Exception e) {
            String mensagem = e.getMessage();
            if (mensagem.contains("duplicate")) {
                mensagem = "Já existe uma categoria com este nome!";
            }
            throw new Exception(mensagem);
        }
    }

    public void Remover(Categorias categorias) throws Exception {
        try {
            categoriadal.deleteCategoria(categorias.getCat_iden());
        } catch (Exception e) {
            String mensagem = e.getMessage();
            if (mensagem.contains("update")) {
                mensagem = "precisa tratar";
            }
            throw new Exception(mensagem);
        }
    }

    public ArrayList<Categorias> getConsulta() throws Exception {
        try {
            
            return categoriadal.getAllCategorias();
        } catch (Exception e) {
            String mensagem = e.getMessage();
            if (mensagem.contains("empty")) {
                mensagem = "Não existe nenhum dado nesta consulta!";
            }
            throw new Exception(mensagem);
        }
    }

    public Categorias getConsultaPorId(int cat_iden) throws Exception {
        try {
            return categoriadal.getCategoriasById(cat_iden);
        } catch (Exception e) {
            String mensagem = e.getMessage();
            if (mensagem.contains("empty")) {
                mensagem = "Não existe nenhuma categoria cadastrada com este id!";
            }
            throw new Exception(mensagem);
        }
    }
}
