package LinkList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(98);
        list.insert(32,3);
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.insertRec(88,2);
        list.display();

//        DLL dlist = new DLL();
//        dlist.insertFirst(3);
//        dlist.insertFirst(2);
//        dlist.insertFirst(8);
//        dlist.insertFirst(17);
//        dlist.insertFirst(9);
//        dlist.insertLast(99);
//        //dlist.display();
//        dlist.insert(8,65);
//        dlist.display();

        CLL clist = new CLL();
        clist.insert(23);
        clist.insert(3);
        clist.insert(19);
        clist.insert(75);
        clist.delete(19);
        clist.display();

    }
}
