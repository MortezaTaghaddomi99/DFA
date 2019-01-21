package ac.tla.morteza;


import java.util.Set;

public class Test {
    public static void main(String[] args) {
        State s = new State("q0");
        s.setStart(true);

        State f = new State("q2");
        f.setFinal(true);

        s.setTransition('0', s);
        s.setTransition('1', f);

        f.setTransition('1', f);
        f.setTransition('0', s);

        DFA dfa = new DFA(s, Set.of(s,f), "[ab]", Set.of(f));


    }

}
