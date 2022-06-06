package Atividade01;

public class Funcionario {

    private String nome;
    private int idade;
    private String cargo;
    private String situacao;

    public Funcionario (String nome, int idade, String cargo, String situacao) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.situacao = situacao;
    }

    public void demitir() {
        System.out.println("O funcionário: " + getNome() + ", foi demitido.");
    }

    public void promover() {
        System.out.println("O funcionário: " + getNome() + ", foi promovido. Parabéns!!!");
    }

    public void aniversario() {
        System.out.println("Parabéns pelo seu aniversário: " + getNome() + ". Felicidades!!!");
    }

    public void pagamento() {
        System.out.println("Receba o seu salário funcionário: " + getNome() + ". Favor assinar o Contracheque.");
    }

    public void fazerAniversario() {
        this.idade++;
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
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }



}
