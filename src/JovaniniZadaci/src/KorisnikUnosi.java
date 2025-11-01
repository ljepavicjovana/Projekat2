/*Napisati program koji:

od korisnika traži da unese dužinu niza,

zatim da unese sve elemente niza,

i na kraju ispisuje najveći broj koji se nalazi u tom nizu.
*/
import java.util.Scanner;
public class KorisnikUnosi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi duzinu niza: ");
		int duzina=sc.nextInt();
		
		//sada cemo da napravimo niz te duzine tj mjesto u memoriji da zauzmemo za duzinu
		int niz[] = new int[duzina];
		
		//sada popunjavam niz te duzine sa elementima
		for(int i=0; i<niz.length;i++) {
			//i+1 znaci da korisniku pise prvi element
			System.out.println("Unesite broj za poziciju " +(i+1) + ":");
			niz[i]=sc.nextInt();
		}
		int maxElement=niz[0];
		for(int i=0;i<niz.length;i++) {
			if(niz[i] > maxElement) {
				maxElement = niz[i];
			}
		}
		System.out.println("Maksimalni element niza je: " +maxElement);
		sc.close();
	}

}

