public class Node {
    private int value;
    private Node next;
    private Node previous;

    public Node(int x) {
        value = x;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public int getValue() {
        return value;
    }

}
