package org.Thonwelling;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("IPhone 2G", 2007);
        System.out.println("Modelo:  " + iphone.getModelo());
        System.out.println("Ano de lançamento:  " + iphone.getAnoLancamento());
        System.out.println("----------------------------------------------------");

        // Reprodutor musical
        iphone.selecionarMusica("A Bondade de Deus");
        iphone.tocar();
        iphone.pausar();
        System.out.println("----------------------------------------------------");

        // Aparelho telefônico
        iphone.ligar("(11) 99999-9999");
        iphone.atender();
        iphone.iniciarCorreiroVoz();
        System.out.println("----------------------------------------------------");

        // Navegador na internet
        iphone.exibirPagina("https://www.google.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}