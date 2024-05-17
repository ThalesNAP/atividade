public class ProgressaoFibonacci extends Progressao {
    private int anterior;

    public ProgressaoFibonacci() {
        this.anterior = 1;
        this.atual = 0;
    }

    @Override
    public int proximo() {
        int temp = atual;
        atual += anterior;
        anterior = temp;
        return atual;
    }
}