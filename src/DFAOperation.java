import java.util.Set;

public abstract class DFAOperation {

    private Pair initStates;
//    private DFA fDFA;
//    private DFA sDFA;
    private Set<Pair> states;
    private Set<Pair> finalStates;

    public DFAOperation(DFA f, DFA s) {
        initStates = new Pair(f.getStart(), s.getStart());
    }

    public Pair transiation(Pair ts, char symbol) {
        return ts.getTransition(symbol);
    }

    public boolean isAcceptable(String input) {
        return isAcceptable(input, initStates, 0);
    }

    abstract boolean isAcceptable(String input, Pair state, int len);
}
