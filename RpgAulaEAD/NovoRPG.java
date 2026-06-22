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
        pausa(1000);
        System.out.println("As chances de acertar com o poder da Espada Sagrada é menor, cuidado.");
        linha();
        pausa(4000);
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
        pausa(1000);
        System.out.println("Cuidado! Volvagia é um dragão de fogo!");
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

    public static void continuandoCaminho() {

        linha();
        pausa(1000);
        System.out.println("Pelo jeito, todos caminhos davam o mesmo resultado");
        pausa(3000);
        System.out.println("Mas enfim... Cá estamos para continuar está trilha.");
        pausa(3000);
        System.out.println("-- Passam 10 minutos caminhando--");
        pausa(3000);
        System.out.println("Você escura passos pesados e pela sombra parece ser alguém muito maior do que você.");
        pausa(5000);
        System.out.println("Você tenta se esconder, mas é percebido pelo grande caçador da montanha.");
        pausa(5000);
        System.out.println("??? - Quem está aí? Se você está aqui é porque você matou meu irmão na porta.");
        pausa(4000);
        System.out.println("Agora não tem escape.");
        carregando();

    }

    public static void derrotaMediggoron() {

        pausa(5000);
        linha();
        System.out.println("Parece que você derrotou ele...");
        pausa(5000);
        System.out.println("Mediggoron -- Chegue mais perto, tenho algo para lhe dizer...");
        pausa(4000);
        System.out.println("-- Você tem muito pela frente ainda... Peço que você impeça Volvagia de acabar com tudo.");
        pausa(4000);
        System.out.println("-- Mas, você não vai conseguir derrotar com tudo isso.");
        pausa(3000);
        System.out.println("-- Pegue isso. 1+ poção de cura.");
        pausa(2000);
        System.out.println("-- Também carreguei isso por minha vida toda, mas nunca consegui aprender corretamente...");
        pausa(4000);
        System.out.println("====VOCÊ CONSEGUIU UM LIVRO DE MAGIA====");
        pausa(2000);
        linha();
        carregando();

    }

    public static void continuadoHistoriaVulcao() {

        pausa(5000);
        System.out.println("\nVocê conseguiu este livro onde qualquer um pode aprender magia.");
        pausa(3000);
        System.out.println("Por algum motivo Mediggoron não conseguiu aprender, sorte sua.\n");
        pausa(3000);

        linha();                                //              skill aqui                \\
        System.out.println("Você aprendeu uma skill nova ==Espada Sagrada: Liberar==");
        pausa(3000);
        System.out.println("Essa skill faz com que você tire mais vantagem ao acertar um oponente, ela é poderosa, tome cuidado.");
        pausa(3000);
        System.out.println("Além disso, você usar este poder, seu HP diminuirá -20");
        linha();
        pausa(5000);

        carregando();
        System.out.println("Agora vamos nessa, pois temos que derrotar para conquistar nossa vila novamente.");
        linha();
        pausa(3000);
        carregando();
        System.out.println("\nAndando mais um pouco, você escuta gritos no topo da montanha, você corre até chegar ao topo.");
        pausa(3000);
        System.out.println("Chegando lá, você olha onde veio o som, mas se depara que o som é dentro do vulcão.");
        pausa(3000);
        System.out.println("Você nem pensa e já pula, mas quando chega ao solo quente e coberto de lava, você tenta achar uma superfície.");
        pausa(4000);
        System.out.println("Sentando um pouco para pensar o que aconteceu, você escuta o grito vindo de uma porta à tua frente.");
        pausa(4000);
        System.out.println("Você chega, encosta na porta e ela se abre, mas quando entra, não há ninguém, a não ser uma bela moça sendo rapitada por algo vermelho.");
        pausa(5000);
        System.out.println("Mas de repente essa coisa vermelha para e deixa a moça em cima de um lugar alto onde ninguém consegue descer ou subir.");
        pausa(3000);
        System.out.println("Aquela coisa vermelha começa a chegar perto de você, parece ter no mínimo 20m de altura...");
        pausa(4000);
        System.out.println("Boa sorte! Você irá precisar.");
        pausa(3000);
        System.out.println("??? -- Ora, ora... Demorei para despertar e quando acordo alguém tenta me parar?");
        pausa(3000);
        System.out.println("??? -- Parabéns, você será como os outros que vieram me impedir.");
        pausa(3000);
        System.out.println("??? -- Deixe-me apresentar.");
        pausa(2000);
        System.out.println("Volvagia -- Sou o dragão deste vulcão que despertou após 30 anos, fiquei preso descansando por tanto tempo assim? O que você acha?");
        pausa(5000);
        System.out.println("Volvagia --Mesmo assim, você será somente outro para a conta... Estou desapontado, porque comecei a gostar de você.");
        pausa(3000);
        System.out.println("Volvagia -- Porquê? Você é muito sábio e ao mesmo tempo burro, olha o tamanho do livro que está em sua mão, com toda certeza era do Mediggoron.");
        pausa(5000);
        System.out.println("volvagia -- Ele andava com esse livro para cima e para baixo, mas um dia me irritei com ele e joguei no mar de lava, mas pelo jeito ainda existe.");
        pausa(5000);
        System.out.println("Volvagia -- Vem pra cima.");
        linha();
        pausa(2000);
        carregando();


    }

    public static void novoMenuComSkill() {


        linha();
        System.out.println("Escolha uma das opções:");
        linha();
        pausa(1000);
        System.out.println("1 - Atacar.");

        System.out.println("2 - Defender.");

        System.out.println("3 - Tomar poção");

        System.out.println("4 - Espada Sagrada: Liberar.");
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
        int pocoesGuerreiro = 2;
        int espadaSagradaLiberar = 50;

        int curaPocao = 45;
        // statusJogador(hpGuerreiro, strGuerreiro, pocoesGuerreiro);

        //1°inimigo
        int hpBiggoron = 100;
        int strBiggoron = 10;
        //statusBiggoron(hpBiggoron, strBiggoron);

        //2°inimigo
        int hpMediggoron = 130;
        int strMediggoron = 15;
        //statusMediggoron(hpMediggoron, strMediggoron);

        //boss final
        int hpVolvagia = 200;
        int strVolvagia = 35;
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

                    analisando();
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

                    analisando();
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

                    analisando();

                    if (pocoesGuerreiro > 0) {
                        hpGuerreiro = pocao(hpGuerreiro, pocoesGuerreiro);
                        pocoesGuerreiro--;
                        System.out.println("Você conseguiu tomar poção, você recuperou " + curaPocao + " de HP.");

                    }
                    break;
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
                    System.out.println("Você ganhou " + pocoesGuerreiro + " poção de cura.");
                    pausa(2000);
                    break;

                default:
                    System.out.println("Não existe esta escolha, tente novamente.");
                    continue;
            }

            break;
        }

        continuandoCaminho();
        System.out.println("Agora é hora da luta...");
        pausa(1000);

        while (hpGuerreiro > 0 && hpMediggoron > 0) {

            statusMediggoron(hpMediggoron, strMediggoron);
            statusJogador(hpGuerreiro, strGuerreiro, pocoesGuerreiro);
            menuBatalha();

            int dadoSegundaLuta = dado(10);
            int qualSegundaLuta = entrada.nextInt();

            switch (qualSegundaLuta) {
                case 1:

                    analisando();
                    rolandoDado();
                    System.out.println("O dado caiu em " + dadoSegundaLuta);
                    if (dadoSegundaLuta >= 4) {

                        pausa(1000);
                        linha();
                        System.out.println("Você acertou o ataque!!");
                        pausa(1000);
                        hpBiggoron -= strGuerreiro;
                        System.out.println("HP restante do Biggoron: " + hpBiggoron);
                        linha();

                    } else {
                        hpGuerreiro -= strMediggoron;
                        System.out.println("Você errou o ataque completamente, Mediggoron tirou " + strMediggoron + " de HP.");
                        pausa(5000);
                    }
                    break;

                case 2:

                    analisando();
                    rolandoDado();
                    System.out.println("O dado caiu em " + dadoSegundaLuta);

                    if (dadoSegundaLuta >= 4) {

                        pausa(1000);
                        linha();
                        System.out.println("Você Conseguiu se defender!!");
                        pausa(1000);
                        System.out.println("Biggoron não irá conseguir acertar o próximo ataque.");
                        linha();

                    } else {
                        hpGuerreiro -= strMediggoron;
                        System.out.println("Meddigoron te deu um mata leão enquanto olha para as nuvens.");
                        pausa(5000);
                        System.out.println("Você perdeu " + strMediggoron + " de HP.");
                    }
                    break;

                case 3:

                    analisando();

                    if (pocoesGuerreiro > 0) {

                        hpGuerreiro = pocao(hpGuerreiro, pocoesGuerreiro);
                        pocoesGuerreiro--;
                        System.out.println("Você conseguiu tomar poção, você recuperou " + curaPocao + " de HP.");
                        break;
                    }
                    break;
                default:
                    System.out.println("Não existe esta opção, tente novamente.");
                    continue;
            }

            //              turno mediggoron               \\

            int dadoMediggoron = dado(10);

            rolandoDado();

            System.out.println("Dado de Meddigoron caiu em " + dadoMediggoron);
            pausa(4000);

            if (dadoMediggoron < 4) {

                hpMediggoron -= strGuerreiro;
                System.out.println("Meddigoron foi te atacar, mas você pensou mais rápido.");

            } else {
                hpGuerreiro -= strMediggoron;
                System.out.println("Mediggoron te acertou em cheio e tirou " + strMediggoron + " de HP.");
            }

        } //fim while

        derrotaMediggoron();
        pocoesGuerreiro += 1;

        continuadoHistoriaVulcao();

        while (hpGuerreiro > 100 || hpVolvagia > 100) {
            statusJogador(hpGuerreiro, strGuerreiro, pocoesGuerreiro);
            statusVolvagia(hpVolvagia, strVolvagia);
            novoMenuComSkill();

            int resultadoDado = dado(10);
            int batalhaVolvagia = entrada.nextInt();

            switch (batalhaVolvagia) {
                case 1:

                    analisando();
                    rolandoDado();
                    System.out.println("O dado caiu em: " + resultadoDado);

                    if (resultadoDado < 4) {

                        hpGuerreiro -= strVolvagia;
                        System.out.println("Você errou o golpe, você perdeu " + strVolvagia + " de HP.");
                        pausa(1000);
                    } else {
                        hpVolvagia -= strGuerreiro;
                        System.out.println("VOCÊ ACERTOU!! Volvagia perdeu " + strGuerreiro + " de HP.");

                    }
                    break;
                case 2:

                    analisando();
                    rolandoDado();
                    System.out.println("O dado caiu em: " + resultadoDado);

                    if (resultadoDado < 4) {
                        hpGuerreiro -= strMediggoron;
                        System.out.println("Volvagia te deu um soco no estômago, você deve fiar fora por uns 5 minutos.");
                        pausa(4000);
                        System.out.println("Você perdeu " + strMediggoron + " de HP.");
                        pausa(1000);


                    } else {

                        pausa(1000);
                        linha();
                        System.out.println("Você Conseguiu se defender!!");
                        pausa(1000);
                        System.out.println("Biggoron não irá conseguir acertar o próximo ataque.");
                        linha();

                    }
                    break;
                case 3:

                    analisando();

                    if (pocoesGuerreiro > 0) {

                        hpGuerreiro = pocao(hpGuerreiro, pocoesGuerreiro);
                        pocoesGuerreiro--;
                        System.out.println("Você conseguiu tomar poção, você recuperou " + curaPocao + " de HP.");
                        break;
                    }
                    break;
                case 4:

                    analisando();
                    rolandoDado();
                    System.out.println("O dado caiu em: " + resultadoDado);
                    System.out.println("Se dado for menor que 6, você irá perder vida");

                    if (resultadoDado < 6) {

                        System.out.println("Você errou completamente e acertou o poder Liberado em seu ombro, dangrando muito.");
                        pausa(4000);
                        System.out.println("Você perdeu -" + espadaSagradaLiberar + " de HP.");
                        hpGuerreiro -= espadaSagradaLiberar;
                    }
                default:
                    System.out.println("Não existe esta opção, tente novamente.");
                    continue;
            }

            //              turno volvagia                  \\

            int dadoVolvagia = dado(10);

            System.out.println("Volvagia -- Agora é minha vez! Se prepare!");

            if (dadoVolvagia <= 3) {
                System.out.println("Volvagia jogou uma bola de fogo, mas você ricochetiou e voltou para boca dele!");
                pausa(3000);
                System.out.println("Você tirou " + strGuerreiro + " de Hp");
                pausa(2000);

            } else {
                System.out.println("Volvagia acertou a bola de fogo em cheio... Você perdeu " + strVolvagia + " de HP...");
                hpGuerreiro -= strVolvagia;
                pausa(3000);
            }
        }

        carregando();
        pausa(5000);
        System.out.println("\nFoi um ataque determinante...");
        pausa(3000);
        System.out.println("Tudo parou, como se estivesse em câmera lenta, você vê Volvagia e Volvagia vê você...");
        pausa(3000);
        System.out.println("Nada parou atoa... Você vê a bela moça com cabelos castanhos claros, olhos lindos, cachos lindos, olhando desesperadamente olhando para você...");
        pausa(4000);
        System.out.println("Ela quer muito que você ganhe.");
        pausa(4000);
        System.out.println("Agora você irá escolher algo que vai definir o seu caminho.");
        pausa(4000);
        System.out.println("Volvagia está preparando um ataque e você está preparando outro ataque, o ataque do século.");
        pausa(3000);
        System.out.println("Tudo o que passou, aquele livro de Mediggoron não era só um livro, tudo o que ele viveu você enxergou.");
        pausa(4000);
        System.out.println("Volvagia tirou tudo e todos de Mediggoron, a única coisa que sobrou foi Biggoron, o irmão mais novo.");
        pausa(5000);
        System.out.println("VocÊ sente uma raiva grande por tudo isso...");
        pausa(3000);
        linha();
        pausa(500);
        System.out.println("1 - Ataque Liberação Total -120HP.");
        pausa(1000);
        System.out.println("2 - Golpe Ladrão de Coração -100HP.");
        pausa(1000);
        System.out.println("3 - Morte Lenta -Dano constante.");
        linha();
        System.out.println("Cada uma terá um efeito diferente, não ache que será algo fácil, pois se você errar");
        pausa(2000);
        System.out.println("Volvagia pode te matar com um golpe...");
        pausa(2000);
        System.out.println("Se você poupou suas poções, parabéns, você terá outra chance.");
        pausa(3000);
        System.out.print("O que você deseja? ");

        //ataque final, pensei em decidir tudo em um golpe e se guerreiro perder e tiver +1 poção, ele tem uma chance à mais
        //continuar while
        //última parada, golpes que cada opção vai ter algo diferente
        /*
        1 vai ser uma rajada, onde a espada começa a brilhar e começa a ficar pesada
        dai o guerreiro vai indo devagar para Volvagia enquanto ele tenta escapar, mas ele corta ao meio

        2 Com a magia do livro, você consegue tranformar em um bastão de quatro seções e roubando diretamente o coração

        3 Mediggoron retorna, mas no fim de sua vida, dando uma espada gigante, maior que Guerreiro consegue segurar, mas Mediggoron
        ensina como transformar a magia em força. Com isso, cortando de pouco em pouco e Volvagia pedindo socorro à cada corte

         */
        //tambem tem a moça que está na luta, talvez no fim os dois se encontram e fiquem juntos e depois o guerreiro acaba tendo algo
        
        while (hpGuerreiro > 0 && hpVolvagia > 0) {

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
