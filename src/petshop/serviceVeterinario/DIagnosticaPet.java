package petshop.serviceVeterinario;

import petshop.dominio.Pet;

import java.util.ArrayList;
import java.util.List;

public class DIagnosticaPet {
    public  List<String> diagnosticoDoPet(Pet pet, String diagnostico) {
        List<String> listaDDiagnostico = new ArrayList<>();
        if (diagnostico == null) throw new IllegalArgumentException("lista de disgnostico nao pode ser null");
        if (diagnostico.isEmpty()) throw new IllegalArgumentException("lista de diagnostico nao pode ser vazia");
        listaDDiagnostico.add(pet.getTipo());
        listaDDiagnostico.add(diagnostico);
        return listaDDiagnostico;
    }
}
