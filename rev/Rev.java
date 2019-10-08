package bb.bbjava.poczatek.javaTrening.rev;

// nie wiem dlaczego nie działa u mnie charAt
// zaminiłem to na tablicę i użyłem pomocniczo zmiennych temp i revtemp
// jeszcze sprobuje z charAt...

public class Rev {
    public static void main(String[] args) {
        String output = reverse("palindrom");
        System.out.println(output);
    }
    private static String reverse(String input) {
        char[] temp = input.toCharArray();
        String revtemp = "";
        for (int i = (temp.length - 1); i >= 0; i--) {
            revtemp = revtemp + temp[i];
        }
        return revtemp;
    }
}