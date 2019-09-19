package bb.bbjava.poczatek.javaTrening.revers;

// wersja z charAt

public class Revers {
    public static void main(String[] args) {
        String output = reverse("Testowanie");
        System.out.println(output);
    }
    private static String reverse(String input) {
        String revtemp = "";
        for (int i = (input.length() - 1); i >= 0; i--) {
            revtemp = revtemp + input.charAt(i);
        }
        return revtemp;
    }
}

