public class Tuple<A, B> {

    // Declaration Variable Final
    private final A first;
    private final B second;

    // make a constructor
    public Tuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    //create get

    public A getFirst () {
        return first;
    }

    public B getSecond () {
        return second;
    }

 }
