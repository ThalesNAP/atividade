public class ProgressaoAritmetica extends Progressao {
    private int incremento;

    public ProgressaoAritmetica(int incremento) {
        this.incremento = incremento;
    }

    @Override
    public int proximo() {
        atual += incremento;
        return atual;
    }
}