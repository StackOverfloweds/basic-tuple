package util;

public class Tuple<A, B> {
    private final A first;
    private final B second;

    // make constructor
    public Tuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    //create getter
    public A getFirst() {
        return first;
    }
    public B getSecond() {
        return second;
    }

}
