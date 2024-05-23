package day1com.blit;

import java.util.Optional;

public class OptionalClassIntro {
    public static void main(String[] args) {
        String [ ] strAry = new String[7];
//        String s6 = strAry[6].toLowerCase();
//        System.out.println(s6);

        Optional <String> optionalS6 = Optional.ofNullable(strAry[6]);
        if (optionalS6.isPresent()){
            System.out.println(strAry[6].toLowerCase());
        }else {
            System.out.println("element is not present");
        }
        Optional<String> optionalS5 = Optional.ofNullable(strAry[6]);
    }
}
