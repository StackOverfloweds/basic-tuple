import addData.DataAdditional;
import conf.personTable;
import java.util.List;

import Display.DataDisplay;
import util.Tuple;

public class main {
    public static void main(String[] args) {
        personTable table = new personTable();
        DataAdditional addData = new DataAdditional();
        addData.addData(table);

        // Display
        List<Tuple> tuples = table.getTuples();

        DataDisplay display = new DataDisplay();
        display.displayData(tuples);

    }
}
