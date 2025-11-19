import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        Scanner sc = new Scanner(System.in);

        LutadorLeve[] leves = new LutadorLeve[20];
        LutadorMedio[] medios = new LutadorMedio[20];
        LutadorPesado[] pesados = new LutadorPesado[20];

        leves[0] = new LutadorLeve("Rastad");
        medios[0] = new LutadorMedio("Ryu");
        pesados[0] = new LutadorPesado("Zangief");


        menu.mostrarListaLutadores(leves,medios,pesados);
        int opt=menu.menuInicial();
        switch(opt){
            case 1:
                menu.CombateBot(leves[0],medios[0]);
                break;
            case 2:
                menu.Combate(leves[0],pesados[0]);
                break;
            case 4:
                System.exit(0);
                break;
        }


    }
}
