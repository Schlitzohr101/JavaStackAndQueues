public class Stack {
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
        return  (head.getNext() == null ? true : false);
    }

    public void Push(Node N) {
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
            temp.setNext(temp.getNext());
        }
        return temp;
    }

}
