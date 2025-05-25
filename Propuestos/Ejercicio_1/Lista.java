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

    public boolean remove(T data) {
        if (root == null) return false;

        if (root.getData().equals(data)) {
            root = root.getNextNode();
            size--;
            return true;
        }

        Node<T> current = root;
        while (current.getNextNode() != null) {
            if (current.getNextNode().getData().equals(data)) {
                current.setNextNode(current.getNextNode().getNextNode());
                size--;
                return true;
            }
            current = current.getNextNode();
        }
        return false;
    }

    public boolean contains(T data) {
        Node<T> current = root;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNextNode();
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void clear() {
        root = null;
        size = 0;
    }

    public void printList() {
        Node<T> current = root;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNextNode();
        }
    }
}
