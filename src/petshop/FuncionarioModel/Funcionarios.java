package petshop.FuncionarioModel;

public class Funcionarios {
    private String name;
    private int idade;
    private double salario;

    public Funcionarios(String name, int idade, double salario) {
        this.name = name;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
