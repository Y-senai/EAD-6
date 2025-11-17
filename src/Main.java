import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        Scanner sc = new Scanner(System.in);

        LutadorLeve[] Leves = new LutadorLeve[20];
        LutadorMedio[] Medios = new LutadorMedio[20];
        LutadorPesado[] Pesados = new LutadorPesado[20];

        menu.cadastrarJogador(Leves,Medios,Pesados);
        menu.cadastrarJogador(Leves,Medios,Pesados);
        menu.mostrarLutadores(Leves,Medios,Pesados);

    }
}
