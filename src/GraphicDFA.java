import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GraphicDFA extends Canvas {
    private DFA dfa;
    private Circle insertCircle;

    public GraphicDFA() {
        widthProperty().addListener(evt -> drawDFA());
        heightProperty().addListener(evt -> drawDFA());

        createDFA();
    }

    private void createDFA() {

        State s = new State("q0");
        s.setStart(true);

        State f = new State("q2");
        f.setFinal(true);

        s.setTransition('0', s);
        s.setTransition('1', f);

        f.setTransition('1', f);
        f.setTransition('0', s);

        final int RADIUS = 20;


        dfa = new DFA(s, Set.of(s, f), Set.of('0', '1'), Set.of(f));
        State a = s.getTransition('1');
        System.out.println(a);
        System.out.println(dfa);


        List<Circle> circleList = new ArrayList<>();
        GraphicsContext gc = getGraphicsContext2D();
        System.out.println("dfa.getStates().size() = " + dfa.getStates().size());
        for (int i = 0; i < dfa.getStates().size(); i++) {
            circleList.add(new Circle(20));
            gc.strokeOval(100, 100, 4 * RADIUS, 2 * RADIUS);
            gc.setFill(Color.BLUE);
//            gc.setStroke(Color.BROWN);
//            gc.strokeLine(200, 200, 100, 100);
//            gc.clearRect(0, 0, 400, 400);

        }
        drawDFA();
    }

    private void drawDFA() {
        double width = getWidth();
        double height = getHeight();

        GraphicsContext gc = getGraphicsContext2D();
        gc.clearRect(0, 0, width, height);

        drawDFA(gc, dfa.getStart(), 0, this.getWidth(), 0, this.getHeight());
        drawCircles(gc, dfa.getStart(), 0, this.getWidth(), 0, this.getHeight());


    }

    private void drawCircles(GraphicsContext gc, State state, double xMin, double xMax, double yMin, double yMax) {


    }

    private void drawDFA(GraphicsContext gc, State staet, double xMin, double xMax, double yMin, double yMax) {

    }


}
