package Practice2.LikedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.delete(2);

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
