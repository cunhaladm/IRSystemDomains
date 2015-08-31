/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains;

/**
 * Classe representativa de um Endereço físico
 * @author Luke Frozz
 * @since 25/08/2015
 */
public class Endereco {
    /**
     * Logradouro do Endereço
     */
    private String logradouro;
    /**
     * Número do Endereço
     */
    private int numero;
    /**
     * Complemento do Endereço
     */
    private String complemento;
    /**
     * CEP do Endereço
     */
    private String cep;
    /**
     * Cidade do Endereço
     */
    private Cidade cidade;
    
    /**
     * 
     * @return 
     */
    public String getLogradouro() {
        return logradouro;
    }
    /**
     * Setter de Logradouro
     * @param logradouro atribui o logradouro do Endereço
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    /**
     * Getter de número
     * @return número do endereço
     */
    public int getNumero() {
        return numero;
    }
    /**
     * Setter de número
     * @param numero aribui o número do Endereço
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * Getter de complemento
     * @return complemento do Endereço
     */
    public String getComplemento() {
        return complemento;
    }
    /**
     * Setter de complemento
     * @param complemento atribui o complemento do Endereço
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    /**
     * Getter de CEP
     * @return CEP do Endereço
     */
    public String getCep() {
        return cep;
    }
    /**
     * Setter de CEP
     * @param cep atribui o CEP do Endereço
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
    /**
     * Getter de Cidade
     * @return Cidade do Endereço
     */
    public Cidade getCidade() {
        return cidade;
    }
    /**
     * Setter de Cidade
     * @param cidade atribui a Cidade do Endereço
     */
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    /**
     * Construtor padrão de Endereco
     */
    public Endereco() {
    }
    /**
     * Construtor completo de Endereço
     * @param logradouro atribui o logradouro do Endereço
     * @param numero atribui o número do Endereço
     * @param complemento Atribui o complemento do Endereço
     * @param cep atribui o CEP do Endereço
     * @param cidade atribui a Cidade do Endereço
     */
    public Endereco(String logradouro, int numero, String complemento, String cep, Cidade cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
    }
    
}
