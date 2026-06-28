package br.edu.uniceub;

public class EntradaInvalidaException extends Exception {

// Professor e  tipo uma exceção de personalidade quando o usuário
// Fornece dados inválidos (nome vazio, peso negativo e por ai vai)
    public EntradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}