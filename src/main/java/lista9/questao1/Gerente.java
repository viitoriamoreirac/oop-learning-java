package lista9.questao1;

public class Gerente extends Funcionario{
    protected String department;
    private static final double bonus = 1500;

    public Gerente (String name, String cpf, int birthDate, double salary, String department) {
        super(name, cpf, birthDate, salary);
        this.department = department;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
