package RpgAulaEAD;

import java.util.Random;
import java.util.Scanner;

public class NovoRPG {

    static Random gerador = new Random();

    public static void analisando() {

        System.out.println("\nAnalisando...");
        pausa(500);
        System.out.println("...");
        pausa(500);
        System.out.println("...\n");
        pausa(500);
    }


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

    public static void statusJogador(int hp, int str, int pocoes) {

        pausa(1000);
        linha();
        System.out.println("Sua Vida é de +" + hp + "HP");
        pausa(1000);
        System.out.println("Seu ataque é de +" + str + "STR");
        pausa(1000);
        System.out.println("Você tem " + pocoes + " poções.");
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

        System.out.println("3 - Tomar poção");
        linha();
        System.out.println("O que você deseja?");
        //não é bom colocar scanner senão vira uma criaçao de scanners


    }

    public static int pocao(int hpAtual, int quantidadePocoes) {

        if (quantidadePocoes > 0) {
            int cura = 45;
            int novoHp = hpAtual + cura;
            linha();
            System.out.println("Você tomou uma poção de vida!");
            System.out.println("Recuperou +" + cura + " HP.");
            System.out.println("HP atual: " + novoHp);
            linha();
            pausa(4000);
            return novoHp;
        } else {
            linha();
            System.out.println("Você não tem poções restantes!");
            linha();
            pausa(2000);
            return hpAtual;
        }


    }

