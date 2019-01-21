package ac.tla.morteza;

import java.util.List;
import java.util.Set;

public class DFA{
    private State start;
    private Set<State> states;
    private String alphabet;
    private Set<State> finals;

    public DFA(State start, Set<State> states, String alphabet, Set<State> finals) {
        this.start = start;
        this.states = states;
        this.alphabet = alphabet;
        this.finals = finals;
    }
}
