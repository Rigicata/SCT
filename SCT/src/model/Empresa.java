/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Empresa extends Entidade {
    private String cnpj;
    private String nomefantasia;
    private String ramoempresa;

    public String getRamoempresa() {
        return this.ramoempresa;
    }

    public void setRamoempresa(String ramoempresa) {
        this.ramoempresa = ramoempresa;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomefantasia() {
        return this.nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }
    
}
