import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        Scanner sc = new Scanner(System.in);

        LutadorLeve[] Leves = new LutadorLeve[20];
        LutadorMedio[] Medios = new LutadorMedio[20];
        LutadorPesado[] Pesados = new LutadorPesado[20];

        Leves[0] = new LutadorLeve("Rastad");
        Medios[0] = new LutadorMedio("Ryu");
        Pesados[0] = new LutadorPesado("Alex");

        int opt=menu.menuInicial();
        switch(opt){
            case 1:
                menu.CombateBot(Leves[0],Medios[0]);
            case 4:
                System.exit(0);
        }


    }
}
