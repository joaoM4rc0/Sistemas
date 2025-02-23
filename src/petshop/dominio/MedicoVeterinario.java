package petshop.dominio;

import petshop.FuncionarioModel.Funcionarios;

import java.util.ArrayList;
import java.util.List;

public class MedicoVeterinario extends Funcionarios {

    public MedicoVeterinario(String name, int idade, double salario) {
        super(name, idade, salario);
    }
    public List<String> diagnosticoDoPet(String diagnostico) {
        List<String> listaDDiagnostico = new ArrayList<>();
        if (diagnostico == null) throw new IllegalArgumentException("lista de disgnostico nao pode ser null");
        if (diagnostico.isEmpty()) throw new IllegalArgumentException("lista de diagnostico nao pode ser vazia");
        listaDDiagnostico.add(diagnostico);
        return listaDDiagnostico;
    }
}
