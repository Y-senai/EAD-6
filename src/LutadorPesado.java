import java.util.Random;

class LutadorPesado extends Lutador{

    Random random = new Random();

    public LutadorPesado(String nome){
        super(nome,200,40,35);
    }

    @Override
    public void atacar(Lutador Oponente){
        if(Oponente.estaVivo())
        {
        Oponente.vida-=(this.forca);
            Oponente.verificarVida();
        System.out.println("Jogador " + Oponente.nome + " levou "+ this.forca + " de dano");
            System.out.println(Oponente.nome + " está com " + Oponente.vida +" de vida");
        Oponente.energia-=20;
        System.out.println("Jogador " + Oponente.nome + " perdeu 20 de energia");
            System.out.println(Oponente.nome + " está com " + Oponente.energia +" de energia");
        }
        if(!Oponente.estaVivo())
        {
            System.out.println("O oponente já pereceu");
        }
    }

    @Override
    public void especial(Lutador Oponente){
        Oponente.vida-=(this.forca*2);
        this.energia-=30;
    }
}