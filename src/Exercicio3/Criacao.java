package Exercicio3;

import java.util.Scanner;

public class Criacao extends Informacao implements Personagem {

    private int danoFisFinal;
    private double danoMagFinal;
    private int atkMagico;
    private double resistMagica;


    public int getAtkMagico() {
        return atkMagico;
    }

    public void setAtkMagico(int atkMagico) {
        this.atkMagico = atkMagico;
    }

    public double getResistMagica() {
        return resistMagica;
    }

    public void setResistMagica(double resistMagica) {
        this.resistMagica = resistMagica;
    }

    public void calcular(int atkInicial, int atkAdicional){
        danoFisFinal = atkInicial + atkAdicional;
    }

    public void calcular(double magiaInicial, double magiaAdicional){
        danoMagFinal = magiaInicial + magiaAdicional;
    }

    @Override
    public void modelarPersonagem() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\nDigite o nome do seu personagem: ");
        nomePers = leitor.next();

        System.out.println("Escolha a classe:" +
                "\n[ L ] Lutador" +
                "\n[ M ] Mago" +
                "\n[ A ] Anão" +
                "\n[ AS ] Assassino");
        classe = leitor.next();

        if (!classe.equals("L") && !classe.equals("M") & !classe.equals("A") && !classe.equals("AS")){
            do{
                System.out.println("Parâmetro incorreto. Digite L, M, A ou AS (Maiúsculas): ");
                classe = leitor.next();
            }while (!classe.equals("L") && !classe.equals("M") & !classe.equals("A") && !classe.equals("AS"));
        }

        switch (classe) {
            case "L":
                classe = "Lutador";
                break;
            case "M":
                classe = "Mago";
                break;
            case "A":
                classe = "Anão";
                break;
            default:
                classe = "Assassino";
                break;

        }

        System.out.println("Escolha um dos 4 elementos" +
                "\n[ T ] Terra" +
                "\n[ F ] Fogo" +
                "\n[ A ] Água" +
                "\n[ AR ] Ar");
        elemDominante = leitor.next();

        if (!elemDominante.equals("T") && !elemDominante.equals("F") & !elemDominante.equals("A") && !elemDominante.equals("AR")){
            do{
                System.out.println("Parâmetro incorreto. Digite T, F, A ou AR (Maiúsculas): ");
                elemDominante = leitor.next();
            }while (!elemDominante.equals("T") && !elemDominante.equals("F") & !elemDominante.equals("A") && !elemDominante.equals("AR"));
        }

        switch (elemDominante) {
            case "T":
                elemDominante = "Terra";
                break;
            case "F":
                elemDominante = "Fogo";
                break;
            case "A":
                elemDominante = "Água";
                break;
            default:
                elemDominante = "Ar";
                break;
        }

        System.out.println("Escolha a arma" +
                "\n[ M ] Machado" +
                "\n[ E ] Espada" +
                "\n[ F ] Foice" +
                "\n[ C ] Cajado" +
                "\n[ P ] Pistola");
        arma = leitor.next();

        if (!arma.equals("M") && !arma.equals("E") && !arma.equals("F") && !arma.equals("C") && !arma.equals("P")){
            do{
                System.out.println("Parâmetro incorreto. Digite M, E, F, C ou P (Maiúsculas): ");
                arma = leitor.next();
            }while (!arma.equals("M") && !arma.equals("E") && !arma.equals("F") && !arma.equals("C") && !arma.equals("P"));

        }
        switch (arma){
            case "M":
                arma = "Machado";
                break;
            case "E":
                arma = "Espada";
                break;
            case "F":
                arma = "Foice";
                break;
            case "C":
                arma = "Cajado";
                break;
            default:
                arma = "Pistola";
                break;
        }

        System.out.println("Escolha o nível de força do seu personagem: " +
                "\n[ 1 ] 100 pontos" +
                "\n[ 2 ] 150 pontos" +
                "\n[ 3 ] 200 pontos" +
                "\n[ 4 ] 300 pontos");
        forca = leitor.nextInt();

        if (forca != 1 && forca != 2 && forca != 3 && forca != 4){
            do{
                System.out.println("Parâmetro incorreto. Digite 1, 2, 3 ou 4: ");
                forca = leitor.nextInt();
            }while (forca != 1 && forca != 2 && forca != 3 && forca != 4);
        }

        switch (forca){
            case 1:
                forca = 100;
                break;
            case 2:
                forca = 150;
                break;
            case 3:
                forca = 200;
                break;
            default:
                forca = 300;
                break;
        }

        System.out.println("Qual o país de origem do seu personagem? ");
        origem = leitor.next();
    }


    @Override
    public void ajustarAtributos() {
        double magiaAdicional;
        int atkAdicional;
        double magiaInicial;
        int atkInicial;
        if (classe.equals("Mago") && arma.equals("Cajado")){
                System.out.println("Magos com cajado tem dano mágico aumentado em 200 pontos");
                atkInicial = 100;
                atkAdicional = 0;
                magiaInicial = 100;
                magiaAdicional = 200;
                calcular(atkInicial, atkAdicional);
                calcular(magiaInicial, magiaAdicional);
            }
            else if (classe.equals("Lutador") && arma.equals("Machado") || classe.equals("Lutador") && arma.equals("Espada")){
                System.out.println("Lutadores com machado ou espada tem dano físico aumentado em 150 pontos");
                atkInicial = 100;
                atkAdicional = 150;
                magiaInicial = 100;
                magiaAdicional = 0;
                calcular(atkInicial, atkAdicional);
                calcular(magiaInicial, magiaAdicional);
            }
            else if (classe.equals("Assassino") && arma.equals("Foice") || classe.equals("Assassino") && arma.equals("Pistola")){
                System.out.println("Assassinos com foice ou machado tem dano físico aumentado em 200 pontos");
                atkInicial = 100;
                atkAdicional = 200;
                magiaInicial = 100;
                magiaAdicional = 0;
                calcular(atkInicial, atkAdicional);
                calcular(magiaInicial, magiaAdicional);
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-= Informações do personagem -=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Nome do personagem: " + nomePers);
        System.out.println("Classe: " + classe);
        System.out.println("Elemento dominante: " + elemDominante);
        System.out.println("Arma: " + arma);
        System.out.println("Força total: " + forca);
        System.out.println("Origem: " + origem);
        System.out.println("Dano físico: " + danoFisFinal);
        System.out.println("Dano mágico: " + danoMagFinal);

    }
}
