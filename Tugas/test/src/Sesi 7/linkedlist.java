import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            linkedList.add(i);  // Menambahkan elemen ke LinkedList
        }


        boolean isContains = linkedList.contains(  5);  // Mengecek apakah LinkedList berisi elemen 5
        System.out.println(linkedList.getLast());   // Mengambil elemen terakhir dari LinkedList
        System.out.println("Is 5 in the LinkedList? " + isContains);
        System.out.println("LinkedList: " + linkedList);
    }
}
