public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 0; // Definindo a idade como 0 por padrão
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}