package com.senai.ivoluteer.model;

import java.io.Serializable;

public class TurmaDto implements Serializable{

    private long codigo;
    private String turmaNome;
    private String aluno;

    public TurmaDto() {
    }

    public TurmaDto(long codigo, String turmaNome, String aluno) {
        this.codigo = codigo;
        this.turmaNome = turmaNome;
        this.aluno = aluno;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTurmaNome() {
        return turmaNome;
    }

    public void setTurmaNome(String turmaNome) {
        this.turmaNome = turmaNome;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }
}
