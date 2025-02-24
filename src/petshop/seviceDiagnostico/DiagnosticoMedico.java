package petshop.seviceDiagnostico;

import petshop.dominio.Pet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DiagnosticoMedico {
    private static Map<Pet, String> diagnosticoDoPet = new LinkedHashMap<>();
    public static void recebeDiagnostico(Pet pet,String diagnostico) {
        if (diagnostico == null) throw new IllegalArgumentException("lista de disgnostico nao pode ser null");
        if (diagnostico.isEmpty()) throw new IllegalArgumentException("lista de diagnostico nao pode ser vazia");
        diagnosticoDoPet.put(pet, diagnostico);
    }
    public static void exibeDiagnostico() {
        for(Map.Entry<Pet, String> pair: diagnosticoDoPet.entrySet()) {
            System.out.printf("o diagnostico do seu %s:%n", pair.getKey().getTipo());
            System.out.println(pair.getValue());
        }
    }
}
