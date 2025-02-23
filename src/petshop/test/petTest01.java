package petshop.test;

import petshop.dominio.Cliente;
import petshop.dominio.MedicoVeterinario;
import petshop.dominio.Pet;

import java.util.List;

public class petTest01 {
    public static void main(String[] args) {
        Cliente cliente = Cliente.ClienteBuilder.aCliente()
                .withName("joao")
                .withIdade(18)
                .withPet(new Pet(1, "canino"))
                .build();
        MedicoVeterinario medicoVeterinario = new MedicoVeterinario("dr fabricio", 38, 3000);
        List<String> strings = medicoVeterinario.diagnosticoDoPet("o cachorro nao tem nenhum problema");
        cliente.recebeDiagnostico(strings);
    }
}
