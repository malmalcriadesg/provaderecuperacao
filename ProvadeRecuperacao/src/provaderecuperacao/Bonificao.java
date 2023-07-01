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
public enum Bonificao {
    
    GERENTE (0.35),
    DIRETOR(0.45);
    
    protected double valor;

    private Bonificao(double valor) {
        this.valor = valor;
    }
    
    
    
}
