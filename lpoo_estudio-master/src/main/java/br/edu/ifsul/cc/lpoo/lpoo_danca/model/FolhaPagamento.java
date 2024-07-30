/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 20221PF.CC0003
 */

@Entity
public class FolhaPagamento implements Serializable{
 
    @Id
    private Integer numeroPag;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar data;
    
    @Column(nullable = false, precision = 10, scale = 2)
    private Double valorReceber;
    
    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professores professor;

    
    public FolhaPagamento() {
    }

    public FolhaPagamento(Integer numeroPag, Calendar data, Double valorReceber, Professores professor) {
        this.numeroPag = numeroPag;
        this.data = data;
        this.valorReceber = valorReceber;
        this.professor = professor;
    }

    public void setNumeroPag(Integer numeroPag) {
        this.numeroPag = numeroPag;
    }

    public Integer getNumeroPag() {
        return numeroPag;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }

    public Professores getProfessor() {
        return professor;
    }

    

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Double getValorReceber() {
        return valorReceber;
    }

    public void setValorReceber(Double valorReceber) {
        this.valorReceber = valorReceber;
    }
    
   // private EntityManager entityManager;
    
    /*
    public Double calcularFolhaPagamento(int mes, int ano, Long professorId) {
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("calcularFolhaPagamento");

        // Registro dos parâmetros de entrada e saída da função
        query.registerStoredProcedureParameter("mes", Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("ano", Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("prof_id", Long.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("total_valores", Double.class, ParameterMode.OUT);

        // Definição dos valores dos parâmetros de entrada
        query.setParameter("mes", mes);
        query.setParameter("ano", ano);
        query.setParameter("prof_id", professorId);

        // Execução da consulta
        query.execute();

        // Obtenção do valor de retorno da função
        Double totalValores = (Double) query.getOutputParameterValue("total_valores");

        return totalValores;
    }
*/
    
    
}
