import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mathExpression = reader.readLine();

        String[] list;
        String delimeter = " ";
        list = mathExpression.split(delimeter);//Разделяем на массив строк


        System.out.println(IntNumbers.isInt(list[0], list[2]));//Проверка ответа булевого значения

        int a = IntNumbers.intNum(list[0], list[2]);
        int b = IntNumbers.intNum(list[2], list[0]);


        System.out.println(a + " " +b);
        Operations.count(list[1], a, b);
    }
}
