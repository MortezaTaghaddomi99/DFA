package ac.tla.morteza;


@FunctionalInterface
public interface TransitionFunction {
    State setTransition(State s1, char c);
}
