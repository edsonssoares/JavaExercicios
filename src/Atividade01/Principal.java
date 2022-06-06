package Atividade01;

public class Principal {

    public static void main(String[] args) {
        Funcionario F1 = new Funcionario("José", 31, "Supervisor", "Ativo");
        Funcionario F2 = new Funcionario("Carlos", 18, "ASG", "Ativo");
        Funcionario F3 = new Funcionario("Júlia", 22, "Engenheira", "Ativo");
        Funcionario F4 = new Funcionario("Álvaro", 21, "Técnico", "Ativo");

        F1.setSituacao("Inativo");
        System.out.println("O funcionário: " + F1.getNome() + " foi demitido e a sua situação dele agora é de: " + F1.getSituacao() + " no sistema.");

        F2.setCargo("Auxiliar Técnico");
        System.out.println("O funcionário: " + F2.getNome() + " foi promovido para o cargo de " + F2.getCargo() + ". Parabéns!!!");

        F3.fazerAniversario();
        System.out.println("A funcionária: " + F3.getNome() + " está comemorando mais um ano de vida! Parabéns Júlia pelo os seus " + F3.getIdade() + " anos!!!");

        F4.pagamento();




    }


}
