package exemple;

public class Outer {
    private int i = 0;
    private void printHello(){
        System.out.println("Hello");
    }
    class Inner{
        void print(){
            System.out.println(i);
            printHello();
       }
    }
}