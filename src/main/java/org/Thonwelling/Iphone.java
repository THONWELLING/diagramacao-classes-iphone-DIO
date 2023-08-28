package org.Thonwelling;

import org.Thonwelling.repositories.AparelhoTelefonico;
import org.Thonwelling.repositories.NavegadorInternet;
import org.Thonwelling.repositories.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private String modelo;
    private int anoLancamento;

    public Iphone(String modelo, int anoLancamento) {
        this.modelo = modelo;
        this.anoLancamento = anoLancamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Selecionando música: " + nomeMusica);
    }

    @Override
    public void ligar(String numeroTelefone) {
        System.out.println("Ligando para: " + numeroTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreiroVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

}
