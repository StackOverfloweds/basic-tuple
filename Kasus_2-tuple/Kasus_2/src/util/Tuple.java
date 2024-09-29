package util;

public class Tuple {
    private Object[] values;

    public Tuple(Object... values) {
        this.values = values;
    }

    // make a getter
    public Object getValues(int index) {
        return values[index];
    }
    //make a setter
    public void setValues(int index, Object value) {
        values[index] = value;
    }
}