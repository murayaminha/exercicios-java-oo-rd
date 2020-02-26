package exercicio02;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salarioMensal, double bonus) {
        super(nome, salarioMensal);
        this.bonus = bonus;
    }
    public Gerente(int bonus) {
    }

    @Override
    public double salarioAnual() {
        double rendaAnual;
        rendaAnual = (((getSalarioMensal()*13)*this.bonus/100)+getSalarioMensal()*13);
        return rendaAnual;
    }
    // TODO: implemente o código desta classe

}
