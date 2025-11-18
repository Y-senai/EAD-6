public abstract class Lutador {

    String nome;

    double vida;

    int energia;

    int forca;

    public Lutador(String nome, int vida, int energia, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.forca = forca;
    }

    abstract public void atacar(Lutador Oponente);

    abstract public void especial(Lutador Oponente);

    public void defender(Lutador Oponente){
        if(this.vida - Oponente.forca < 0){
            this.vida -=20;
        }
        this.vida-= Oponente.forca-=20;
    }

    public void mostrarStatus(){
        System.out.println("========= " + this.nome.toUpperCase() + " =========");
        System.out.println("Vida: " + this.vida);
        System.out.println(("Energia: " + this.energia));
        System.out.println("Forca: " + this.forca);
    }

    public boolean estaVivo(){
        return (this.vida>=0);
        }
}