/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains;

/**
 * Classe representativa de um Telefone
 * @author Luke Frozz
 * @since 25/08/2015
 */
public class Telefone {
    /**
     * Número de telefone
     */
    private String numero;
    /**
     * Getter de número
     * @return número do Telefone
     */
    public String getNumero() {
        return numero;
    }
    /**
     * Setter de número
     * @param numero atribui o número de Telefone
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Construtor padrão de Telefone
     */
    public Telefone() {
    }
    
    /**
     * construtor completo de Telefone
     * @param numero atribui o número de Telefone
     */
    public Telefone(String numero) {
        this.numero = numero;
    }
    
    
}
