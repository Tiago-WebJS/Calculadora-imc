package main.java;

public class Atleta extends PessoaBase implements CalculadoraIMC {

    private String modalidade;

    public Atleta(String nome, int idade, double peso, double altura,
                  String modalidade) throws EntradaInvalidaException {
        super(nome, idade, peso, altura);
        if (modalidade == null || modalidade.trim().isEmpty()) {
            throw new EntradaInvalidaException("Modalidade não pode ser vazia.");
        }
        this.modalidade = modalidade.trim();
    }

    @Override
    public double calcularIMC() {
        return getPeso() / (getAltura() * getAltura());
    }

    @Override
    public String classificarIMC(double imc) {
        if (imc < 17.0) {
            return "Abaixo do peso (atleta)";
        } else if (imc < 27.0) {
            return "Normal (atleta)";
        } else if (imc < 33.0) {
            return "Sobrepeso (atleta)";
        } else {
            return "Obesidade (atleta)";
        }
    }

    @Override
    public String getTipoCategoria() {
        return "Atleta - " + modalidade;
    }

    public String exibirResultado() {
        double imc = calcularIMC();
        String classe = classificarIMC(imc);
        return String.format(
            "%s%n[Tipo: %s] IMC: %.2f → %s",
            getDescricao(), getTipoCategoria(), imc, classe
        );
    }
}