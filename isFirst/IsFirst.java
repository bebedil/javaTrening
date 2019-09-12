package bb.bbjava.poczatek.javaTrening.isFirst;

//stworzyć metodę sprawdzającą, czy liczba jest pierwsza

public class IsFirst {
    public static void main(String[] args) {

        isFirst(2383);
    }

    private static void isFirst(int n) {
        for (int i = 2; i < n ; i++) {
            if ( n%i == 0){
            System.out.println(n + " nie jest pierwsza");
            return;
            }
        }
        System.out.println(n + " jest pierwsza");
        }
    }

