/*Napisati program koji:

Od korisnika traži dužinu niza.

Zatim da korisnik unese sve elemente niza.

Program treba da:

izračuna sumu svih parnih brojeva,

izračuna proizvod svih neparnih brojeva.

Na kraju ispiši obje vrijednosti
*/
import java.util.Scanner;
public class SumaParnih {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//unos zeljene duzine
		System.out.println("Unesite zeljenu duzinu niza: ");
		int duzina=sc.nextInt();
		
		int niz[] = new int[duzina];
		
		//unos svih elemenata niza
		for(int i=0;i<niz.length;i++) {
			System.out.println("Unos niza pocinje od elementa " + (i+1)+ ":");
			niz[i]=sc.nextInt();
		}
		//suma svih parnih brojeva u nizu
		double sumaParnih=0;
		for(int s=0;s<niz.length;s++) {
			if(niz[s]%2==0) {
				sumaParnih+=niz[s];
				sumaParnih++;
				
				
			}else continue;
		}
		double proizvodNeparnih=1;
		for(int j=0;j<niz.length;j++) {
			if(niz[j] % 2 !=0) {
				proizvodNeparnih*=niz[j];
				proizvodNeparnih++;
			}
		}
		System.out.println("Suma svih parnih brojeva u nizu je: " +sumaParnih);
		System.out.println("Proizvod neparnih brojeva u nizu je: " +proizvodNeparnih);
		sc.close();
		//moze da se doda i provjera :
		/*if (brojParnih == 0)
            System.out.println("U nizu nema parnih brojeva.");
        else
            System.out.println("Suma svih parnih brojeva u nizu je: " + sumaParnih);

        if (brojNeparnih == 0)
            System.out.println("U nizu nema neparnih brojeva.");
        else
            System.out.println("Proizvod svih neparnih brojeva u nizu je: " + proizvodNeparnih);
		 */
	}

}
