package lista9.questao1;

public class Pessoa {
    protected   String    name;
    protected   String    cpf;
    protected   int       birthDate;

    public Pessoa (String name, String cpf, int birthDate) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }
    public int getBirthDate() {
        return birthDate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
}
