package program;
import java.util.*;

public class MEF {
    private List<Estado> estados;
    private List<String> alfabeto;
    private List<Transicao> transicoes;
    private Estado estadoInicial;

    public MEF(List<Estado> estados, List<String> alfabeto,
               List<Transicao> transicoes, Estado estadoInicial) {
        this.estados = estados;
        this.alfabeto = alfabeto;
        this.transicoes = transicoes;
        this.estadoInicial = estadoInicial;
    }
    
    public Set<Estado> fechoEpsilon(Estado estado) {
        Set<Estado> resultado = new HashSet<>();
        Stack<Estado> pilha = new Stack<>();

        pilha.push(estado);
        resultado.add(estado);

        while (!pilha.isEmpty()) {
            Estado atual = pilha.pop();

            for (Transicao t : transicoes) {
                if (t.getOrigem().equals(atual) && t.getSimbolo().equals("ε")) {
                    Estado destino = t.getDestino();
                    if (!resultado.contains(destino)) {
                        resultado.add(destino);
                        pilha.push(destino);
                    }
                }
            }
        }

        return resultado;
    }
}
    