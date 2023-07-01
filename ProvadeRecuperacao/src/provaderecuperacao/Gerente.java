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
public class Gerente  extends CargoDeConfianca{
   
    /**
     *
     */
    public String gerente;

    public Gerente(String gerente) {
        this.gerente = gerente;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return super.toString()+
                 "\n gerente:" + gerente;
    }
    
    
    
    
}
