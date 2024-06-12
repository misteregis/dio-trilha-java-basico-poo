

import controller.IPhone;

public class Main {
    public static void main(String[] args) throws Exception {
        IPhone meuIPhone = new IPhone();

        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");

        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        meuIPhone.exibirPagina("www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
