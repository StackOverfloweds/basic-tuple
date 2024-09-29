import java.util.ArrayList;

public class mainTupple {
    public static void main(String[] args) throws Exception {
        ArrayList<Tuple<String, Integer>> listOfTuples = new ArrayList<>();
        listOfTuples.add(new Tuple<>("Data1", 1));
        listOfTuples.add(new Tuple<>("Data2", 2));
        listOfTuples.add(new Tuple<>("Data3", 3));

        // Iterasi melalui tuple menggunakan for-each loop
        for (Tuple<String, Integer> tuple : listOfTuples) {
            String dataString = tuple.getFirst();
            int dataInteger = tuple.getSecond();
            System.out.println("String: " + dataString + ", Integer: " + dataInteger);
        }
    }
}
