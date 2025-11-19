import java.util.Random;

public class LutadorLeve extends Lutador{
    Random random = new Random();

    public LutadorLeve(String nome){
        super(nome,80,120,16);
    }

    @Override
    public void atacar(Lutador Oponente){
        if(estaVivo())
        {

            Oponente.vida-=(this.forca);
            Oponente.verificarVida();
            System.out.println("Jogador " + Oponente.nome + " levou "+ this.forca + " de dano");
            System.out.println(Oponente.nome + " está com " + Oponente.vida +" de vida");
        }
        if(!Oponente.estaVivo())
        {
            System.out.println("O oponente pereceu");
            return;
        }
        if(estaVivo())
        {
            Oponente.vida-=(this.forca);
            Oponente.verificarVida();
            System.out.println("Jogador " + Oponente.nome + " levou "+ this.forca + " de dano");
            System.out.println(Oponente.nome + " está com " + Oponente.vida +" de vida");
        }
        if(!Oponente.estaVivo())
        {
            System.out.println("O oponente pereceu");
        }
    }

    @Override
    public void especial(Lutador Oponente){
        Oponente.vida-=(this.forca*2);
        verificarVida();
        this.energia-=30;
    }
}