/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaderecuperacao;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Motorista extends Funcionario{ 
    
    public String carteiraDeHabilitacao;

    public Motorista(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, dataNascimento);
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n carteiraDeHabilitacao:" + carteiraDeHabilitacao + '}';
    }
    
 
    
    
}
