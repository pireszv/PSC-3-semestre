class Funcionario implements Trabalhador {
    protected double salario;
    protected String departamento;

    public Funcionario(double salario, String departamento) {
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirInformacoes() {
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
    }

    @Override
    public void trabalhar() {
        System.out.println("Funcionário trabalhando...");
    }
}