import java.util.HashMap;
import java.util.Map;

public class State {
    private Map<Character, State> tf;
    private boolean isFinal;
    private boolean isStart;
    private String text;

    public State(boolean isStart, boolean isFinal, String text) {
        this.isStart = isStart;
        this.isFinal = isFinal;
        this.text = text;
        tf = new HashMap<>();
    }

    public State(String text) {
        this.text = text;
        tf = new HashMap<>();
    }

    public void setFinal(boolean f) {
        isFinal = f;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

    public void setTransition(Character c, State s) {
        tf.put(c, s);
    }

    public State getTransition(char c) {
        return tf.get(c);
    }

    @Override
    public boolean equals(Object obj) {
        return text.equals(obj);
    }

    @Override
    public int hashCode() {
        return text.hashCode();
    }

    @Override
    public String toString() {
        return text;
    }

    public boolean isFinal() {
        return isFinal;
    }
}
