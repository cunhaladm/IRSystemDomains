/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains;

/**
 * Classe representativa de um e-mail
 * @author Luke Frozz
 * @since 25/08/2015
 */
public class Email {
    /**
     * Endereço de e-mail
     */
    private String endereco;
    /**
     * Getter do Endereço
     * @return Endereço de E-mail
     */
    public String getEndereco() {
        return endereco;
    }
    /**
     * Setter de Endereço
     * @param endereco atribui o endereço de e-mail
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    /**
     * Construtor padrão de E-mail
     */
    public Email() {
    }
    /**
     * Construtor completo de Email
     * @param endereco atribui o endereço de email
     */
    public Email(String endereco) {
        this.endereco = endereco;
    }
    
}
