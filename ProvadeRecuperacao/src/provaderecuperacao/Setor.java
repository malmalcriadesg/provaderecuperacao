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
public enum  Setor {
    ENGENHARIA ("Engenharia"),
    JURIDICO("Juridico"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operacoes");
    
    private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public static Setor getENGENHARIA() {
        return ENGENHARIA;
    }

    public static Setor getJURIDICO() {
        return JURIDICO;
    }

    public static Setor getRECURSOS_HUMANOS() {
        return RECURSOS_HUMANOS;
    }

    public static Setor getMARKETING() {
        return MARKETING;
    }

    public static Setor getOPERACOES() {
        return OPERACOES;
    }

    public String getNome() {
        return nome;
    }
    
    
}
