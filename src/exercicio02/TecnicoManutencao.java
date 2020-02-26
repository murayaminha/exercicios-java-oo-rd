package exercicio02;

public class TecnicoManutencao extends Funcionario{
    private double bonusAnual;
    private double isalubridade;
    // TODO: implemente o código desta classe

    public TecnicoManutencao(String nome, double salarioMensal, double bonusAnual, double isalubridade) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
        this.isalubridade = isalubridade;
    }

    public TecnicoManutencao() {}

    @Override
    public double salarioAnual() {
        double rendaAnual;
        rendaAnual = (((getSalarioMensal()*13)*this.isalubridade/100)+getSalarioMensal()*13)+this.bonusAnual;
        return rendaAnual;
    }
}
