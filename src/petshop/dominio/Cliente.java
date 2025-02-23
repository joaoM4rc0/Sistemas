package petshop.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cliente {
    private String name;
    private int idade;
    private Pet pet;
    private List<String> diagnosticoDoPet = new ArrayList<>();

    public Cliente(String name, int idade, Pet pet) {
        this.name = name;
        this.idade = idade;
        if (pet == null) throw new IllegalArgumentException("o cliente precisa de um pet");
        if (String.valueOf(pet).isEmpty()) throw new IllegalArgumentException("o valor de pet nao pode ser vazio");
        this.pet = pet;
    }

    public void recebeDiagnostico(List<String> diagnosticos) {
        String diagnostico = String.join("", diagnosticos);
        diagnosticoDoPet.add(diagnostico);
    }
    public void exibeDiagnostico() {
        for (String d : diagnosticoDoPet) {
            System.out.println("esse é o diagnostico: o seu " + d);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", pet=" + pet +
                '}';
    }

    public int getIdade() {
        return idade;
    }

    public String getName() {
        return name;
    }

    public void getPet() {
        System.out.println(pet.toString());
    }
}
