public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(3000, "RH");
        Gerente gerente = new Gerente(5000, "TI", 1000);

        System.out.println("Exemplo para o Exercício 5:");
        System.out.println("Funcionário:");
        funcionario.exibirInformacoes();
        System.out.println("Gerente:");
        gerente.exibirInformacoes();
        System.out.println();

        System.out.println("Exemplo para o Exercício 6:");
        Pessoa pessoa1 = new Pessoa("João");
        Pessoa pessoa2 = new Pessoa("Maria", 30);
        System.out.println("Pessoa 1 - Nome: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade());
        System.out.println("Pessoa 2 - Nome: " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade());
        System.out.println();

        System.out.println("Exemplo para o Exercício 7 e 8:");
        Funcionario funcionario2 = new Funcionario(4000, "Vendas");
        Gerente gerente2 = new Gerente(6000, "Marketing", 2000);
        Empresa empresa = new Empresa();
        empresa.adicionarTrabalhador(funcionario2); 
        empresa.adicionarTrabalhador(gerente2); 
        System.out.println();

        ((Funcionario) funcionario2).trabalhar();
        ((Gerente) gerente2).trabalhar();
    }
}