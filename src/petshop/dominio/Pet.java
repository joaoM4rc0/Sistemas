package petshop.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String tipo;
    private int identificador;

    public Pet(int identificador, String tipo) {
        this.identificador = identificador;
        this.tipo = tipo;
    }
    public boolean foiTosado(boolean foiTosado) {
        System.out.println(foiTosado ? "o animal foi tosado" : "o animal nao foi tosado");
        return foiTosado;
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
