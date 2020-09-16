public class Operations {

    public static int sum;
    public static char minusChar;
    public static int count(String s, int a, int b){
        if (s.equals("+")){
            sum =(a + b);
        }else if (s.equals("-")){
            sum = (a - b);
        }else if (s.equals("*")){
            sum = (a * b);
        }else if (s.equals("/")){
            sum = (a / b);
        }else {System.out.println("Такой знак " + s + " не используется");
        }return sum;
    }
}
