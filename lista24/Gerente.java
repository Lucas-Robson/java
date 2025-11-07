package lista24;

public class Gerente extends Funcionario {
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.2; // +20%
    }

    public void gerenciar() {
        System.out.println("O gerente do departamento " + departamento + " está gerenciando a equipe.");
    }
}
