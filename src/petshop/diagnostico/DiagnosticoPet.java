package petshop.diagnostico;

import java.util.ArrayList;
import java.util.List;

public class DiagnosticoPet {
    private List<String> diagnosticoDoPet = new ArrayList<>();

    public void recebeDiagnostico(List<String> diagnosticos) {
        String diagnostico = String.join("", diagnosticos);
        diagnosticoDoPet.add(diagnostico);
    }
    public void exibeDiagnostico() {
        for (String d : diagnosticoDoPet) {
            System.out.println("esse é o diagnostico: o seu " + d);
        }
    }
}
