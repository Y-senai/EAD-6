public class LutadorLeve extends Lutador{
    public LutadorLeve(String nome){
        super(nome,80,120,16);
    }

    @Override
    public void atacar(Lutador Oponente){
        if(estaVivo())
        {
            Oponente.vida-=(this.forca);
            System.out.println("Jogador " + Oponente.nome + " levou "+ this.forca + " de dano");
        }
        else
        {
            System.out.println("O oponente pereceu");
        }
        if(estaVivo())
        {
            Oponente.vida-=(this.forca);
            System.out.println("Jogador " + Oponente.nome + " levou "+ this.forca + " de dano");
        }
        else
        {
            System.out.println("O oponente pereceu");
        }
    }

    @Override
    public void especial(Lutador Oponente){
        Oponente.vida-=(this.forca*4);
        this.energia-=30;
    }
}