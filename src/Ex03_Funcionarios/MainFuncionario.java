package Ex03_Funcionarios;

import java.time.LocalDate;

public class MainFuncionario {
    public static void main(String[] args) {
//        Instanciar Local Date com números
        LocalDate d10 = LocalDate.of(2023, 3, 9);

        System.out.println("----- Teste set e get para funcionario -----");
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("João");
        funcionario1.setDataAdmissao(LocalDate.parse("2023-06-19"));
        funcionario1.setSalario(700);

        System.out.println("Id: " + funcionario1.getId());
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("Data de Admissão: " + funcionario1.getDataAdmissao());

        System.out.println("\n----- Teste com valores inválidos para salário e data de admissão -----");
        funcionario1.setSalario(500);
        funcionario1.setDataAdmissao(LocalDate.parse("2023-07-01"));
        System.out.println("Salário novo: " + funcionario1.getSalario());
        System.out.println("Data nova: " + funcionario1.getDataAdmissao());

        System.out.println();
        Funcionario funcionario2 = new Funcionario();
        System.out.println(funcionario2.getId());

        Funcionario funcionario3 = new Funcionario();
        System.out.println(funcionario3.getId());

    }
}
