public abstract class Progressao {
    protected int atual;

    public Progressao() {
        this.atual = 0;
    }

    public abstract int proximo();

    public void reiniciar() {
        this.atual = 0;
    }
}