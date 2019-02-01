import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DFA {
    private State start;
    private Set<State> states;
    private Set<Character> alphabet;
    private Set<State> finals;

    public DFA(State start, Set<State> states, Set<Character> alphabet, Set<State> finals) {
        this.start = start;
        this.states = states;
        this.alphabet = alphabet;
        this.finals = finals;
    }

    public State getStart() {
        return start;
    }

    public Set<Character> getAlphabet() {
        return alphabet;
    }

    public Set<State> getStates() {
        return states;
    }

    public boolean isAccept(String input) {
        return true;

    }

    public State transiaion(State state, char c) {
        return state.getTransition(c);
    }

    @Override
    public String toString() {
        return "DFA{" +
                "start=" + start +
                ", states=" + states +
                ", alphabet=" + alphabet +
                ", finals=" + finals +
                '}';
    }

    public void draw(GridPane root) {
        int i = 0;
        int j = 0;
        for (State s : states) {
            if (i == 3) {
                j++;
                i = 0;
            }
            Circle state = new Circle(50, Color.BLUE);
            Line line = new Line();
            state.setAccessibleText(s.toString());

            root.add(state, i, j);
            i++;
        }

        root.add(new Circle(50, Color.BLUE), 0, 0);

    }
}
