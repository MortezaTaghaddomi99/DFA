@FunctionalInterface
public interface TransitionFunction {
    State setTransition(State s1, char c);
}
