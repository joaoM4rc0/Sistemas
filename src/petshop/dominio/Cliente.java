package petshop.dominio;

import java.util.List;

public class Cliente {
    private String name;
    private int idade;
    private Pet pet;
    private List<String> diagnosticoDoPet;
    public static final class ClienteBuilder {
        private int idade;
        private String name;
        private Pet pet;

        public static ClienteBuilder aCliente() {
            return new ClienteBuilder();
        }

        public ClienteBuilder withIdade(int idade) {
            this.idade = idade;
            return this;
        }

        public ClienteBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ClienteBuilder withPet(Pet pet) {
            this.pet = pet;
            return this;
        }

        public Cliente build() {
            Cliente cliente = new Cliente();
            cliente.idade = this.idade;
            cliente.name = this.name;
            cliente.pet = this.pet;
            return cliente;
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
    public void recebeDiagnostico(List<String> diagnostico) {
        this.diagnosticoDoPet.addAll(diagnostico);

    }
    public void exibeDiagnostico
    public int getIdade() {
        return idade;
    }

    public String getName() {
        return name;
    }

    public Pet getPet() {
        return pet;
    }
}
