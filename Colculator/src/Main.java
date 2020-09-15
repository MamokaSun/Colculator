import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;


public class Main {
    public static int a;
    public static int b;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mathExpression = reader.readLine();

        String[] list;
        String delimeter = " ";
        list = mathExpression.split(delimeter);//Разделяем на массив строк


        System.out.println(IntNumbers.isInt(list[0], list[2]));//Проверка ответа булевого значения
        if (IntNumbers.isInt(list[0], list[2]) == true) {
            a = IntNumbers.intNum(list[0], list[2]);
            b = IntNumbers.intNum(list[2], list[0]);
        }else if(IntNumbers.isInt(list[0], list[2]) == false){
            a = RimNum.rimToInt(list[0], list[2]);
            b = RimNum.rimToInt(list[2], list[0]);
            }
        else {
            System.out.println("error");}

        Operations.count(list[1], a, b);
        if (IntNumbers.isInt(list[0], list[2]) == false){
            RimNum.rimNumbers(Operations.count(list[1], a, b));
            System.out.println(RimNum.rimNumbers(Operations.count(list[1], a, b)));
        }else if (IntNumbers.isInt(list[0], list[2]) == true){
            System.out.println(Operations.count(list[1], a, b));
        }else {
            System.out.println("error");
        }
    }
}
