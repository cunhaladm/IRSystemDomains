/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains;

import java.time.LocalDate;
import java.util.*;

/**
 * Classe representativa do relatorio de uma célula
 * @author Luke Frozz
 * @since 25/08/2015
 */
public class RelatorioCelula {
    /**
     * Data da célula
     */
    private LocalDate data;
    /**
     * Lista de discípulos da Célula
     */
    private List<RelatorioDiscipulo> RelatorioDiscipulos;
    
    /**
     * Getter de data
     * @return Data da célula
     */
    public LocalDate getData() {
        return data;
    }
    /**
     * Setter de Data
     * @param data atribui a data da célula
     */
    public void setData(LocalDate data) {
        this.data = data;
    }
    /**
     * Getter de relatorioDiscipulos
     * @return Discípulos do Relatorio
     */
    public List<RelatorioDiscipulo> getRelatorioDiscipulos() {
        return RelatorioDiscipulos;
    }
    /**
     * setter de relatorioDiscipulos
     * @param RelatorioDiscipulos atribui os discípulos do relatorio
     */
    public void setRelatorioDiscipulos(List<RelatorioDiscipulo> RelatorioDiscipulos) {
        this.RelatorioDiscipulos = RelatorioDiscipulos;
    }
    /**
     * Construtor padrão de RelatorioCelula
     */
    public RelatorioCelula() {
    }
    /**
     * Construtor completo de RelatorioCelula
     * @param data atribui a data do Relatorio
     * @param RelatorioDiscipulos atribui os discipulos do Relatorio
     */
    public RelatorioCelula(LocalDate data, List<RelatorioDiscipulo> RelatorioDiscipulos) {
        this.data = data;
        this.RelatorioDiscipulos = RelatorioDiscipulos;
    }
    
}
