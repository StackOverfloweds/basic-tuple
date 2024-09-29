package Conf;
import java.util.List;
import util.Tuple;

public class ParticipantDisplay {
    public void displayScores(List<Tuple<String, Integer>> participantScores) {
        System.out.println("Daftar Peserta Dan Nilai Ujian");
        for (Tuple<String, Integer> participant : participantScores) {
            String name = participant.getFirst();
            Integer scores = participant.getSecond();

            System.out.println(name + " : " + scores);
        }
    }
}
