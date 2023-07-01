/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaderecuperacao;

/**
 *
 * @author Aluno
 */
public class Diretor {
     
    private final double PREMIO ;

    public Diretor(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public String toString() {
        return super.toString()+
                 "\n PREMIO:" + PREMIO;
    }
    
    
            
    
}
