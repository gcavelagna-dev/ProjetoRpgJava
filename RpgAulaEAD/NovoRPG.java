package RpgAulaEAD;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Random;
import java.util.Scanner;

public class NovoRPG {

    static Random gerador = new Random();


    public static void linha() {
        System.out.println("=====================");
    }

    public static void pausa(int tempo) { //no (fica o tipo e o nome da variavel)
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            System.out.println("Erro na pausa.");
        }


    }

    public static int dado(int lados) { //dai chama o (dado)

        return gerador.nextInt(lados) + 1; // eu escolho 10, se fosse sem + 1, iria de 0 a 9

    }

    public static boolean ataqueAcertou() {
        int resultado = dado(10);


        return resultado >= 4;
        //se for maior que 4 acertou, coloca isso no if, o else é para não acertou

        /*
        exemplo
        if(ataqueAcertou()) {
            sout acertou
        else
            errou
         */
    }

    public static void statusJogador(int hp, int str) {

        pausa(1000);
        linha();
        System.out.println("Sua Vida é de +" + hp + "HP");
        pausa(1000);
        System.out.println("Seu ataque é de +" + str + "STR");
        linha();
        pausa(3000);
    }

    public static void statusBiggoron(int hp, int str) {
        pausa(1000);
        linha();
        System.out.println("A Vida de Biggoron é de +" + hp + "HP");
        pausa(1000);
        System.out.println("O ataque de Biggoron é de +" + str + "STR");
        linha();
        pausa(3000);
    }

    public static void statusMediggoron(int hp, int str) {
        pausa(1000);
        linha();
        System.out.println("A Vida de Mediggoron é de +" + hp + "HP");
        pausa(1000);
        System.out.println("O ataque de Meddigoron é de +" + str + "STR");
        linha();
        pausa(3000);
    }

    public static void statusVolvagia(int hp, int str) {
        pausa(1000);
        linha();
        System.out.println("A Vida de Volvagia é de +" + hp + "HP");
        pausa(1000);
        System.out.println("O ataque de Volvagia é de +" + str + "STR");
        linha();
        pausa(3000);
    }

    public static void menuBatalha() {


        linha();
        System.out.println("Escolha uma das opções:");
        linha();
        pausa(1000);
        System.out.println("1 - Atacar.");

        System.out.println("2 - Defender.");

        System.out.println("3 - Tomar poção(Em desenvolvimento)");
        linha();
        System.out.println("O que você deseja?");
        //não é bom colocar scanner senão vira uma criaçao de scanners


    }

    public static void pocao(int quantidade) {
      /*


        int pocaoDeVida = 45;
        hpGuerreiro += pocaoDeVida;

      */


    }

    public static void carregando() {

        pausa(500);
        System.out.println("Carregando Jogo");
        pausa(1000);

        System.out.println("...");
        pausa(1000);

        System.out.println("...");
        pausa(1000);

        System.out.println("...");
        pausa(1000);


    }

    public static void escolhaPersonagem() {

        linha();
        System.out.println("\nEscolha o seu personagem:");

        System.out.println("1-Guerreiro.");

        System.out.println(" HP/Vida: 180\n" + " STR/Ataque: 25\n"); //\n quebra de linha

        System.out.println("2-Mago De fogo.\n");

        System.out.print("Digite para selecionar: ");

    }

    public static void aoAcordarHistoria() {
        linha();
        System.out.println("\nVocê acabou de acordar com muitos gritos do lado de fora de sua cabana.\n");
        pausa(2000);
        linha();
        System.out.println("1 - Sair.");
        System.out.println("2 - Olhar pela janela");
        linha();


    }

    public static void historiaAldeao() {

        System.out.println("Você saiu e corre perguntar para o aldeão mais próximo o que está acontecendo.\n");
        pausa(3000);
        System.out.println("Aldeão -- Agora é o nosso fim.");
        pausa(1000);
        System.out.println("O terrível Volvagia chegou para acabar com nossa vila.");
        pausa(2000);
        System.out.println("\nEle trouxe vários de seus capangas.");
        pausa(2000);

        System.out.println("O único jeito de acabar é derrotando Volvagia no topo da montanha.");
        pausa(3000);

        System.out.println("Ouça, você consegue fazer isso...");
        pausa(2000);

        System.out.println("Todos nós sabemos disso...");
        pausa(2000);

        System.out.println("Mas antes, derrote o Guardião da Porta.\n");
        pausa(2000);
        System.out.println("Parece que você vai ter que resolver isso sozinho...");
        pausa(3000);

        System.out.println("Sua espada está em sua cintura, coloque seu capacete para aventurar.\n");
        pausa(3600);
        linha();
        pausa(500);

    }

    public static void historiaComecoBatalha() {

        linha();
        System.out.println("\nContinuando nossa história.");
        pausa(2000);
        System.out.println("Você caminha até o grande portão que leva para o vulcão. Mas, quem é aquele?\n");
        pausa(3000);
        System.out.println("\nBiggoron -- Quem ousa vir enfrentar-me?");
        pausa(4500);
        System.out.println("Hora, senão um pequeno guerreiro, estou desapontado...\n");
        pausa(2500);
        System.out.println("Cai pra dentro.");
        pausa(1000);
        linha();

    }

    public static void rolandoDado() {
        pausa(1000);
        System.out.println("Rolando o dado...");
        pausa(2000);
        System.out.println("...");
        pausa(2000);
    }

    public static void voceAcertouAtaque() {

        pausa(1800);
        linha();
        System.out.println("Você acertou o ataque!!");
        linha();
        pausa(1000);

    }


    //----------------------------main-----------------------------\\


    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int hpGuerreiro = 180;
        int strGuerreiro = 25;
        // statusJogador(hpGuerreiro, strGuerreiro);

        //1°inimigo
        int hpBiggoron = 100;
        int strBiggoron = 10;
        //statusBiggoron(hpBiggoron, strBiggoron);

        //2°inimigo
        int hpMediggoron = 120;
        int strMediggoron = 15;
        //statusMediggoron(hpMediggoron, strMediggoron);

        //boss final
        int hpVolvagia = 200;
        int strVolvagia = 30;
        // statusVolvagia(hpVolvagia, strVolvagia);

        carregando();
        escolhaPersonagem();

        boolean escolhendoPersonagem = true;

        while (escolhendoPersonagem) {
            int escolhaPersonagem = entrada.nextInt();
            switch (escolhaPersonagem) {
                case 1:

                    System.out.println("Você escolheu Guerreiro!");
                    pausa(2000);
                    System.out.println("Vamos para essa aventura!!");
                    pausa(2000);
                    escolhendoPersonagem = false;
                    break;

                case 2:

                    System.out.println("Ainda não existe este personagem");
                    break;

                default:

                    System.out.println("Não existe esta opção");
                    break;
            }
        }
        //Continuar aqui

        boolean escolhaCabana = true;

        aoAcordarHistoria();

        while (escolhaCabana) {

            int escolhendoCabana = entrada.nextInt();


            switch (escolhendoCabana) {
                case 2:

                    System.out.println("\nVocê escolheu a opção 2.\n");
                    pausa(1000);

                    linha();
                    System.out.println("\nVocê levanta da cama e olha todo o vilarejo em fogo...");
                    pausa(2000);
                    System.out.println("\nVocê voltou para perto da cama.");
                    linha();
                    pausa(2000);
                    break;

                case 1:

                    pausa(1000);
                    System.out.println("Você escolheu a opção 1.\n");

                    pausa(500);
                    System.out.println("\n");
                    escolhaCabana = false;
                    break;

                default:

                    System.out.println("Não existe esta opção...");
                    break;
            }
        }

        historiaAldeao();
        carregando();

        historiaComecoBatalha();


        while (hpGuerreiro > 0 && hpBiggoron > 0) {
            //               textos
            statusJogador(hpGuerreiro, strGuerreiro);
            statusBiggoron(hpBiggoron, strBiggoron);
            menuBatalha();
            int resultadoDado = dado(10);
            int escolhaLuta = entrada.nextInt();

            if (escolhaLuta == 1) {


                rolandoDado();

                System.out.println("O dado caiu em: " + resultadoDado);

                if (resultadoDado >= 4) {
                    pausa(1000);
                    linha();
                    System.out.println("Você acertou o ataque!!");
                    pausa(1000);
                    System.out.println("HP restante do Biggoron: " + hpBiggoron);
                    linha();
                    hpBiggoron -= strGuerreiro;

                } else System.out.println("Você errou completamente o ataque...");

            } else if (escolhaLuta == 2) {

                rolandoDado();
                System.out.println("O dado caiu em: " + resultadoDado);

                if (resultadoDado >= 4) {
                    pausa(1000);
                    linha();
                    System.out.println("Você Conseguiu se defender!!");
                    pausa(1000);
                    System.out.println("Biggoron não irá conseguir acertar o próximo ataque.");
                    linha();


                } else System.out.println("Você não se defendeu e Biggoron te deu uma voadora...");
                hpGuerreiro -= strBiggoron;


            } else if (escolhaLuta == 3) {
                linha();
                System.out.println("Ainda não tem esta opção.");
                linha();
                continue;


            } else {
                linha();
                System.out.println("Não existe essa opção.");
                linha();

                continue; //faz voltar para o while

            }
            //         vez de biggoron         \\
            if (resultadoDado >=4) {

                linha();
                System.out.println("\nAgora é a vez de Biggoron!!");
                linha();

                rolandoDado();
                System.out.println("O dado caiu em: " + resultadoDado);
                pausa(1500);
                linha();
                System.out.println("Biggoron prepara seu soco estrondoso e acerta em cheio na sua cara.");
                pausa(3000);
                System.out.println("Você cai, mas logo levanta novamente.");
                linha();
                hpGuerreiro -= strBiggoron;

            }
            if (hpBiggoron <= 0) {
                pausa(2000);
                linha();
                System.out.println("Biggoron foi derrotado...");
                pausa(2000);
                System.out.println("Ele cai lentamente até suas costas caírem sobre o chão.");
                linha();
                pausa(3000);
                break;

            }
        }


        entrada.close();
        //entrada.close fica lá no fim
    }

    //fazer usando switch, novos métodos e entrada.close();

}
