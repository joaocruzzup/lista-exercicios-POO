package Ex03_Funcionarios;

import java.time.LocalDate;

public class MainFuncionario {
    public static void main(String[] args) {

        System.out.println("***** [TESTE] Funcionário com data e salários válidos *****");
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("João");
        funcionario1.setDataAdmissao(LocalDate.of(2023, 4, 20)); // Data válida
        funcionario1.setSalario(700); // Salário válido

        imprimirFuncionario(funcionario1);

        System.out.println("\n***** [TESTE] Funcionário com salário válido e data inválida *****");
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Carol");
        funcionario2.setDataAdmissao(LocalDate.of(2023, 12, 20)); // Data inválida
        funcionario2.setSalario(800); // Salário válido

        imprimirFuncionario(funcionario2);

        System.out.println("\n***** [TESTE] Funcionário com salário inválido e data inválida *****");
        Funcionario funcionario3 = new Funcionario();
        funcionario2.setNome("Victor");
        funcionario2.setDataAdmissao(LocalDate.of(2023, 12, 20)); // Data inválida
        funcionario2.setSalario(500); // Salário inválido

        imprimirFuncionario(funcionario3);

    }

    public static void imprimirFuncionario(Funcionario funcionario){
        System.out.println("------- Informações do funcionário" + funcionario.getId() + "-------");
        System.out.println("Id: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
        System.out.println("-------------------------------------------");
    }
}
