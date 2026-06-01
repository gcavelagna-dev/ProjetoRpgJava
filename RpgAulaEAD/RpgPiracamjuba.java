package RpgAulaEAD;

import java.util.Scanner;
import java.util.Random;

public class RpgPiracamjuba {
    public static void main (String[] args) {


        //while é um loop

        //Scanner
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();



        //Guerreiro - perso principal

        int hpGuerreiro = 150;
        int strGuerreiro = 20;

        //Guardião do Portão

        int hpGuardiaoDoPortao = 20;
        int strGuardiaoDoPortao = 10;

        try {
            System.out.println("Carregando Jogo");
            Thread.sleep(1000);

            System.out.println("...");
            Thread.sleep(1000);

            System.out.println("...");
            Thread.sleep(1000);

            System.out.println("...");


            System.out.println("---------------------------------------------------------------------");
            System.out.println("Escolha o seu personagem:");

            System.out.println("1-Guerreiro");

            System.out.println(" HP/Vida: 150\n" + " STR/Ataque: 20\n"); //\n quebra de linha

            System.out.println("2-coloocar depois\n");

            System.out.print("Digite para selecionar: ");

            int escolhaPersonagem = entrada.nextInt();//entrada é o scanner definido lá em cima

            if (escolhaPersonagem == 1) {
                System.out.println("Você escolheu o Guerreiro!");
                System.out.println("Vamos para essa aventura!!");
                System.out.println("...");

                Thread.sleep(4000);

                //começo da história

                System.out.println("Você acabou de acordar com muitos gritos do lado de fora de sua cabana.\n");
                System.out.println("1-Sair.");
                System.out.println("só aperte 1.");


                String escolhaSair = String.valueOf(entrada.nextBoolean());//entrada é o scanner definido lá em cima

                if (false) { //java tem que ter == para saber que vai ser igual
                    while (true) {
                        System.out.println("Você escolheu a opção 1.\n");
                        Thread.sleep(1000);
                    }

                }
            }
            System.out.println("Você saiu e corre perguntar para o aldeão mais próximo o que está acontecendo.\n");
            Thread.sleep(3000);
            System.out.println("Aldeão -- Agora é o nosso fim.");
            Thread.sleep(3000);
            System.out.println("O terrivel Gorgonzola chegou para acabar com nossa vila.");

            Thread.sleep(4000);
            System.out.println("\nEle trouxe vários de seus capangas.");

            System.out.println("O único jeito de acabar é derrotando Gorgonzola no topo da montanha.");
            Thread.sleep(5000);

            System.out.println("Ouça, você consegue fazer isso...");
            Thread.sleep(4000);

            System.out.println("Todos nós sabemos disso...");
            Thread.sleep(4000);

            System.out.println("Mas antes, derrote o Guardião da Porta.\n");
            Thread.sleep(4000);

            System.out.println("Parece que você vai ter que resolver isso sozinho.");
            Thread.sleep(4000);

            System.out.println("Sua espada está em sua cintura, coloque seu capacete para aventurar.\n");
            System.out.println("---------------------------------------------------------------------");
            Thread.sleep(5000);

            System.out.println("\nContinuando nossa história.");
            Thread.sleep(4000);
            System.out.println("Você caminha até o grande portão que leva para o vulcão. Mas, quem é aquele?\n");
            Thread.sleep(5000);
            System.out.println("Guardião da Porta -- Quem ousa vir enfrentar-me?");
            Thread.sleep(4000);
            System.out.println("Hora, senão um pequeno guerreiro, estou desapontado...\n");
            Thread.sleep(5000);
            System.out.println("Cai pra dentro.");
            System.out.println("---------------------------------------------------------------------");
            Thread.sleep(4000);

                        /*
                         ajuda está última conversa do chat Desenvolvimento RPG Java

                        fazer random e while para enquanto a vida do personagem dor 0> maior que zero
                         */



            System.out.println("Utilize '1' para opção de atacar e '2' para se defender.");
            Thread.sleep(4000);
            System.out.println("Seu HP é: +" + hpGuerreiro);
            System.out.println("Com Ataque de +" + strGuerreiro);
            Thread.sleep(4000);
            System.out.println("O HP do Guardião do portão é: +" + hpGuardiaoDoPortao);
            System.out.println("Com Ataque de +"+strGuardiaoDoPortao);
            Thread.sleep(4000);
            System.out.println("\n================");
            System.out.println("Você começa primeiro: ");
            System.out.println("1- Atacar.");
            System.out.println("2-Defender é inútil agora.");
            System.out.println("================");
            System.out.print("O que você deseja? ");

            int escolhaLuta = entrada.nextInt();

            if (escolhaLuta == 1) {

                int dado = gerador.nextInt(11);//11 para chegar de 0 - 10


                if (dado <= 3){
                    System.out.println("\nVocê girou o dado e tirou " + dado +".");
                    Thread.sleep(3000);
                    System.out.println("Você errou completamente o ataque...");
                    Thread.sleep(3000);
                    System.out.println("'Guardião do portão está com HP total de +" +hpGuardiaoDoPortao+"'");
                    Thread.sleep(4000);
                } else {
                    System.out.println("\nVocê tirou " + dado + ".");
                    Thread.sleep(2000);
                    System.out.println("Você acertou o Guardião da porta!");
                    Thread.sleep(3000);
                    hpGuardiaoDoPortao -= 20;
                }



            }  else if (escolhaLuta == 2){

                int dadoDefesa = gerador.nextInt(11);

                if (dadoDefesa <= 3 ) {
                    Thread.sleep(3000);
                    System.out.println("\nVocê tirou " + dadoDefesa +".");
                    System.out.println("Sua defesa não foi um sucesso...");
                    hpGuerreiro -=10;
                    Thread.sleep(3000);

                } else {
                    Thread.sleep(3000);
                    System.out.println("\nVocê tirou " + dadoDefesa +".");
                    System.out.println("Sua defesa foi um sucesso!!");


                }

            } else {
                System.out.println("Você tem que escolher entre 1 ou 2.");
            }

        } catch (InterruptedException e) {
            System.out.println("Erro de carregamento");
        }
    }
}
/*
Essa parte aqui ficou errada:

String escolhaSair = String.valueOf(entrada.nextBoolean());

porque você pediu pro jogador digitar:

1-Sair

O correto era simplesmente:

int escolhaSair = entrada.nextInt();

igual você tinha antes.

E isso aqui:

if (false)
E isso aqui:

while (true)

é loop infinito.

Ou seja:
o jogo vai imprimir:

Você escolheu a opção 1.

pra sempre.

Então amanhã, quando voltar:

remove o nextBoolean
remove o String.valueOf
remove o if(false)
remove o while(true)

e volta pro simples:

int escolhaSair = entrada.nextInt();

if (escolhaSair == 1) {

    // história aqui
}
 */