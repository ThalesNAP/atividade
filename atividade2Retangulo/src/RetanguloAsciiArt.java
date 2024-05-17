
public class RetanguloAsciiArt extends RetanguloDecorator {
    public RetanguloAsciiArt(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando retângulo com ASCII art:");
        System.out.println("**********************");
        System.out.println("*                    *");
        System.out.println("*   " + texto + "      *");
        System.out.println("*                    *");
        System.out.println("**********************");
    }
}

