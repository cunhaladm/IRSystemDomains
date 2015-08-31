/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains;

/**
 * Classe Representativa de uma Cidade
 * @author Luke Frozz
 * @since 25/08/2015
 */
public class Cidade {
    /**
     * Nome da Cidade
     */
    private String nome;
    /**
     * campo de verificação para saber se é Capital ou não
     */
    private boolean capital;
    /**
     * Getter de nome
     * @return Nome da Cidade
     */
    public String getNome() {
        return nome;
    }
    /**
     * Setter de nome
     * @param nome atribui o nome da Cidade
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Getter de Capital
     * @return Verificação se a Cidade é uma Capital ou não
     */
    public boolean isCapital() {
        return capital;
    }
    /**
     * Construtor padrão de Cidade
     */
    public Cidade() {
    }
    
    /** 
     * construtor completo de cidade
     * @param nome atribui o nome da Cidade
     * @param capital atribui o validador de Capital
     */
    public Cidade(String nome, boolean capital) {
        this.nome = nome;
        this.capital = capital;
    }
    
}
