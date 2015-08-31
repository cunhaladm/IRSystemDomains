/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains;

/**
 * Classe representativa de uma Profissão
 * @author Luke Frozz
 * @since 25/08/2015
 */
public class Profissao {
    /**
     * Nome da Profissão
     */
    private String nome;

    /**
     * Getter de nome
     * @return nome da Profissão
     */
    public String getNome() {
        return nome;
    }
    /**
     * Setter de nome
     * @param nome atribui o nome da Profissão
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Construtor padrão de Profissão
     */
    public Profissao() {
    }

    /**
     * Construtor completo de profissão
     * @param nome atribui o nome da Profissão
     */
    public Profissao(String nome) {
        this.nome = nome;
    }
    
    
}
