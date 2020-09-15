public class Operations {
    public static void count(String s, int a, int b){

        if (s.equals("+")){
            System.out.println(a + b);
        }else if (s.equals("-")){
            System.out.println(a - b);
        }else if (s.equals("*")){
            System.out.println(a * b);
        }else if (s.equals("/")){
            System.out.println(a / b);
        }else {System.out.println("Такой знак " + s + " не используется");}
    }
}
