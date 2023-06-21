package Ex03_Funcionarios;

import java.time.LocalDate;

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
    // Teste feito com id sem ser estático

//    public Funcionario(){
//        setId(getId() + 1);
//    }

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
        if (dataAdmissao.isAfter(LocalDate.now())){
            System.out.println("Erro: Data de admissão não pode ser posterior a data ");
            // toDo Perguntar a Carol se é bom colocar Scanner dentro do Set
            this.dataAdmissao = LocalDate.now();
        } else{
            this.dataAdmissao = dataAdmissao;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 700.0){
            System.out.println("Erro: O salário mínimo é R$700,00. Assim, o salário foi redefinido para 700");
            this.salario = 700.0;
        } else {
            this.salario = salario;
        }
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
