
public class RetanguloColorido extends RetanguloDecorator {
    public RetanguloColorido(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando retângulo colorido:");
        System.out.println("\u001B[41m" + "                      " + "\u001B[0m");
        System.out.println("\u001B[41m" + "     " + texto + "      " + "\u001B[0m");
        System.out.println("\u001B[41m" + "                      " + "\u001B[0m");
    }
}

