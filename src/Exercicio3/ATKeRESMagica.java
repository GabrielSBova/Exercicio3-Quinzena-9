package Exercicio3;

import java.util.Scanner;

public class ATKeRESMagica extends Criacao implements Personagem {

    Scanner leitor = new Scanner(System.in);
    private int escolha;

    @Override
    public void modelarPersonagem() {

        System.out.println("Você pode distribuir pontos extras entre os 2 atributos mágicos conforme as opções abaixo: " +
                "\n[ 1 ] 50 Pontos para ATK.Mágico & 50 pontos para Resist.Mágica" +
                "\n[ 2 ] 50 Pontos para ATK.Mágico & 70 pontos para Resist.Mágica" +
                "\n[ 3 ] 70 Pontos para ATK.Mágico & 50 pontos para Resist.Mágica");
        escolha = leitor.nextInt();
    }

    @Override
    public void ajustarAtributos() {

        if (escolha == 1) {
            setAtkMagico(200 + 50);
            setResistMagica(200 + 50);
        }
        else if (escolha == 2){
            setAtkMagico(200 + 50);
            setResistMagica(200 + 70);
        }
        else{
            setAtkMagico(200 + 70);
            setResistMagica(200 + 50);
        }
    }

    public void atributos(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-= Atributos mágicos -=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Ataque mágico: " + getAtkMagico());
        System.out.println("Resistência Mágica: " + getResistMagica());
    }
}
