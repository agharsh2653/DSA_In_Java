package GenericMethod;

class Test<T>{
    //An object of tyoe T is declared
    T obj;
    Test(T obj){ this.obj=obj; }
    public T getObjecct(){ return this.obj; }
}
public class Template {
    static <T>void genericPrint(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        Template temp = new Template();
        genericPrint(203);
        genericPrint("Joy with java");
        genericPrint(3.0123);

        Test<Integer> x= new Test<Integer>(23);
        System.out.println(x.getObjecct());
        Test<String> y= new Test<String>("GeeksforGeeks");
        System.out.println(y.getObjecct());
        Test<Double> z= new Test<Double>(23.9);
        System.out.println(z.getObjecct());

    }
}
