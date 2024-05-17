
public abstract class RetanguloDecorator {
    protected String texto;

    public RetanguloDecorator(String texto) {
        this.texto = texto;
    }

    public abstract void desenhar();
}
