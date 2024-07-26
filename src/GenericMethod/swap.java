package GenericMethod;
class Test1<T,U>{
    //An object of tyoe T is declared
    T obj1;
    U obj2;
    Test1(T obj1,U obj2){ this.obj1=obj1; this.obj2=obj2; }
    public T getObjecct(){

        return this.obj1; }
}

public class swap {
    public static <T>void swap(T x, T y){
        T temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("X = "+x+" "+"Y = "+y);
    }

    public static void main(String[] args) {
//        System.out.println("X = "+x+" "+"Y = "+y);
//        swap(x,y);
//        System.out.println("X = "+x+" "+"Y = "+y);
    }
}
