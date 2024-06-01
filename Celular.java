public class Celular {
    public static void main(String[] args) {
        // Instância do iphone que está sendo testado
        Iphone iphone2007 = new Iphone();
        // Métodos do reprodutor musical
        iphone2007.tocar();
        iphone2007.pausar();
        iphone2007.selecionarMusica("Paper rings");
        // Métodos do aparelho telefonico
        iphone2007.ligar("8900027892");
        iphone2007.atender();
        iphone2007.iniciarCorreioVoz();
        // Métodos do navegador de internet
        iphone2007.exibirPagina("google.com");
        iphone2007.adicionarNovaAba();
        iphone2007.atualizarPagina();
    }
}
