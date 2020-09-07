package com.example.summonersapp.model;


import android.graphics.Bitmap;

public class Pessoa {
    private int imagem;
    private String nome;
    private String funcao;

    public Pessoa(){
    }

    public Pessoa(int imagem,String nome, String funcao) {
        this.imagem = imagem;
        this.nome = nome;
        this.funcao = funcao;
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
