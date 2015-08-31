/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains;

import java.util.*;

/**
 * Classe representativa de um Estado
 * @author Luke Frozz
 * @since 25/08/2015
 */
public class Estado {
    /**
     * Nome do Estado
     */
    private String nome;
    /**
     * Unidade Federativa do Estado
     */
    private String uf;
    /**
     * Cidades do Estado
     */
    private List<Cidade> cidades;

    /**
     * Getter de nome
     * @return nome do Estado
     */
    public String getNome() {
        return nome;
    }
    /**
     * Setter de nome
     * @param nome atribui o nome do Estado
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Getter de UF
     * @return UF de Estado 
     */
    public String getUF() {
        return uf;
    }
    /**
     * Setter de UF
     * @param uf atribui a UF do Estado
     */
    public void setUF(String uf) {
        this.uf = uf;
    }
    /**
     * Getter de Cidades
     * @return Cidades do Estado
     */
    public List<Cidade> getCidades() {
        return cidades;
    }
    /**
     * Setter de cidades
     * @param cidades atribui as cidades do Estado
     */
    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    /**
     * Construtor Padrão de Estado
     */
    public Estado() {
    }

    /**
     * Construtor completo de Estado
     * @param nome atribui o nome do Estado
     * @param uf atribui a UF do Estado
     * @param cidades atribui as Cidades do Estado
     */
    public Estado(String nome, String uf, List<Cidade> cidades) {
        this.nome = nome;
        this.uf = uf;
        this.cidades = cidades;
    }
    
}
