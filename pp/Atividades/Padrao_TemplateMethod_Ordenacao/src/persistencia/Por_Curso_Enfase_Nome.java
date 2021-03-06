/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import classes.Aluno;

/**
 *
 * @author JHONATHAN
 */
public class Por_Curso_Enfase_Nome extends AlunoPersistenciaTemplateMethod {
    
    public Por_Curso_Enfase_Nome(String str) {
        super(str);
    }

    @Override
    public boolean ePrimeiro(Aluno aluno1, Aluno aluno2) {
        if (aluno1.getCurso().equalsIgnoreCase(aluno2.getCurso())) {
            if (aluno1.getEnfase().equalsIgnoreCase(aluno2.getEnfase())) {
                return aluno1.getNomeSa().compareToIgnoreCase(aluno2.getNomeSa()) <= 0;
            } else {
                return aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) <= 0;
            }
        } else {
            return aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) <= 0;
        }
    }
}
