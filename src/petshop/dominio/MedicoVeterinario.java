package petshop.dominio;

import petshop.FuncionarioModel.Funcionarios;
import petshop.seviceDiagnostico.DiagnosticoMedico;

import java.util.ArrayList;
import java.util.List;

public class MedicoVeterinario extends Funcionarios {
    public MedicoVeterinario(String name, int idade, double salario) {
        super(name, idade, salario);
    }
    public void diagnosticoMedico(Pet pet,String diagnostico) {
        DiagnosticoMedico.recebeDiagnostico(pet, diagnostico);
    }
    public void exibeDiagnostico() {
        DiagnosticoMedico.exibeDiagnostico();
    }
}
