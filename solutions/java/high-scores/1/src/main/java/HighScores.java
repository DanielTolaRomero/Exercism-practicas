import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HighScores {
    private List<Integer> scores;
    private List<Integer> ordenedScores;

    public HighScores(List<Integer> highScores) {
        this.scores = highScores;
        this.ordenedScores = new ArrayList<>(highScores);
        Collections.sort(ordenedScores, Collections.reverseOrder());
    }

    List<Integer> scores() {
        return scores;
    }

    Integer latest() {
        return scores.get(scores.size()-1);
    }

    Integer personalBest() {
        return ordenedScores.get(0);
    }

    List<Integer> personalTopThree() {
        return ordenedScores.size()>=3 ? ordenedScores.subList(0,3) : ordenedScores;
    }

}
