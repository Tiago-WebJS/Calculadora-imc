package br.edu.uniceub;

import java.util.Scanner;

public class SistemaIMC {

    // Composição: SistemaIMC tem-um Historico
    private Historico historico;
    private Scanner scanner;

    public SistemaIMC() {
        this.historico = new Historico();
        this.scanner   = new Scanner(System.in);
    }

    public void iniciar() {
        exibirBemVindo();
        boolean rodando = true;

        while (rodando) {
            exibirMenu();
            try {
                int opcao = lerInteiro("Escolha: ");
                switch (opcao) {
                    case 1 -> cadastrarPessoa();
                    case 2 -> cadastrarAtleta();
                    case 3 -> historico.exibir();
                    case 4 -> {
                        System.out.println("\n  Saindo... Até mais!\n");
                        rodando = false;
                    }
                    default ->
                        System.out.println("  Opção inválida. Tente novamente.");
                }
            } catch (EntradaInvalidaException e) {
                // Captura nossa exceção personalizada
                System.out.println("\n  ❌ Erro: " + e.getMessage());
            } catch (Exception e) {
                // Captura qualquer outro erro inesperado
                System.out.println("\n  ❌ Entrada inválida. Digite um número seguido de virgula caso seja um número quebrado.");
                scanner.nextLine(); // limpa o buffer
            }
        }
    }

    // Cadastro de pessoa comum 
    private void cadastrarPessoa() throws EntradaInvalidaException {
        System.out.println("\n  ── Cadastrar Pessoa ──");
        String nome   = lerTexto("  Nome: ");
        int    idade  = lerInteiro("  Idade: ");
        double peso   = lerDecimal("  Peso (kg): ");
        double altura = lerDecimal("  Altura (m, ex: 1.75): ");

        Pessoa p = new Pessoa(nome, idade, peso, altura);
        String resultado = p.exibirResultado();
        System.out.println("\n  " + resultado);
        historico.adicionar(resultado);
    }

    // Cadastro de Pessoa Atleta 
    private void cadastrarAtleta() throws EntradaInvalidaException {
        System.out.println("\n  ── Cadastrar Atleta ──");
        String nome       = lerTexto("  Nome: ");
        int    idade      = lerInteiro("  Idade: ");
        double peso       = lerDecimal("  Peso (kg): ");
        double altura     = lerDecimal("  Altura (m, ex: 1.80): ");
        String modalidade = lerTexto("  Modalidade esportiva: ");

        Atleta a = new Atleta(nome, idade, peso, altura, modalidade);
        String resultado = a.exibirResultado();
        System.out.println("\n  " + resultado);
        historico.adicionar(resultado);
    }

    // Helpers de leitura (Falicitador de leitura para analisar documentos e exibição)

    private String lerTexto(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private int lerInteiro(String prompt) {
        System.out.print(prompt);
        int valor = scanner.nextInt();
        scanner.nextLine(); 
        return valor;
    }

    private double lerDecimal(String prompt) {
        System.out.print(prompt);
        double valor = scanner.nextDouble();
        scanner.nextLine(); 
        return valor;
    }

    // ── Exibição ──
    /*coloquei essecaracteres text blocks
    para ficar mais organizado em um box*/

    private void exibirBemVindo() {
        System.out.println("""
           
            ╔══════════════════════════════════╗
            ║        Calculadora de IMC        ║
            ║          POO - UNICEUB           ║
            ╚══════════════════════════════════╝
            """);
    }

    private void exibirMenu() {
        System.out.println("""
            \n  ┌─────────────────────────┐
              │  1. Cadastrar Pessoa     │
              │  2. Cadastrar Atleta     │
              │  3. Ver Histórico        │
              │  4. Sair                 │
              └─────────────────────────┘""");
    }
}