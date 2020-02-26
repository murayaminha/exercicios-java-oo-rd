package exercicio03;

public class Produto{
    private int id;
    private String nome;
    private double precoDeVenda;
    private double descontoSite;

    public Produto(int id, String nome, double precoDeVenda, double descontoSite) {
        this.id = id;
        this.nome = nome;
        this.precoDeVenda = precoDeVenda;
        this.descontoSite = descontoSite;
    }
    public Produto(){}


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public double getDescontoSite() {
        return descontoSite;
    }
}

// TODO: implemente o código-fonte de Produto.java

