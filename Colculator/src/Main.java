import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static int a;
    public static int b;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mathExpression = reader.readLine();


        String[] list;
        String delimeter = " ";
        list = mathExpression.split(delimeter);//Разделяем на массив строк

        boolean aNumB = IntNumbers.isNum(list[0]);
        boolean bNumB = IntNumbers.isNum(list[2]);

        if (aNumB == true && bNumB == true) { //Присваиваем значение переменным a и b
            a = IntNumbers.itNum(list[0], list[2]);
            b = IntNumbers.itNum(list[2], list[0]);
        } else if (aNumB == false && bNumB == false) {
            a = RimNum.rimToInt(list[0], list[2]);
            b = RimNum.rimToInt(list[2], list[0]);
        } else {
            System.out.println("Кальулятор умеет работать только с римскими или арабскими цифрами");
            System.exit(0);
        }

        int result = Operations.count(list[1], a, b);

        if (aNumB == false && bNumB == false) {//Выводим значение в зависимоти от изначальных данных
            int[] arrForCount = RimNum.listForRim(result);
            if (arrForCount.length == 1) {
                System.out.println(RimNum.rimNumLittle(RimNum.listForRim(result), 0));
            } else if (arrForCount.length == 2) {
                if (result < 0) {
                    System.out.println(RimNum.rimWithMinus(RimNum.listForRim(result), 1));
                } else if (result > 0) {
                    String first = RimNum.rimNumBig(RimNum.listForRim(result), 0);
                    String second = RimNum.rimNumLittle(RimNum.listForRim(result), 1);
                    System.out.println(first + second);
                }
            }
        } else {
                System.out.println(Operations.count(list[1], a, b));
        }

    }
}


