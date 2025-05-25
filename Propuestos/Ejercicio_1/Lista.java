public class Lista<T> {
    private Node<T> root;
    private int size;

    public Lista() {
        root = null;
        size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (root == null) {
            root = newNode;
        } else {
            Node<T> current = root;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
        size++;
    }
}