public class RimNum {
    public static int a;
    public static String rimString;

    public static int rimToInt (String list0, String list2){

        if (IntNumbers.isInt(list0, list2) == false){
            switch (list0){
                case "I":  a = 1;
                    break;
                case "II": a = 2;
                    break;
                case "III": a = 3;
                    break;
                case "IV": a = 4;
                    break;
                case "V": a = 5;
                    break;
                case "VI": a = 6;
                    break;
                case "VII": a = 7;
                    break;
                case "VIII": a = 8;
                    break;
                case "IX": a = 9;
                    break;
                case "X": a = 10;
                    break;
            }
        }else {
            System.out.println("error");
        }
        return a;
    }
    public static String rimNumbers(int a){
        switch (a){
            case 1:  rimString = "I";
                break;
            case 2:  rimString = "II";
                break;
            case 3:  rimString = "III";
                break;
            case 4:  rimString = "IV";
                break;
            case 5:  rimString = "V";
                break;
            case 6:  rimString = "VI";
                break;
            case 7:  rimString = "VII";
                break;
            case 8:  rimString = "VIII";
                break;
            case 9:  rimString = "IX";
                break;
            case 10:  rimString = "X";
                break;
        }return rimString;
    }
}
