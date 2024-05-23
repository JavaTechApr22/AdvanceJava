package day1com.blit;

public class MethodR {

    public static String staticMethodRef (){
        return "hey, this is a static method";
    }

    public String instanceMethodRef (){
        return "Hey, this is a instance method";
    }

    static class Message {

        public  Message (String message ){
            System.out.println(message);
        }

    }

    interface Text {
        Message getMessage (String msg);
    }

    public static void main(String[] args) {
//        1- reference to static method
        SaySomething obj = MethodR :: staticMethodRef;
        System.out.println(obj.say());

//        2- reference to a instance
        MethodR xyz = new MethodR();
        SaySomething obj1 = xyz :: instanceMethodRef;
        System.out.println(obj1.say());

//        3- reference to a constructor
        Text hello = Message :: new;
        Message  m1 = hello.getMessage("this is my message");
    }
}
