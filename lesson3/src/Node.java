public class Node {
    private Node previous;
    private Node next;
    private int data;
    public Node(int data){
        this.data = data;
    }
    public Node getPrevious() {
        return previous;
    }
    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public void setData(int data) {
        this.data = data;
    }
    public boolean hasPrevious() {
        return this.previous != null;
    }
    public boolean hasNext() {
        return this.next != null;
    }
    public int getData() {
        return data;
    }
    public void append(Node node) {
        if (this.next == null) {
            this.next = node;
            node.previous = this;
        } else {
            this.next.append(node);
        }
    }

}
