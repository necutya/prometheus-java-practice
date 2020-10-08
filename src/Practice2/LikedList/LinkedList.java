package Practice2.LikedList;

public class LinkedList {
    private Node node, start_node;
    private int size;

    public LinkedList() {
        start_node = new Node();
        start_node.setNext(new Node());
        size = 0;
    }

    public void add(Integer data) {
        node = start_node.getNext();
        while(node.getNext() != null){
            node = node.getNext();
        }
        if (size == 0) {
            node.setData(data);
            size++;
        } else {
            Node new_node = new Node();
            new_node.setData(data);
            node.setNext(new_node);
            node = node.getNext();
            size++;
        }
    }

    public Integer get(int index) {
        node = start_node.getNext();
        for (int i = 0; i < size; i++) {
            if (index == i) {
                return node.getData();
            }
            node = node.getNext();
        }
        return -1;
    }

    public boolean delete(int index) {
        Node next_node, prev_node;
        prev_node = start_node;
        node = start_node.getNext();


        for (int i = 0; i < size; i++) {
            if (index == i) {
                next_node = node.getNext();
                prev_node.setNext(next_node);
                size--;
                return true;
            }
            prev_node = node;
            node = node.getNext();
        }
        return false;
    }

    public int size() {
        return size;
    }
}
