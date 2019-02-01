import java.sql.SQLOutput;

public class Pair {
    private State first;
    private State second;

    public Pair(State first, State second) {
        this.first = first;
        this.second = second;
    }

    public State getFirst() {
        return first;
    }

    public State getSecond() {
        return second;
    }

    public Pair getTransition(char symbol){
        return new Pair(first.getTransition(symbol), second.getTransition(symbol));
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
