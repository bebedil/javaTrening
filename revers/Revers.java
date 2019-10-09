package bb.bbjava.poczatek.javaTrening.revers;

public class Revers {
    public static void main(String[] args) {

        String toCheck = "kobyla ma maly bok";
        System.out.println(isPalindrome(toCheck));
    }

    static boolean isPalindrome(String toCheck) {
        String cut = cut(toCheck);
        return cut.equals(reverse(cut));
    }

    static String reverse(String input1) {
        String revtemp = "";
        for (int i = (input1.length() - 1); i >= 0; i--) {
            revtemp = revtemp + input1.charAt(i);
        }
        return revtemp;
    }

    //static String cut(String input) {
    //String input1 = "";
    //for (int j = 0; j < input.length(); j++) {
    //    if (input.charAt(j) != ' ')
    //        input1 = input1 + input.charAt(j);
    static String cut(String toCheck) {
        String input1 = "";
        for (int j = 0; j < toCheck.length(); j++) {
            if (toCheck.charAt(j) != ' ')
                input1 = input1 + toCheck.charAt(j);

        }
        return input1;
    }

}

