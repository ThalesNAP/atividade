
public class RetanguloLinhasDuplas extends RetanguloDecorator {
    public RetanguloLinhasDuplas(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando retângulo com linhas duplas:");
        System.out.println("╔════════════════════╗");
        System.out.println("║                    ║");
        System.out.println("║   " + texto + "      ║");
        System.out.println("║                    ║");
        System.out.println("╚════════════════════╝");
    }
}

