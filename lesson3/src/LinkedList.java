public class LinkedList {
    Node head;
    Node tail;
    public String reverse() {
        Node current = head;
        Node newHead = null;
        Node newLast = null;
        while (current != null) {
            Node previous = current.getPrevious();
            Node next = current.getNext();
            if (previous == null) newLast = current;
            if (next == null) newHead = current;
            current.setNext(previous);
            current.setPrevious(next);
            current = current.getPrevious();
        }
        head = newHead;
        tail = newLast;
        return this.toString();
    }

    public String toString() {
        Node current = head;
        StringBuilder stringBuilder = new StringBuilder();
        while (current != null) {
            stringBuilder.append(current.getData()).append(current.hasNext() ? " -> " : "");
            current = current.getNext();
        }
        return stringBuilder.toString();
    }
}
