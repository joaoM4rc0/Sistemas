package petshop.dominio;

public class Pet {
    private String tipo;
    private int identificador;

    public Pet(int identificador, String tipo) {
        this.identificador = identificador;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "identificador=" + identificador +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
