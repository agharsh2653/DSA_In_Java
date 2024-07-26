package GenericMethod;

public class swapTest {
    String name;
    float marks;
    swapTest(String name, float marks){
        this.name=name;
        this.marks=marks;
    }
}
class person{
    public static <object>void swap(object x, object y){
        object t;
        t=x;
        x=y;
        y=t;
    }

    public static void main(String[] args) {
//        object p1 = new swapTest("harsh",23);
//        Double p2 = new Double("Rahul",3);
    }
}
