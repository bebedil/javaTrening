package bb.bbjava.poczatek.javaTrening.revers;

// wersja z charAt

public class Revers {
    public static void main(String[] args) {
        String revtemp = "ogórek";
        String input1 = "pomidor";
        boolean output = false;
        reverse(cut("kobyla ma maly bok"));
        //isPalindrome(reverse(cut("kobyla ma maly bok")));
        System.out.println(revtemp);
        System.out.println(input1);
        System.out.println(output);
    }
    private static String reverse(String input1) {
        String revtemp = "";
        for (int i = (input1.length() - 1); i >= 0; i--) {
            revtemp = revtemp + input1.charAt(i);
        }
        System.out.println(revtemp);
        return revtemp;
    }

    private static String cut(String input) {
        String input1 = "";
        for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) != ' ')
                input1 = input1 + input.charAt(j);
        }
        System.out.println(input1);
        return input1;
    }

    private static boolean isPalindrome(String revtemp, String input1) {
        boolean result = false;
        if (input1 == revtemp) {
            return result = true;
        } else {
            return result = false;
        }
    }
}

