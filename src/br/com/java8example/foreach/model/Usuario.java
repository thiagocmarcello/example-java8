package br.com.java8example.foreach.model;

/**
 * Created by thiago on 18/01/16.
 */
public class Usuario {

    private String nome;
    private Integer idade;
    private boolean ativo;

    public Usuario(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
