package br.com.maxxy.pasteis.dtos;

import javax.validation.constraints.NotBlank;

public class AnimalDto {


    private int id;

    @NotBlank
    private String nome;

    @NotBlank
    private String raca;

    private String cor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
