
public class UnionOfDfa extends DFAOperation {

    public UnionOfDfa(DFA f, DFA s) {
        super(f, s);
    }


    boolean isAcceptable(String input, Pair state, int len) {
        if (len == input.length()) {
            if (state.getFirst().isFinal() || state.getSecond().isFinal()) {
                return true;
            }
        }

        Pair pair = state.getTransition(input.charAt(len));
        return isAcceptable(input, pair, len + 1);

    }
}

