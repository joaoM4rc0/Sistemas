package petshop.test;

import petshop.dominio.Cliente;
import petshop.dominio.MedicoVeterinario;
import petshop.dominio.Pet;

import java.util.List;

public class petTest01 {
    public static void main(String[] args) {
        Pet pet = new Pet(1, "cachorro");
        Cliente cliente = new Cliente("joao", 18,pet);
        MedicoVeterinario medicoVeterinario = new MedicoVeterinario("dr. augusto", 38, 1500);
        List<String> diagnosticoDoPet= medicoVeterinario.diagnosticoDoPet(pet, " precisa tomar tal remedio, tal horario");
        cliente.recebeDiagnostico(diagnosticoDoPet);
        cliente.exibeDiagnostico();
    }
}
