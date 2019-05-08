public class Stack {
    private Node head;

    public boolean isEmpty() {
        return  (head == null);
    }

    public void Push(int x) {
        Node N = new Node(x);
        if (!isEmpty()) {
            Node temp = head;
            while (temp.getNext() != null) {
                temp.setNext(temp.getNext());
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
                temp.setNext(temp.getNext());
            }
            temp.getPrevious().setNext(null);
            temp.setPrevious(null);
        } else  {
            temp = null;
        }
        return temp;
    }

    public Node peekFirst() {
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp;
    }

}
