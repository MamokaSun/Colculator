public class IntNumbers {
    public static int a;

    public static boolean isNum (String s0, String s2) {//Проверка на соответствие
        try {
            int x = Integer.parseInt(s0);
            int i = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static int itNum (String list0, String list2) {
        if (isNum(list0, list2) == true) {//Преобразование строки в число
            a = Integer.parseInt(list0);
        } else {
            System.out.println("Что-то пошло не так.");
        }
        return a;
    }
}
