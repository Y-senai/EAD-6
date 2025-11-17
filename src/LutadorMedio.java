public class LutadorMedio extends Lutador{
    public LutadorMedio(String nome){
        super(nome,100,100,25);
    }

    @Override
    public void atacar(Lutador Oponente) {
        if (Oponente.estaVivo())
        {
            Oponente.vida -= (this.forca);
            System.out.println("Jogador " + Oponente.nome + " levou " + this.forca + " de dano");
        }
        else
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