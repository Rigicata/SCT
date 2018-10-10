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
public class Contrato {
    private int id;
    private String diaincial;
    private String diafinal;
    private String horariofinal;
    private String horarioinicial;
    private String localizacao;
    private String tipo;
    private String clausula;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getClausula() {
        return this.clausula;
    }

    public void setClausula(String clausula) {
        this.clausula = clausula;
    }

   
    public String getDiaincial() {
        return this.diaincial;
    }

    public void setDiaincial(String diaincial) {
        this.diaincial = diaincial;
    }

    public String getDiafinal() {
        return this.diafinal;
    }

    public void setDiafinal(String diafinal) {
        this.diafinal = diafinal;
    }

    public String getHorariofinal() {
        return this.horariofinal;
    }

    public void setHorariofinal(String horariofinal) {
        this.horariofinal = horariofinal;
    }

    public String getHorarioinicial() {
        return this.horarioinicial;
    }

    public void setHorarioinicial(String horarioinicial) {
        this.horarioinicial = horarioinicial;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
