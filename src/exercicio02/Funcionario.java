package exercicio02;

public abstract class Funcionario {

    // TODO: implemente o código desta classe
    private String nome;
    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }
    public Funcionario(){}

    public double salarioAnual(){
        double rendaAnual;
        rendaAnual = salarioMensal*13;
        return rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
