
package program;

import java.util.List;
import java.util.Arrays;


public class Program {

    
    public static void main(String[] args) {
        Estado q0 = new Estado("q0", false);
        Estado q1 = new Estado("q1", false);
        Estado q2 = new Estado("q2", true);

        List<Estado> estados = Arrays.asList(q0, q1, q2);
        List<String> alfabeto = Arrays.asList("a", "b");
        List<Transicao> transicoes = Arrays.asList(
            new Transicao(q0, "ε", q1),
            new Transicao(q1, "ε", q2),
            new Transicao(q0, "a", q0),
            new Transicao(q1, "b", q1),
            new Transicao(q2, "a", q2)
        );

        MEF mef = new MEF(estados, alfabeto, transicoes, q0);

        System.out.println("Fecho-ε de q0:");
        for (Estado e : mef.fechoEpsilon(q0)) {
            System.out.println(e.getNome());
        }
    }
    
}
