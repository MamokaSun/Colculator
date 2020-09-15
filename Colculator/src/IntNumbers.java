public class IntNumbers {
    public static int a;
    public static boolean isInt (String s0, String s2) {//Проверка на соответствие типу int
        try {
            int x = Integer.parseInt(s0);
            int i = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    public static int intNum (String list0, String list2) {
        if (isInt(list0, list2) == true) {//Преобразование строки в число типа int
            a = Integer.parseInt(list0);
        } else {
            System.out.println("Что-то пошло не так");
        }
        return a;
    }
}
