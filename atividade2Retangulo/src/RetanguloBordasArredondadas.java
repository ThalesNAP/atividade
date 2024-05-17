
// Subclasse para decoração com bordas arredondadas
public class RetanguloBordasArredondadas extends RetanguloDecorator {
    public RetanguloBordasArredondadas(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando retângulo com bordas arredondadas:");
        System.out.println("┌────────────────────┐");
        System.out.println("│                    │");
        System.out.println("│  " + texto + "       │");
        System.out.println("│                    │");
        System.out.println("└────────────────────┘");
    }
}


