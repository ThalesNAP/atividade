public class Main {
    public static void main(String[] args) {
        ProgressaoAritmetica pa = new ProgressaoAritmetica(5);
        ProgressaoGeometrica pg = new ProgressaoGeometrica(3);
        ProgressaoFibonacci pf = new ProgressaoFibonacci();

        System.out.println("Progressão Aritmética:");
        for (int i = 0; i < 10; i++) {
            System.out.println(pa.proximo());
        }
        pa.reiniciar();

        System.out.println("Progressão Geométrica:");
        for (int i = 0; i < 10; i++) {
            System.out.println(pg.proximo());
        }
        pg.reiniciar();

        System.out.println("Progressão Fibonacci:");
        for (int i = 0; i < 10; i++) {
            System.out.println(pf.proximo());
        }
        pf.reiniciar();
    }
}
