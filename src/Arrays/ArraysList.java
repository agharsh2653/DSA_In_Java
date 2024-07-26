package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArraysList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax of Array List
        ArrayList<Integer> list = new ArrayList<>(9);
        //ArrayList just not depend on the initialisation
        // lise capacity of list we can add variable more than capacity

//        list.add(45);
//        list.add(83);
//        list.add(478);
//        list.add(43);
//        list.add(654);
//        list.add(8765);
//        System.out.println(list.contains(2944));
//        System.out.println(list);
//        list.set(0, 67);
//        list.remove(2);
//        System.out.println(list);

        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }
        for(int i=0; i<5; i++){
            System.out.print(list.get(i)+", ");  //pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
