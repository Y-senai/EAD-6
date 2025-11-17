import java.util.Scanner;

public class Menu {
    public void cadastrarJogador(LutadorLeve[] leves,LutadorMedio[] medios,LutadorPesado[] pesados) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do jogador 1?");
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
                for (int x =0;x<leves.length;x++){
                    if(leves[x]==null){
                        leves[x]=lutadorL;
                        break;
                    }
                }
                break;
            case 2:
                LutadorMedio lutadorM = new LutadorMedio(jogador1Nome);
                for (int x =0;x<medios.length;x++) {
                    if (medios[x] == null) {
                        medios[x] = lutadorM;
                        break;
                    }
                }
                break;
            case 3:
                LutadorPesado lutadorP = new LutadorPesado(jogador1Nome);
                for (int x =0;x<pesados.length;x++) {
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

    public void mostrarLutadores(LutadorLeve[] leves,LutadorMedio[] medios,LutadorPesado[] pesados){
        System.out.println("========= LUTADORES LEVES =========");
        for(int i = 0;i<leves.length;i++){
            if(leves[i]==null){
                break;
            }
            leves[i].mostrarStatus();
            System.out.println("===========================");
        }
        System.out.println("========= LUTADORES MEDIOS =========");
        for(int i = 0;i<medios.length;i++){
            if(medios[i]==null){
                break;
            }
            medios[i].mostrarStatus();
            System.out.println("===========================");
        }
        System.out.println("========= LUTADORES PESADOS =========");
        for(int i = 0;i<pesados.length;i++){
            if(pesados[i]==null){
                break;
            }
            pesados[i].mostrarStatus();
            System.out.println("===========================");
        }
    }

}
