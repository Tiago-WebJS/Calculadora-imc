package main.java;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<String> registros;

    public Historico() {
        this.registros = new ArrayList<>();
    }

    // Adiciona um registro ao histórico
    public void adicionar(String registro) {
        registros.add(registro);
    }

    public void exibir() {
        if (registros.isEmpty()) {
            System.out.println("  Nenhum cálculo realizado nesta sessão.");
            return;
        }
        System.out.println("\n  ── Histórico da sessão ──");
        for (int i = 0; i < registros.size(); i++) {
            System.out.printf("  [%d] %s%n", i + 1, registros.get(i));
        }
        System.out.printf("%n  Total: %d cálculo(s) realizado(s).%n", registros.size());
    }

    public int getTotalRegistros() {
        return registros.size();
    }
}