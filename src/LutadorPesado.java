public class LutadorPesado extends Lutador{
    public LutadorPesado(String nome){
        super(nome,200,40,35);
    }

    @Override
    public void atacar(Lutador Oponente){
        if(Oponente.estaVivo())
        {
        Oponente.vida-=(this.forca);
        System.out.println("Jogador " + Oponente.nome + " levou "+ this.forca + " de dano");
        Oponente.energia-=20;
        System.out.println("Jogador " + Oponente.nome + " perdeu 20 de energia");
        }
        else{
            System.out.println("O oponente já pereceu");
        }
    }

    @Override
    public void especial(Lutador Oponente){
        Oponente.vida-=(this.forca*2);
        this.energia-=30;
    }
}