    public static void carregando() {

        pausa(500);
        System.out.println("\nCarregando Jogo");
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
        System.out.println("Ora, senão um pequeno guerreiro, estou desapontado...\n");
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

    public static void derrotaBigorron() {

        carregando();
        linha();
        System.out.println("Biggoron -- Parece que você me derrotou garoto, meus parabéns...");
        pausa(3000);
        System.out.println("Minhas últimas palavra será...");
        pausa(2000);
        System.out.println("Vença Volvagia...");
        pausa(4000);
        linha();

        System.out.println("\nMeus parabéns! Você derrotou seu 1° inimigo.");
        pausa(2000);

    }

    public static void continuacaoHistoria() {

        carregando();

        linha();
        System.out.println("Pronto, tudo parece resolvido no momento, mas lamento te dizer...");
        pausa(2500);
        System.out.println("O vilarejo ainda está um caos, e além disso, Biggoron derrubou uma chave quando morreu. ");
        pausa(3000);
        System.out.println("--Você pegou a chave e começou à caminhar na trilha que estava atrás de Biggoron--.");
        pausa(3000);
        System.out.println("Você chega ao pé do vulcão e encontra uma grande porta, você nem viu, mas já colocou a chave na porta");
        pausa(3000);
        System.out.println("Abrindo ela lentamente você vê outro caminho, mas espera, não há só um, mas sim 3 caminhos diferentes.");
        pausa(4000);
        System.out.println("Qual dos caminhos você deseja?");
        pausa(2000);
        linha();
        System.out.println("1 - Caminho da esquerda.");
        System.out.println("2 - Caminho do meio.");
        System.out.println("2 - Caminho da direita.");
        linha();
        System.out.println("O que você deseja?");

    }

   /*
    public static int opcaoLuta(Scanner entrada){


    }
 */

    //----------------------------main-----------------------------\\


    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int hpGuerreiro = 180;
        int strGuerreiro = 25;
        int pocoesGuerreiro = 1;
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


        while (true) {
            int escolhaPersonagem = entrada.nextInt();
            analisando();
            switch (escolhaPersonagem) {
                case 1:

                    System.out.println("Você escolheu Guerreiro!");
                    pausa(2000);
                    System.out.println("Vamos para essa aventura!!");
                    pausa(2000);
                    break;

                case 2:

                    System.out.println("Ainda não existe este personagem");
                    continue;

                default:

                    System.out.println("Não existe esta opção, tente novamente");
                    continue;
            }
            break;
        }
        //Continuar aqui


        linha();
        System.out.println("\nVocê acabou de acordar com muitos gritos do lado de fora de sua cabana.\n");
        pausa(2000);
        linha();

        while (true) {//dava para trocar por true

            aoAcordarHistoria();
            int escolhendoCabana = entrada.nextInt();
            analisando();

            switch (escolhendoCabana) {


                case 1:

                    pausa(1000);
                    System.out.println("Você escolheu a opção 1.\n");

                    pausa(500);
                    System.out.println("\n");
                    break;

                case 2:

                    System.out.println("\nVocê escolheu a opção 2.\n");
                    pausa(1000);
                    linha();
                    System.out.println("\nVocê levanta da cama e olha todo o vilarejo em fogo...");
                    pausa(2000);
                    System.out.println("\nVocê voltou para perto da cama.");
                    linha();
                    pausa(2000);
                    continue;
                default:

                    System.out.println("Não existe esta opção, tente novamente");
                    continue;
            }
            break;
        }

        historiaAldeao();
        carregando();

        historiaComecoBatalha();


        while (hpGuerreiro > 0 && hpBiggoron > 0) {
            //               textos
            statusJogador(hpGuerreiro, strGuerreiro, pocoesGuerreiro);
            statusBiggoron(hpBiggoron, strBiggoron);
            menuBatalha();
            int resultadoDado = dado(10);
            int escolhaLuta = entrada.nextInt();
            analisando();

            switch (escolhaLuta) {
                case 1:
                    rolandoDado();
                    System.out.println("O dado caiu em: " + resultadoDado);

                    if (resultadoDado >= 4) {

                        pausa(1000);
                        linha();
                        System.out.println("Você acertou o ataque!!");
                        pausa(1000);
                        hpBiggoron -= strGuerreiro;
                        System.out.println("HP restante do Biggoron: " + hpBiggoron);
                        linha();

                    } else {
                        hpGuerreiro -= strBiggoron;
                        System.out.println("Você errou o ataque, você perdeu " + strBiggoron + " de HP.");
                    }
                    break;
                case 2:
                    rolandoDado();
                    System.out.println("O dado caiu em: " + resultadoDado);

                    if (resultadoDado >= 4) {
                        pausa(1000);
                        linha();
                        System.out.println("Você Conseguiu se defender!!");
                        pausa(1000);
                        System.out.println("Biggoron não irá conseguir acertar o próximo ataque.");
                        linha();
                    } else {
                        hpGuerreiro -= strBiggoron;
                        System.out.println("Você não se defendeu e Biggoron te deu uma voadora...");
                    }
                    break;
                case 3:

                    if (pocoesGuerreiro > 0) {
                        hpGuerreiro = pocao(hpGuerreiro, pocoesGuerreiro);
                        pocoesGuerreiro--;
                        break;
                    }
                default:
                    System.out.println("Não tem essa opção, tente novamente.");
                    continue;
            }//fim switch


            int dadoBiggoron = dado(10);

            linha();
            System.out.println("Agora é o turno de Biggoron!!!");
            linha();
            pausa(2000);
            rolandoDado();
            System.out.println("O dado de Biggoron caiu em " + dadoBiggoron);

            if (dadoBiggoron < 4) {

                hpBiggoron -= strGuerreiro;
                System.out.println("Biggoron errou completamente o ataque...");
                linha();

            } else {
                hpGuerreiro -= strBiggoron;
                System.out.println("\nBiggoron acertou completamente o ataque e ele retirou " + strBiggoron + " de seu HP.");
            }

            break;

        }//fim while

        derrotaBigorron();
        System.out.println("Seu HP atual é de " + hpGuerreiro);

        continuacaoHistoria();


        while (true) {

            int qualCaminho = entrada.nextInt();
            analisando();

            switch (qualCaminho) {

                case 1:

                    System.out.println("Você foi pelo caminho da esquerda, mas uma pedra caiu em usa cabeça enquanto caminhava");
                    pausa(5000);
                    hpGuerreiro -= 5;
                    break;

                case 2:

                    System.out.println("Você foi pelo caminho do meio, nada aconteceu enquanto você caminhava.");
                    pausa(3000);
                    break;
                case 3:

                    pocoesGuerreiro += 1;
                    System.out.println("Você encontrou uma poção enquanto caminhava!");
                    pausa(2000);
                    System.out.println("Você ganhou "+ pocoesGuerreiro+ " poção de cura.");
                    pausa(2000);
                    break;

                default:
                    System.out.println("Não existe esta escolha, tente novamente.");
                    continue;
            }

            break;
        }


        //                      final                        \\
        if (hpGuerreiro <= 0) { //jogador morrer
            System.out.println("Você perdeu, mas não desista, guerreiro...");
            System.exit(0);
        }

        entrada.close();
        //entrada.close fica lá no fim
    }

    //fazer usando switch, novos métodos e entrada.close();

}