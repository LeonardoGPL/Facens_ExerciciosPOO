
package poo.lista02;


public class Vendedor {
    private int codigo;
 private String nome;
    private double percentualComissao;
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
   
    
    public Vendedor(){
        
    }
    public Vendedor(int codigo,String nome,double percentualComissao){
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }
    public double CalcularPagamentoComissao(double valorVenda){
        return valorVenda*percentualComissao/100;
    }
    public double CalcularPagamentoComissao(double valorVenda,double desconto){
        return valorVenda-desconto;
        
    }
    static double calcularPagamentoComissao(double valorVenda,double percentualComissao){
        return 0;
    }
    public String imprimir(double valorVenda,double desconto){
      return "-----Vendedor-----"+
              "\nCodigo: " + codigo +
              "\nNome: " + nome +
              "\nValor da Venda: " + valorVenda +
              "\n% Comissao: " + percentualComissao +
              "\nDesconto: " + desconto +
              "\nValor a Pagar: " + CalcularPagamentoComissao(valorVenda, desconto);
    }
    
    
}
