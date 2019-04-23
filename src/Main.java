public class Main {

    public static void main(String[] args) {
        // write your code here

        //zad.1
        DzienTygodnia dzien = new DzienTygodnia(7);
        System.out.println(dzien.zwroc());
        //zad.2
        Miesiac miesiac = new Miesiac("luty");
        System.out.println(miesiac.zwrocPoreRoku());
        //zad.3
        Kalkulator kalk = new Kalkulator(2, 4, '+');
        System.out.println("Wynik działania: " + kalk.policz());

        //czesc II
        //zad.1
        int[] tab = {1, 2, 3};
        System.out.println(tab[0] + " " + tab[1] + " " + tab[2]);
        //zad.2
        int[] tab2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tab3 = new int[10];
        for (int i = 0; i <= 9; i++) {
            tab3[i] = tab2[9 - i];
            System.out.print(tab3[i] + " ");
        }
        System.out.println();
        //zad.4
        //int n=123;
        LiczbaPierwsza lp = new LiczbaPierwsza(17);
        boolean wynik = lp.sprawdz();
        if (wynik ) {
            System.out.println("Liczba pierwsza");
        }
        else {
            System.out.println("To nie jest liczba pierwsza");
        }



    }
}
