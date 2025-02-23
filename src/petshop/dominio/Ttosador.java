package petshop.dominio;

import petshop.FuncionarioModel.Funcionarios;

public class Ttosador extends Funcionarios {
    public Ttosador(String name, int idade, double salario) {
        super(name, idade, salario);
    }
    public void tosarOPet(Pet pet) {
        pet.foiTosado(true);
    }
}
