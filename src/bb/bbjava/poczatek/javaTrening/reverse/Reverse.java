package bb.bbjava.poczatek.javaTrening.reverse;

public class Reverse {
    static String reverse(String input1) {
        StringBuilder builder = new StringBuilder();
        for (int i = input1.length() - 1; i >= 0; i--) {
            builder.append(input1.charAt(i));
        }
        return builder.toString();
    }

    private static String cut(String input) {
        return input.replace(" ", "");
    }

    static boolean isPalindrome(String toCheck) {
        String cut = cut(toCheck);
        return cut.equals(reverse(cut));
    }
}

