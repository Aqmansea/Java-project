import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


//class MyRunnable implements Runnable{
//
//    @Override
//    public void run(){
//        for (int i=0;i<5;i++) {
//            System.out.println(i);
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer>arr = new  ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//
//        arr.forEach(element ->{
//            System.out.println(element);
//        });

//        Map<String,Integer> solorMap = new  HashMap<>();
//        solorMap.put("Wislon",3000);
//        solorMap.put("Alex",5000);
//        solorMap.put("Grace",7000);
//
//        solorMap.forEach((k,v)->{
//            System.out.println("key is" + k + ", and value is" + v);
//        });
//        MyRunnable r1 = new MyRunnable();
//        MyRunnable r2 = new MyRunnable();
        Thread t1 = new Thread(()->{
            for (int i=0;i<5;i++) {
                System.out.println(i);
            }
        });
        Thread t2 = new Thread(()->{
            for (int i=0;i<5;i++) {
                System.out.println(i);
            }
        });
        t1.start();
        t2.start();
    }
}