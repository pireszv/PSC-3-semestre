public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        System.out.println("Exemplo para o exercício 1:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println();

        System.out.println("Exemplo para o exercício 2:");
        pessoa.exibirInformacoes();
        System.out.println();

        Estudante estudante = new Estudante("Maria", 20, "Engenharia");
        System.out.println("Exemplo para o exercício 3:");
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Curso: " + estudante.getCurso());
        System.out.println();

        System.out.println("Exemplo para o exercício 4:");
        estudante.exibirInformacoes();
    }
}