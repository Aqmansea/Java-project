import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
//    public static void main(String[] args) {
//        String[] names = {"Ron","Wison","Hattu"};
////        Stream.of("Ron","Wison","Hattu")
//        Arrays.stream(names)
//                .sorted()
////               .forEach(System.out::println);
//                .forEach(name->System.out.println(name));


//        Arrays.stream(new int[]{2,4,6,8,10})
//                .map( n -> n * n)
//                .average()
//                .ifPresent(System.out::println);
//        ArrayList<String> people = new ArrayList<>();
//        people.add("Ron");
//        people.add("Rrat");
//        people.add("Hell");
//        people.add("Wislon");
//        people.add("Race");
//        people.add("Peter");
//        people.add("HBD");
//        people.stream()
//                .map(name -> name.toLowerCase())
//                .filter(name->name.startsWtih("r"))
//                .forEach(System.out::println);
//
//        Stream<String> bands = Files.lines(Path.get("band.txt"),StandardCharsets.UTF_8);
//        bands
//                .sorted()
//                .filter(x->x.length()>13)
//                .forEach(System.out::println);
//        bands.close();

//        Stream<String> rows = Files.lines(Path.get("data.txt"),StandardCharsets.UTF_8);
//        Map<String,Integer> map = rows.map(x->x.split(","))
//                .filter(x->x.length == 3)
//                .filter(x->Integer.parseInt(x[1]>15))
//                .collect(Collectors.toMap(
//                        x->x[0]
//                        x->Integer.parseInt(x[1])
//                ));
//        map.forEach((key,value))->{
//            System.out.println(key + "," + value);
//        }

        public static void main(String[] args) throws IOException{
        Random random = new Random();
        int[] list  = random.ints(50000000).toArray();

        System.out.println("Number of processors:" + Runtime.getRuntime().availableProcessors());

        long startTime = System.currentTimeMillis();
        int [] list1 = IntStream.of(list)
                .filter(e->e>0)
                .sorted()
                .limit(5)
                .toArray()
        System.out.println(Arrays.toString(lsit1));
        long endTime = System.currentTimeMillis();
            System.out.println("Sequential execution time is" + (endTime-startTime)+"millseconds");
            System.out.println("======================================================");

        startTime = System.currentTimeMillis();
        int [] list2 = IntStream.of(list)
                .parallel()
                .filter(e->e>0)
                .sorted()
                .limit(5)
                .toArray()
        System.out.println(Arrays.toString(lsit2));
        endTime = System.currentTimeMillis();
        System.out.println("Parallel execution time is" + (endTime-startTime)+"millseconds");


    }
}
