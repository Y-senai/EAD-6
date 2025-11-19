import java.util.Random;

public class LutadorMedio extends Lutador{
    Random random = new Random();

    public LutadorMedio(String nome){
        super(nome,100,100,25);
    }

    @Override
    public void atacar(Lutador Oponente) {
            if (Oponente.estaVivo()) {
                Oponente.vida -= (this.forca);
                Oponente.verificarVida();
                System.out.println("Jogador " + Oponente.nome + " levou " + this.forca + " de dano");
                System.out.println(Oponente.nome + " está com " + Oponente.vida + " de vida");
            }
            if(!Oponente.estaVivo())
            {
                System.out.println("O oponente já pereceu");
            }
        }
    @Override
    public void especial(Lutador Oponente){
        Oponente.vida-=(this.forca*1.5);
        this.energia-=30;
    }
}