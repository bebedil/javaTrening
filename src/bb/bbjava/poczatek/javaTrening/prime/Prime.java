package bb.bbjava.poczatek.javaTrening.prime;

public class Prime {
    public static void main(String[] args) {

        int size = 19;
        for (int row = 0; row < ((size + 1) / 2); row++) {

            for (int i = (size + 1) / 2; i > row; i--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * row) + 1; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}