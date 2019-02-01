import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

public class Controller implements Initializable {
    @FXML
    private BorderPane root;

    @FXML
    private GridPane container;

    private GraphicDFA dfa;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        dfa = new GraphicDFA();

//        root.setCenter(dfa);
        root.setCenter(container);
//        dfa.widthProperty().bind(root.widthProperty());
//        dfa.heightProperty().bind(root.heightProperty().subtract(50));
        initDFA();
    }

    public void initDFA() {
        State s = new State("q0");
        s.setStart(true);

        State f = new State("q2");
        f.setFinal(true);

        s.setTransition('0', s);
        s.setTransition('1', f);

        f.setTransition('1', f);
        f.setTransition('0', s);

        DFA firstDfa = new DFA(s, Set.of(s, f), Set.of('a', 'b'), Set.of(f));
        firstDfa.draw(container);

        State s2 = new State("q0");
        s2.setStart(true);

        State f2 = new State("q2");
        f2.setFinal(true);

        s2.setTransition('0', s2);
        s2.setTransition('1', f2);

        f2.setTransition('1', f2);
        f2.setTransition('0', s2);

        DFA secondDfa = new DFA(s2, Set.of(s2, f2), Set.of('1', '0'), Set.of(f2));

        DFAOperation subscribeOfDfa = new SubscribeOfDfa(firstDfa, secondDfa);
        DFAOperation unionOfDfa = new UnionOfDfa(firstDfa, secondDfa);
        System.out.println(subscribeOfDfa.isAcceptable("10001"));
        System.out.println(unionOfDfa.isAcceptable("10001"));


    }


}