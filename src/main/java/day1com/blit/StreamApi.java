package day1com.blit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(5, 10, 15, 20 , 25, 30);
//                                                1 2    3     4    5   6
        List <Integer> filteredlist = mylist.stream().filter(i -> i%2 == 0) .toList();
        System.out.println(filteredlist);

//        Filter: it filtered the data
//        Collect : perform operations like grouping elements
//        Map: it will transform my data according my condition

            List <Integer> transfromedlist = mylist.stream().map(i -> i*2).toList();
        System.out.println(transfromedlist);

//        multiple by 3 ..

//        3- Count:
        long failedStudents = mylist.stream().filter(i -> i<=15).count();
        System.out.println(failedStudents);

//       4 - Sorted
        List <Integer> mylist2 = Arrays.asList(20,5,25,10,15,30);
        List <Integer> sortedlist = mylist2.stream().sorted((a,b) -> -a.compareTo(b)).toList();
        System.out.println(sortedlist);


//        5 - ForEach :
        mylist2.stream().forEach(i -> System.out.println(i));

//        6 - StreamOf:
        Stream <?> item = Stream.of(9 , 10, 18 , "HEY", "HI", "BYE");
        item.map(i -> i+ "lol").forEach(System.out::println);
    }
}
