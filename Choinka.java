package bb.bbjava.poczatek.javaTrening;

public class Choinka {
    public static void main(String[] args) {

        int size = 1;
        int maxHigh = 1;

        for (int seg = 1; seg <= size; seg++) {
            for (int row = 0; row < seg - Math.max(seg - maxHigh, 0); row ++) {
                for (int i = 0; i <= size - Math.max(seg - maxHigh, 0) - row; i++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * (row + 1 + Math.max(seg - maxHigh, 0)) ; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        for (int k = 0; k <= size; k++) {
            System.out.print(" ");
        }
        System.out.print("##");
    }
}
