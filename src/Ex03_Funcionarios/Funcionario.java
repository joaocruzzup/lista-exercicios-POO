package Ex03_Funcionarios;

import java.time.LocalDate;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private double salario;
    private int id;
    private static int idContador = 0;

    public Funcionario(){
        setIdContador(getIdContador() + 1);
        setId(getIdContador());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        Scanner entrada = new Scanner(System.in);
        while (dataAdmissao.isAfter(LocalDate.now())){
            System.out.println("Erro: Data de admissão não pode ser posterior a data ");
            System.out.print("Digite o dia de admissão: ");
            int dia = entrada.nextInt();
            System.out.print("Digite o mês de admissão: ");
            int mes = entrada.nextInt();
            System.out.print("Digite o ano de admissão: ");
            int ano = entrada.nextInt();
            dataAdmissao = LocalDate.of(ano, mes, dia);
        }
        this.dataAdmissao = dataAdmissao;}

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        Scanner entrada = new Scanner(System.in);
        while (salario < 700.0){
            System.out.println("Erro: O salário mínimo é R$700,00. Assim, o salário foi redefinido para 700");
            System.out.print("Digite um salário compatível: ");
            salario = entrada.nextInt();
        }
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdContador() {
        return idContador;
    }

    public static void setIdContador(int idContador) {
        Funcionario.idContador = idContador;
    }
}
