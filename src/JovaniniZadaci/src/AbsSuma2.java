import java.util.Scanner;
public class AbsSuma2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 1. Unos duzine niza
        System.out.print("Unesite duzinu niza: ");
        int duzina = sc.nextInt();

        int niz[] = new int[duzina];

        
        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesite element " + (i + 1) + ": ");
            niz[i] = sc.nextInt();
        }

       
        int suma = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < 0 && niz[i] % 2 == 0) {
                suma += Math.abs(niz[i]);
            }
        }

       
        System.out.println("Apsolutna suma negativnih parnih brojeva je: " + suma);

        sc.close();
	}

}
