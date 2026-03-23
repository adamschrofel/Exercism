import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {
    private List<Integer> scores = new ArrayList<>();

    public HighScores(List<Integer> highScores) {
        this.scores = highScores;
    }

    List<Integer> scores() {
        return scores;
    }

    Integer latest() {
        return scores.get(scores.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(scores);
    }

    List<Integer> personalTopThree() {
        List<Integer> scoresCopy = new ArrayList<>(scores);

        scoresCopy.sort(Collections.reverseOrder());

        int limit = Math.min(3, scoresCopy.size());
        return scoresCopy.subList(0, limit);
    }

}
