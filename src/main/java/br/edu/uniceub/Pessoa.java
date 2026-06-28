package br.edu.uniceub;

public class Pessoa extends PessoaBase implements CalculadoraIMC {

    // Construtor chama o construtor da classe mãe (super)
    /* o super e para inicializar atributos da superclasse ou 
    classe pai de onde herda a classe atual*/
    public Pessoa(String nome, int idade, double peso, double altura)
            throws EntradaInvalidaException {
        super(nome, idade, peso, altura);
    }

    // Implementa o método da interface CalculadoraIMC
    /*@Override para garantir que 
    o método está realmente substituindo o da classe pai*/
    @Override
    public double calcularIMC() {
        // Fórmula: peso / (altura * altura)
        return getPeso() / (getAltura() * getAltura());
    }

    // Implementa o método abstrato de PessoaBase
    @Override
    public String getTipoCategoria() {
        return "Pessoa comum";
    }

    // Exibe o resultado completo
    public String exibirResultado() {
        double imc = calcularIMC();
        String classe = classificarIMC(imc); // método da interface
        return String.format(
            "%s%n[Tipo: %s] IMC: %.2f → %s",
            getDescricao(), getTipoCategoria(), imc, classe
        );
    }
}