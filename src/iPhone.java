public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar() {
        System.out.println("Tocando música....");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        //Testando reprodutor musical
        iphone.tocar();
        iphone.selecionarMusica("Minha Música Favorita");
        iphone.pausar();

        //Testando o aparelho telefônico
        iphone.ligar("999999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Testando o navegador de internet
        iphone.exibirPagina("www.google.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        
    }

}
