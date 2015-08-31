/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains;

import java.util.*;

/**
 * Classe representativa do Líder e Doze
 * @author Luke Frozz
 * @since 25/08/2015
 */
public class Lider extends Discipulo {
    /**
     * Lista de Discípulos abaixo do Líder
     */
    private List<Discipulo> discipulos;
    /**
     * Lista de Relatórios de Célula do Líder
     */
    private List<RelatorioCelula> relatorios;
    
    /**
     * Getter de Discípulo
     * @return lista de discípulos abaixo do Líder
     */
    public List<Discipulo> getDiscipulos() {
        return discipulos;
    }
    /**
     * Setter de Discípulo
     * @param discipulos atribui os discípulos referente ao Líder
     */
    public void setDiscipulos(List<Discipulo> discipulos) {
        this.discipulos = discipulos;
    }
    /**
     * Getter de Relatórios de Célula
     * @return Relatórios de Célula
     */
    public List<RelatorioCelula> getRelatorios() {
        return relatorios;
    }
    /**
     * Setter de Relatórios
     * @param relatorios atribui os Relatórios de Célula do Líder
     */
    public void setRelatorios(List<RelatorioCelula> relatorios) {
        this.relatorios = relatorios;
    }
    /**
     * Construtor padrão do Líder
     */
    public Lider() {
    }
    /**
     * Construtor completo do Líder onde:
     * @param discipulos atribui os Discípulos do Líder
     * @param relatorios atribui os Relatórios de Célula do Líder
     * @param nome atribui o nome do Líder
     * @param telefones atribui os números de telefone do Líder
     * @param email atribui os endereços de e-mail do Líder
     * @param profissoes atribui os âmbitos profissionais do Líder
     * @param sexo atribui o Sexo do Líder
     * @param enderecos atribui a lista de endereços físicos do Líder
     * @param status atribui o Status do Líder, que podem ser:
     * <ul>
     *      <li>Líder de Célula</li>
     *      <li>Doze</li>
     * </ul>

     */
    public Lider(List<Discipulo> discipulos, List<RelatorioCelula> relatorios, String nome, List<Telefone> telefones, List<Email> email, List<Profissao> profissoes, Sexo sexo, List<Endereco> enderecos, String status) {
        super(nome, telefones, email, profissoes, sexo, enderecos, status);
        this.discipulos = discipulos;
        this.relatorios = relatorios;
    }
    
}
