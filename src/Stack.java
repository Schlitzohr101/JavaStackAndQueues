public class Stack {
    private Node head;

    public boolean isEmpty() {
        return  (head == null);
    }

    public void push(int x) {
        Node N = new Node(x);
        if (!isEmpty()) {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
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
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            if (temp == head) {
                head = null;
            } else {
                temp.getPrevious().setNext(null);
            }
            temp.setPrevious(null);
        } else  {
            temp = null;
        }
        return temp;
    }

    public Node peekFirst() {
        Node temp = head;
        if (!isEmpty()) {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
        }
        return temp;
    }

}
