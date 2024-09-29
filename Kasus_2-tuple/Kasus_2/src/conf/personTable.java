package conf;

import java.util.ArrayList;
import java.util.List;

import util.Tuple;

public class personTable {

    private List<Tuple> tuples;

    public personTable() {
        tuples = new ArrayList<>();
    }

    public void addPerson(conf.person person) {
        tuples.add(new Tuple(person.getId(), person.getName(), person.getAge()));
    }

    public List<Tuple> getTuples() {
        return tuples;
    }

}
