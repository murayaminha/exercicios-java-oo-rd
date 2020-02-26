package exercicio03;
public class Perfumaria extends Produto{

    private double precoPromocional;
    private int lmpm;
    private double precoLmpm;

    public Perfumaria(int id, String nome, double precoDeVenda, double descontoSite, int lmpm, double precoPromocional,  double precoLmpm) {
        super(id, nome, precoDeVenda, descontoSite);
        this.precoPromocional = precoPromocional;
        this.lmpm = lmpm;
        this.precoLmpm = precoLmpm;
    }

    public Perfumaria() {}


}





// TODO: implemente o código-fonte de Perfumaria.java
