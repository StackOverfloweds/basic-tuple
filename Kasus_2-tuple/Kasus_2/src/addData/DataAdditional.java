package addData;

import conf.person;
import conf.personTable;
public class DataAdditional {
    public void addData (personTable table) {
        table.addPerson(new person (1,"Bryan",25));
        table.addPerson(new person (2,"Budi",24));
        table.addPerson(new person (3,"sayang",23));
        table.addPerson(new person (4,"Clara",27));
        table.addPerson(new person (5,"putri",33));
        table.addPerson(new person (6,"putra",34));
    }
}
