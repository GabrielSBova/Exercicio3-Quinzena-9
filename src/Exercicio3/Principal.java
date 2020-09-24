package Exercicio3;

public class Principal {

    public static void main(String[] args) {

        Criacao c = new Criacao();
        ATKeRESMagica ar = new ATKeRESMagica();

        System.out.println("Bem vindo. aqui você pode montar seu personagem com sua preferência.");
        System.out.println("Existem os atributos força, dano físico, dano mágico, ataque mágico e resistência mágica.");
        System.out.println("O dano físico e dano mágico inicia-se com 100 pontos. ");
        System.out.println("O ataque e resistência mágica inicia-se com 200 pontos. ");
        System.out.println("Os atributos podem mudar dependendo da escolha que você fizer daqui pra frente.");
        c.modelarPersonagem();
        c.ajustarAtributos();
        c.exibirDados();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        ar.modelarPersonagem();
        ar.ajustarAtributos();
        ar.atributos();
    }
}
