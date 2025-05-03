package br.com.maxxy.pasteis.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClienteDto {


    @JsonProperty("nome")
    private String nomeCliente;


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


}
