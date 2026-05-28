public class Main {
    public static void main(String[] args) {

        /*
        DECLARANDO NOVOS PERSONAGENS PARA O JOGO
         */

        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 15.0);
        Personagem heroi2 = new Personagem("Merlin", "Mago", 3, 130, 50.0);
        Personagem heroi3 = new Personagem("Lagertha", "Valkyria", 5, 150, 75.0);

        /*
        CHAMANDO O MÉTODO DE EXIBIÇÃO DA CLASSE "Personagem"
        */

        heroi1.exibirStatus();
        heroi2.exibirStatus();
        heroi3.exibirStatus();
    }
}
