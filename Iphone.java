public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // AparelhoTelefonico

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando pro número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio voz...");

    }

    // NavegadorInternet

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página...");
    }
}
