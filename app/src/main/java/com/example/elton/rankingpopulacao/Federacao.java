package com.example.elton.rankingpopulacao;

public class Federacao{
    public String nome;
    public int populacao;
    public int ano;
    public int bandeira;

    public Federacao(String nome, int populacao, int ano, int bandeira){
        this.nome = nome;
        this.populacao = populacao;
        this.ano = ano;
        this.bandeira = bandeira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getBandeira() {
        return bandeira;
    }

    public void setBandeira(int bandeira) {
        this.bandeira = bandeira;
    }
}