/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains;

/**
 * classe representativa da presença da célula
 * em um relatório de célula
 * @author Luke Frozz
 * @since 25/08/2015
 */
public class RelatorioDiscipulo {
    /**
     * Discípulo do relatório
     */
    private Discipulo discipulo;
    /**
     * status do relatório onde
     * <ul>
     *      <li> <b>true</b> - presente </li>
     *      <li> <b>false</b> - ausente </li>
     * </ul>
     */
    private boolean status;

    /**
     * Getter de Discípulo
     * @return Discípulo da lista de presença
     */
    public Discipulo getDiscipulo() {
        return discipulo;
    }
    /**
     * Setter de Discípulo
     * @param discipulo atribui o Discípulo da lista
     */
    public void setDiscipulo(Discipulo discipulo) {
        this.discipulo = discipulo;
    }
    /**
     * Getter de Status
     * @return Status do Discípulo
     */
    public boolean isStatus() {
        return status;
    }
    /**
     * Setter de Status
     * @param status atribui o Status do Discípulo onde:
     * <ul>
     *      <li> <b>true</b> - presente </li>
     *      <li> <b>false</b> - ausente </li>
     * </ul>
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    /**
     * Construtor padrão de RelatorioDiscipulo
     */
    public RelatorioDiscipulo() {
    }
    /**
     * Construtor completo de RelatorioDiscipulo 
     * @param discipulo atribui o Discípulo do Relatório
     * @param status atribui o Status do Relatório onde:
     * <ul>
     *      <li> <b>true</b> - presente </li>
     *      <li> <b>false</b> - ausente </li>
     * </ul>
     */
    public RelatorioDiscipulo(Discipulo discipulo, boolean status) {
        this.discipulo = discipulo;
        this.status = status;
    }
    
    
}
