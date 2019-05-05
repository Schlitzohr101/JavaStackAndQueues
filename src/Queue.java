public class Queue {
    private class Node {
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
    private Node head;

    public boolean isEmpty() {
        return (head.getNext() == null ? true : false);
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
            N.setNext(N.getNext());
        }
        return N;
    }
}
