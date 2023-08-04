
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("Создать двусвязный список длиной 15 элементов");
        for (int i = 0; i<15; i++) {
            int r = (int) (Math.random() * 100);
            Node node = new Node(r);
            if (i == 0) {
                list.head = node;
            } else {
                list.head.append(node);
            }
            list.tail = node;
        }
        System.out.println(list.toString());
        System.out.println(list.reverse());
    }
}