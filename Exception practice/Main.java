//import javax.swing.*;
//
////public class Main {
//
//    int age;
//    String ageString;
//
//    public Main(){
//        ageString = JOptionPane.showInputDialog("what is your age");
//        try {
//            age = Integer.parseInt(ageString);
//            if (age<=18){
//                System.out.println("Cannot drive cars.");
//            }else {
//                System.out.println("You can drive!");
//            }
//        } catch (NumberFormatException e){
//            e.printStackTrace();
//        }
//    }
//
//    public static  void  main(String[] args) {
//        new Main();
//    }
//}
import javax.swing.*;
//public class Main {
//    public static void main(String[] args){
//        Circle c1 =new Circle(10);
//        try {
//            c1.setRadius(-5);
//        } catch (IllegalArgumentException e){
//            System.out.println("Cannot set radius");
//        }
//    }
//}

// scanner練習
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        File f = new File("sleep.txt");
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(f+"not fond");
        }
    }
}