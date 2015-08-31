/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains;

import java.util.*;

/**
 * Classe representativa de um Discípulo
 * @author Luke Frozz
 * @since 25/08/2015
 */
public class Discipulo {
    /**
     * Nome do Discípulo
     */
    protected String nome;
    /**
     * Números de telefone do Discípulo
     */
    protected List<Telefone> telefones;
    /**
     * Endereços de e-mail do Discípulo
     */
    protected List<Email> emails;
    /**
     * Aptidões profissionais e/ou técnicas do Discípulo
     */
    protected List<Profissao> profissoes;
    /**
     * Sexo do Discípulo
     */
    protected Sexo sexo;
    /**
     * Endereços físicos do Discípulo
     */
    protected List<Endereco> enderecos;
    /**
     * Status do Discípulo que diz o que ele é:
     * <ul>
     *      <li>Visitante</li>
     *      <li>Novo Discípulo</li>
     *      <li>Discípulo</li>
     *      <li>Líder de Célula</li>
     *      <li>Doze</li>
     * </ul>
     */
    protected String status;
    
    /**
     * Getter do nome
     * @return Nome do Discípulo
     */
    public String getNome() {
        return nome;
    }
    /**
     * Setter do nome
     * @param nome atribui o Nome do Discípulo
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Getter de telefones
     * @return Números de telefone do Discípulo
     */
    public List<Telefone> getTelefones() {
        return telefones;
    }
    /**
     * Setter de telefones
     * @param telefones 
     */
    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    /**
     * Getter de emails
     * @return Endereços de e-mail do Discípulo
     */
    public List<Email> getEmails() {
        return emails;
    }
    /**
     * Setter de emails
     * @param emails atribui os endereços de e-mail do Discípulo
     */
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }
    /**
     * Getter de profissoes
     * @return Ambitos profissionais do discípulo
     */
    public List<Profissao> getProfissoes() {
        return profissoes;
    }
    /**
     * Setter de profissoes
     * @param profissoes atribui os ambitos profissioais do Discípulo
     */
    public void setProfissoes(List<Profissao> profissoes) {
        this.profissoes = profissoes;
    }
    /**
     * Getter de Sexo
     * @return Sexo do Discípulo
     */
    public Sexo getSexo() {
        return sexo;
    }
    /**
     * Setter de Sexo
     * @param sexo atribui o Sexo do Discípulo
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    /**
     * Getter de Enderecos
     * @return Endereços físicos do Discípulo
     */
    public List<Endereco> getEnderecos() {
        return enderecos;
    }
    /**
     * Setter de Enderecos
     * @param enderecos atribui a lista de Endereços do Discípulo
     */
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    /**
     * Getter de status
     * @return Status do Discípulo, que pode ser:
     * <ul>
     *      <li>Visitante</li>
     *      <li>Novo Discípulo</li>
     *      <li>Discípulo</li>
     *      <li>Líder de Célula</li>
     *      <li>Doze</li>
     * </ul>
     */
    public String getStatus() {
        return status;
    }
    /**
     * Setter de status
     * @param status atribui o status do Discípulo, que pode ser:
     * <ul>
     *      <li>Visitante</li>
     *      <li>Novo Discípulo</li>
     *      <li>Discípulo</li>
     *      <li>Líder de Célula</li>
     *      <li>Doze</li>
     * </ul>

     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Construtor padrão de Discípulo.
     */
    public Discipulo() {
    }
    /**
     * Construtor completo de Discípulo, para atribuir todas as informações
     * @param nome atribui o nome do Discípulo
     * @param telefones atribui os números de telefone do Discípulo
     * @param emails atribui os endereços de e-mail do Discípulo
     * @param profissoes atribui os âmbitos profissionais do Discípulo
     * @param sexo atribui o Sexo do Discípulo
     * @param enderecos atribui a lista de endereços físicos do Discípulo
     * @param status atribui o status do Discípulo
     */
    public Discipulo(String nome, List<Telefone> telefones, List<Email> emails, List<Profissao> profissoes, Sexo sexo, List<Endereco> enderecos, String status) {
        this.nome = nome;
        this.telefones = telefones;
        this.emails = emails;
        this.profissoes = profissoes;
        this.sexo = sexo;
        this.enderecos = enderecos;
        this.status = status;
    }
    
}
