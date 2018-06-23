package com.senai.ivoluteer.model;

import java.io.Serializable;

public class CursoDto implements Serializable{

    private long codigo;
    private String curosNome;
    private String turma;

    public CursoDto() {
    }

    public CursoDto(long codigo, String curosNome, String turma) {
        this.codigo = codigo;
        this.curosNome = curosNome;
        this.turma = turma;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getCurosNome() {
        return curosNome;
    }

    public void setCurosNome(String curosNome) {
        this.curosNome = curosNome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
