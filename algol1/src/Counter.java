public class Counter {
    private int count = 0;
    private final String name;
    Counter(String id){
        name = id;
    }
    public void increment() {
        count++;
    }
    public int tally() {
        return count;
    }
    public String toString() {
        return count + " " + name;
    }

}
