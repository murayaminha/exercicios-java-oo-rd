package exercicio02;

public class AuxiliarEscritorio extends Funcionario {
    private double bonusAnual;

    public AuxiliarEscritorio(String nome, double salarioMensal, double bonusAnual) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
    }

    public AuxiliarEscritorio() {}

    @Override
    public double salarioAnual() {
            double rendaAnual;
            rendaAnual = (getSalarioMensal()*13)+this.bonusAnual;
            return rendaAnual;
    }

    // TODO: implemente o código desta classe

}
