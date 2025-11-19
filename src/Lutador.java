public abstract class Lutador {

    String nome;

    double vida;

    int energia;

    int forca;

    boolean defesa=false;

    public Lutador(String nome, int vida, int energia, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.forca = forca;
    }

    abstract public void atacar(Lutador Oponente);

    abstract public void especial(Lutador Oponente);

    public void defender(){
        this.defesa=true;
    }

    public void verificarVida(){
        if(this.vida<0){
            this.vida=0;
        }
    }

    public void mostrarStatus(){
        System.out.println("========= " + this.nome.toUpperCase() + " =========");
        System.out.println("Vida: " + this.vida);
        System.out.println(("Energia: " + this.energia));
        System.out.println("Forca: " + this.forca);
    }

    public boolean estaVivo(){
        return (this.vida>0);
        }
}