import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("=======================");

        // add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        System.out.println("=======================");

        // get elements
        int element_1 = list.get(0);
        int element_2 = list.get(1);
        int element_3 = list.get(2);

        System.out.print(element_1 + ", ");
        System.out.print(element_2 + ", ");
        System.out.println(element_3);

        System.out.println("=======================");

        // add elements in between
        list.add(1, 1);
        list.add(2, 2);
        list.add(3, 3);

        System.out.println(list);

        System.out.println("=======================");

        // set elements
        list.set(0, 5);
        list.set(5, 6);

        System.out.println(list);

        System.out.println("=======================");

        // delete elements
        list.remove(4);

        System.out.println(list);

        list.remove(4);

        System.out.println(list);

        System.out.println("=======================");

        // size
        int size = list.size();

        System.out.println("Size of the array: " + size);

        System.out.println("=======================");

        //loops for ArrayList
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        System.out.println("=======================");
    }
}