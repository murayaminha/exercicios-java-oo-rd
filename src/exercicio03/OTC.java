package exercicio03;

 public class OTC extends Produto{
     private double precoPromocional;

     public OTC(int id, String nome, double precoDeVenda, double descontoSite, double precoPromocional) {
         super(id, nome, precoDeVenda, descontoSite);
         this.precoPromocional = precoPromocional;
     }

     public OTC() {}

 }
// TODO: implemente o código-fonte de OTC.java
