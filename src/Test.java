import java.util.Set;

public class Test {
   /* public static void main(String[] args) {
        State s = new State("q0");
        s.setStart(true);

        State f = new State("q2");
        f.setFinal(true);

        s.setTransition('0', s);
        s.setTransition('1', f);

        f.setTransition('1', f);
        f.setTransition('0', s);

        DFA firstDfa = new DFA(s, Set.of(s,f), Set.of('a','b'), Set.of(f));

        State s2 = new State("q0");
        s2.setStart(true);

        State f2 = new State("q2");
        f2.setFinal(true);

        s2.setTransition('0', s2);
        s2.setTransition('1', f2);

        f2.setTransition('1', f2);
        f2.setTransition('0', s2);

        DFA secondDfa = new DFA(s2, Set.of(s2,f2), Set.of('1','0'), Set.of(f2));

        DFAOperation subscribeOfDfa = new SubscribeOfDfa(firstDfa, secondDfa);
        DFAOperation unionOfDfa = new UnionOfDfa(firstDfa, secondDfa);
        System.out.println(subscribeOfDfa.isAcceptable("10001"));
        System.out.println(subscribeOfDfa.isAcceptable("10001"));


    }
*/
}
