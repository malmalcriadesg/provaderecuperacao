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
public enum Genero {
   MASCULINO ("Masculino",'M'),
   FEMININO("Feminino",'F');
   
   private final String texto;
   private final char caracter;

    private Genero(String texto, char caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }
   
   
}