public class Queue {
    private Node head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void push(int x) {
        Node N = new Node(x);
        if (!isEmpty()) {
            Node temp = getLast();
            temp.setNext(N);
            N.setPrevious(temp);
        } else {
            head = N;
        }
    }

    public Node pop() {
        Node temp;
        if (!isEmpty()) {
            temp = head;
            head = temp.getNext();
            head.setPrevious(null);
            temp.setNext(null);
        } else {
            temp = null;
        }
        return temp;
    }

    public Node peekFirst() {
        return head;
    };

    private Node getLast() {
        Node N = head;
        while (N.getNext() != null) {
            N = N.getNext();
        }
        return N;
    }

    public boolean compareTo(Queue c) {
        boolean compares = true;
        Node tempA = head;
        Node tempC = c.peekFirst();
        while (tempA != null && tempC != null) {
            if (tempA.getValue() != tempC.getValue()) {
                compares = false;
            }
            tempA = tempA.getNext();
            tempC = tempC.getNext();
        }
        return compares;
    }
}
