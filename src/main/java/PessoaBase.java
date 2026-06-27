package main.java;

public abstract class PessoaBase {

    //Atributos privados — encapsulamento,Inves de colocar Public por ser dados pessoaiss
    private String nome;
    private int idade;
    private double peso;    // em kg
    private double altura;  // em metros

    // atributos com validação
    public PessoaBase(String nome, int idade, double peso, double altura)
            throws EntradaInvalidaException {
        // Validações — lança exceção personalizada se inválido
        if (nome == null || nome.trim().isEmpty()) {
            throw new EntradaInvalidaException("Nome não pode ser vazio.");
        }
        if (idade <= 0 || idade > 150) {
            throw new EntradaInvalidaException("Idade inválida: " + idade);
        }
        if (peso <= 0 || peso > 600) {
            throw new EntradaInvalidaException("Peso inválido: " + peso);
        }
        if (altura <= 0 || altura > 3.0) {
            throw new EntradaInvalidaException("Altura inválida: " + altura);
        }

        this.nome   = nome.trim();
        this.idade  = idade;
        this.peso   = peso;
        this.altura = altura;
    }

    // Getters para proteger os dados e evitar ser modificado. 
    public String getNome()   { return nome; }
    public int    getIdade()  { return idade; }
    public double getPeso()   { return peso; }
    public double getAltura() { return altura; }

    // Setters para modificar os atributos de forma controlada
    public void setPeso(double peso) throws EntradaInvalidaException {
        if (peso <= 0) throw new EntradaInvalidaException("Peso inválido.");
        this.peso = peso;
    }

    // Método concreto — disponível para todas as subclasses
    /*Getdescrição e uma forma de formatar a resposta mais rapida 
    e correta de acordo com os placeholders e um getter especial basicamente*/
    public String getDescricao() {
        return String.format("Nome: %s | Idade: %d | Peso: %.1f kg | Altura: %.2f m",
                nome, idade, peso, altura);
    }

    // Método abstrato — cada subclasse deve implementar
    public abstract String getTipoCategoria();
}