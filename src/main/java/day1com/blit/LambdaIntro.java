package day1com.blit;

public class LambdaIntro {
    public static void main(String[] args) {
        SaySomething s = () -> {
            return "HELLO";
        };

        SaySomething ss = ()-> {
            return "HI";
        };

        System.out.println(ss.say());
    }
}
