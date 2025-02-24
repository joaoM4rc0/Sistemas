package petshop.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String tipo;
    private int identificador;
    private boolean foitosado = false;
    public Pet(int identificador, String tipo) {
        this.identificador = identificador;
        this.tipo = tipo;
    }
    public void foiTosado(boolean foiTosado) {
         this.foitosado = foiTosado;
    }
    public void VerificaSePetFoiTosado() {
        if (this.foitosado) {
            System.out.println("o animal foi tosado");
            return;
        }
        System.out.println("o animal nao foi tosado");

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
