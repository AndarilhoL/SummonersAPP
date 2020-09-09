package com.example.summonersapp.model;


import android.graphics.Bitmap;

public class Pessoa {
    private int imagem;
    private String nome;
    private int funcao;
    private int elo;

    public Pessoa(){
    }

    public Pessoa(int imagem, String nome, int funcao, int elo) {
        this.imagem = imagem;
        this.nome = nome;
        this.funcao = funcao;
        this.elo = elo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }
}
