public class Personagem {

    /*
    DECLARANDO AS VARIÁVEIS RELACIONADAS AOS PERSONAAGENS DO JOGO
    */
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    /*
    CRIANDO MEU METODO CONSTRUTOR "Personagem"
     */

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    /* 
    CRIANDO METODO DE EXIBIÇÃO DO STATUS DOS PERSONAGENS CRIADOS
    */

    public void exibirStatus() {
        System.out.println("\n--- Status do Personagem ---");
        System.out.println("Nome............: " + nome);
        System.out.println("Classe..........: " + classe);
        System.out.println("Nível...........: " + nivel);
        System.out.println("Pontos de vida..: " + pontosDeVida);
        System.out.println("Poder base......: " + poderBase);
    }
}

