public class SubscribeOfDfa extends DFAOperation {

    public SubscribeOfDfa(DFA f, DFA s) {
        super(f, s);
    }

    @Override
    boolean isAcceptable(String input, Pair state, int len) {
        if (len == input.length()) {
            System.out.println(state);
            if (state.getFirst().isFinal() && state.getSecond().isFinal()) {
                return true;
            }else return false;
        }

        Pair pair = state.getTransition(input.charAt(len));
        System.out.println(pair);
        return isAcceptable(input, pair, len + 1);

    }
}
