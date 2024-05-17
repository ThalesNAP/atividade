public class ProgressaoGeometrica extends Progressao {
    private int base;

    public ProgressaoGeometrica(int base) {
        this.base = base;
        this.atual = 1;
    }

    @Override
    public int proximo() {
        atual *= base;
        return atual;
    }
}