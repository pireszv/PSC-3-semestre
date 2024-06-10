public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade não pode ser negativa!");
        }
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.setNome("Maria");
        pessoa.setIdade(30);
        System.out.println("Nome modificado: " + pessoa.getNome());
        System.out.println("Idade modificada: " + pessoa.getIdade());
    }
}
