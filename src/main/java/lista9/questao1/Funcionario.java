package lista9.questao1;

public class Funcionario extends Pessoa {
    protected double salary;

    public Funcionario(String name, String cpf, String birthDate, double salary) {
        super(name, cpf, birthDate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }
}
