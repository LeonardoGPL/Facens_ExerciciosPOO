package poo.lista02;

public class Apolice {

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorautomovel() {
        return valorautomovel;
    }

    public void setValorautomovel(double valorautomovel) {
        this.valorautomovel = valorautomovel;
    }

    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorautomovel;

    public Apolice() {

    }

    public Apolice(int numero, String nome, int idade, char sexo, double valorautomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorautomovel = valorautomovel;
    }

    public double CalcularValor() {
        if (sexo == 'M' && idade <= 25) {
            return valorautomovel * 10 / 100;

        } else if (sexo == 'M' && idade > 25) {
            return valorautomovel * 5 / 100;
        } else if (sexo == 'F') {
            return valorautomovel * 2 / 100;
        }
        return 0;

    }
    public String imprimir(){
        
        return "-----Apolice-----"+
                "\nNumero: " + numero +
                "\nNome: " + nome +
                "\nIdade: " +idade +
                "\nSexo: " + sexo +
                "\nValor Automovel: " + valorautomovel +
                "\nValor Apolice: " + CalcularValor();
        
    }
}
