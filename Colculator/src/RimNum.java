public class RimNum {
    public static int a;
    public static int b;
    public static String rimString;
    public static int[] arr;

    public static int[] listForRim(int sum){

        String s = Integer.toString(sum);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--){
            arr[i] = sum % 10;
            sum/= 10;
        }return  arr;
    }

    public static int rimToInt (String list0, String list2){

        if (IntNumbers.isNum(list0) == false && IntNumbers.isNum(list2) == false){
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

    public static String rimNumLittle(int[] list, int n){
        int q = list[n];
        switch (q){
            case 0:  rimString = " ";
                break;
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
    public static String rimNumBig(int[] list, int n){
        int q = list[n];
        switch (q){
            case 1:  rimString = "X";
                break;
            case 2:  rimString = "XX";
                break;
            case 3:  rimString = "XXX";
                break;
            case 4:  rimString = "XL";
                break;
            case 5:  rimString = "L";
                break;
            case 6:  rimString = "LX";
                break;
            case 7:  rimString = "LXX";
                break;
            case 8:  rimString = "LXXX";
                break;
            case 9:  rimString = "XC";
                break;
            case 10:  rimString = "C";
                break;
        }return rimString;
    }
    public static String rimWithMinus(int[] list, int n){
        int q = list[n];
        switch (q){
            case -1:  rimString = "-I";
                break;
            case -2:  rimString = "-II";
                break;
            case -3:  rimString = "-III";
                break;
            case -4:  rimString = "-IV";
                break;
            case -5:  rimString = "-V";
                break;
            case -6:  rimString = "-VI";
                break;
            case -7:  rimString = "-VII";
                break;
            case -8:  rimString = "-VIII";
                break;
            case -9:  rimString = "-IX";
                break;
            case -10:  rimString = "-X";
                break;
        }return rimString;
    }
}
