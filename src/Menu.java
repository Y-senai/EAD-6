import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void mostrarLutadores(Lutador lutador1, Lutador lutador2){
        lutador1.mostrarStatus();
        System.out.println();
        System.out.println("==================================");
        System.out.println();
        lutador2.mostrarStatus();
    }

    public void cadastrarJogador(LutadorLeve[] leves,LutadorMedio[] medios,LutadorPesado[] pesados) {

        System.out.println("Qual o nome do jogador?");
        String jogador1Nome = sc.nextLine();

        System.out.println("Qual a catégoria do lutador: \n1 - Leve\n2 - Medio\n3 - Pesado");
        int jogador1Classe = sc.nextInt();

        while(jogador1Classe!=1 && jogador1Classe!=2 && jogador1Classe!=3){
            System.out.println("Categoria invalida, digite novamente: ");
            jogador1Classe = sc.nextInt();
        }

        switch (jogador1Classe) {
            case 1:
                LutadorLeve lutadorL = new LutadorLeve(jogador1Nome);
                for (int x =0;x<=leves.length;x++){
                    if(x==leves.length){
                        System.out.println("Lista cheia.");
                        break;
                    }
                    if(leves[x]==null){
                        leves[x]=lutadorL;
                        break;
                    }
                }
                break;
            case 2:
                LutadorMedio lutadorM = new LutadorMedio(jogador1Nome);
                for (int x =0;x<=medios.length;x++) {
                    if(x==medios.length){
                        System.out.println("Lista cheia.");
                        break;
                    }
                    if (medios[x] == null) {
                        medios[x] = lutadorM;
                        break;
                    }
                }
                break;
            case 3:
                LutadorPesado lutadorP = new LutadorPesado(jogador1Nome);
                for (int x =0;x<=pesados.length;x++) {
                    if(x==pesados.length){
                        System.out.println("Lista cheia.");
                        break;
                    }
                    if (pesados[x] == null) {
                        pesados[x] = lutadorP;
                        break;
                    }
                }
                break;
            default:
                System.out.println("Opção invalida");
        }
    }

    public void mostrarListaLutadores(LutadorLeve[] leves, LutadorMedio[] medios, LutadorPesado[] pesados){
        System.out.println("========= LUTADORES LEVES =========");
        for(int i = 0;i<leves.length;i++){
            if(leves[i]==null){
                break;
            }
            System.out.println(" ====== LUTADOR " + (i+1) + " ======");
            leves[i].mostrarStatus();
            System.out.println("===========================");
        }
        System.out.println("========= LUTADORES MEDIOS =========");
        for(int i = 0;i<medios.length;i++){
            if(medios[i]==null){
                break;
            }
            System.out.println(" ====== LUTADOR " + (i+1) + " ======");
            medios[i].mostrarStatus();
            System.out.println("===========================");
        }
        System.out.println("========= LUTADORES PESADOS =========");
        for(int i = 0;i<pesados.length;i++){
            if(pesados[i]==null){
                break;
            }
            System.out.println(" ====== LUTADOR " + (i+1) + " ======");
            pesados[i].mostrarStatus();
            System.out.println("===========================");
        }
    }

    public int menuInicial(){
        System.out.println("=========== STREET KOMBAT 3 - O RETORNO DO JEDI ===========");
        System.out.println();
        System.out.println("1 - Singleplayer\n2 - Versus\n3 - Modo Torneio\n4 - Sair");
        int opt = sc.nextInt();
        while(opt != 1 && opt != 2 && opt!=3 && opt!= 4){
            System.out.println("Input invalido, digite novamente");
            opt = sc.nextInt();
        }
        return switch (opt){
            case 1 ->  1;
            case 2 -> 2;
            case 3 -> 3;
            case 4 -> 4;
            default -> 0;
        };
    }

    public int CombatOpt(Lutador lutador){
        System.out.println();
        System.out.println("Vez do lutador: ");
        System.out.println();
        System.out.println("==============" + lutador.nome.toUpperCase() + "==============");
        lutador.mostrarStatus();
        System.out.println("=============================");
        System.out.println("1 - Atacar\n2 - Especial\n3 - Defender");
        int opt = sc.nextInt();
        while(opt != 1 && opt!=2 && opt!=3) {
            System.out.println("Input invalido");
            opt = sc.nextInt();
        }

            return switch(opt){
                case 1 -> 1;
                case 2 -> 2;
                case 3 -> 3;
                default -> 0;
            };
        }


    public void executarAcao(Lutador lutador,Lutador lutadorAlvo){
        int opt = CombatOpt(lutador);
        switch(opt){
            case 1:
                lutador.atacar(lutadorAlvo);
                break;
            case 2:
                lutador.especial(lutadorAlvo);
                break;
            case 3:
                lutador.defender();
                break;
        }
    }

    public void executarAcaoBot(Lutador lutador,Lutador lutadorAlvo){
        int opt = (int) (Math.random() * 3) + 1;
        switch(opt){
            case 1:
                lutador.atacar(lutadorAlvo);
                break;
            case 2:
                lutador.especial(lutadorAlvo);
                break;
            case 3:
                lutador.defender();
                break;
        }
    }

    public void Combate(Lutador lutador1,Lutador lutador2){
        System.out.println("=========== Combantente 1 :");
        lutador1.mostrarStatus();
        System.out.println();
        System.out.println("=========== Combantente 2 : ");
        lutador2.mostrarStatus();
        System.out.println();
        while(lutador1.vida>0 && lutador2.vida>0){
            mostrarLutadores(lutador1,lutador2);
            executarAcao(lutador1,lutador2);
            if(lutador2.vida<0){
                break;
            }
            executarAcao(lutador2,lutador1);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public void CombateBot(Lutador lutador1,Lutador lutador2){
        System.out.println("=========== Combantente 1 :");
        lutador1.mostrarStatus();
        System.out.println();
        System.out.println("=========== Combantente 2 : ");
        lutador2.mostrarStatus();
        System.out.println();
        while(lutador1.vida>0 && lutador2.vida>0){
            mostrarLutadores(lutador1,lutador2);
            executarAcao(lutador1,lutador2);
            if(lutador2.vida<0){
                break;
            }
            executarAcaoBot(lutador2,lutador1);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }


    //public Lutador escolherLutador(LutadorLeve[] leves, LutadorMedio[] medios, LutadorPesado[] pesados){
      //  mostrarListaLutadores(leves, medios, pesados);
        //System.out.println("Escolha o número do lutador que você deseja: ");
    //}

}
