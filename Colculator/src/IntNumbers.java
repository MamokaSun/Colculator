public class IntNumbers {
    public static int a;

    public static boolean isNum (String s0) {//Проверка на соответствие
        try {
            int x = Integer.parseInt(s0);
        } catch (NumberFormatException e) {
            return false;
        }return true;
    }

    public static int itNum (String list0, String list2) {

        if (isNum(list0) == true && isNum(list2) == true) {//Преобразование строки в число
            try {
                a = Integer.parseInt(list0);
                if (a < 0 || a > 10){
                    throw new Exception("Число не находится в диапазоне от 1 до 10");
                }
            }
            catch (Exception e) {
                System.out.println("Число не находится в диапазоне от 1 до 10");
                System.exit(0);
            }

        } else if(isNum(list0) == true && isNum(list2) == false){
            System.out.println("Калькулятор умеет работать только с арабскими или римскими цифрами");
            System.exit(0);
        }else if(isNum(list0) == false && isNum(list2) == true){
            System.out.println("Калькулятор умеет работать только с арабскими или римскими цифрами");
            System.exit(0);
        }
        return a;
    }
}
