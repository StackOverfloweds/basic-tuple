package Display;

import util.Tuple;
import java.util.List;

public class DataDisplay {
    public void displayData(List<Tuple> tuples) {
        System.out.println("data dalam table");

        for (Tuple tuple : tuples) {
            int id = (int) tuple.getValues(0);
            String name = (String) tuple.getValues(1);
            int age = (int) tuple.getValues(2);
            System.out.println("ID : " + id + " Name : " + name + " Age : " + age);
        }
    }
}
