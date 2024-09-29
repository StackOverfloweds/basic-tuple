package Conf;
import java.util.ArrayList;
import java.util.List;
import util.Tuple;

public class ParticipantData {
    private List<Tuple<String, Integer>> participantScores;

    public ParticipantData() {
        participantScores = new ArrayList<>();
    }

    public void addParticipant(String name, int score) {
        participantScores.add(new Tuple<String, Integer>(name, score));
    }

    public List<Tuple<String, Integer>> getParticipantScores() {
        return participantScores;
    }
}