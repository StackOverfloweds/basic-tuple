import java.util.List;

import Conf.ParticipantData;
import Conf.ParticipantDisplay;
import util.Tuple;

public class main {
    public static void main(String[] args) {
        // Fitur 1 : storing data peserta and scores exam
        ParticipantData participantData = new ParticipantData();
        participantData.addParticipant("Budi", 80);
        participantData.addParticipant("putri", 76);
        participantData.addParticipant("Chika", 89);

        // Fitur 2 : Display List Peserta With Score Exam
        ParticipantDisplay participantDisplay = new ParticipantDisplay();
        List<Tuple<String, Integer>> participantScores = participantData.getParticipantScores();
        participantDisplay.displayScores(participantScores);
    }

}
