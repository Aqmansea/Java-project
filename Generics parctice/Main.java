//class Info<T>{
//    private  T value;
//    public  T getValue(){
//        return this.value;
//    }
//
//    public void setValue(T value) {
//        this.value = value;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Info<String> myInfo = new Info<>();
//        myInfo.setValue("Hello World");
//        System.out.println(myInfo.getValue());
//    }
//}

//class Info<T,K>{
//    private  T key;
//    private K value;
//    public  T getValue(){
//        return key;
//    }
//    public void setKey( {
//        this.key = key;
//    }
//    public K setValue( {
//      return  value;
//    }
//
//    public void setValue(K value) {
//        this.value = value;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Info<String,Integer> myInfo = new Info<>();
//        myInfo.setKey("Peter");
//        myInfo.setValue(3000);
//        System.out.println(myInfo.getkey()+" "+myInfo.getValue());
//    }
//}


//interface Content<T>{
//    T text();
//}
//
//class  GenericsContent<T>implements Content<T>{
//    private T text;
//    public GenericsContent(T text){
//        this.text = text;
//    }
//
//    @Override
//    public T text() {
//        return text;
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
//        GenericsContent<String> gt = new GenericsContent<>("G=Hello world");
//        System.out.println(gt.text());
//    }
//}

//public class Main {
//    public static <T> T printHello(T obj){
//        return(T) (obj+",hello");
//    }
//
//    public static <T> void printClass(T obj){
//        System.out.println(obj.getClass().getName());
//    }
//
//    public static void main(String[] args) {
//        printClass(55);
//        System.out.println(printHello("Pe"));
//    }
//}

