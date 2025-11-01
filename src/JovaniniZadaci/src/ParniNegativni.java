/*Napisati program koji prikazuje samo parne negativne elemente unijetog niza.
*/

import java.util.Scanner;

public class ParniNegativni {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite zeljenu duzinu niza: ");
		int duzina=sc.nextInt();
		
		int niz[] = new int[duzina];
		
		for(int i=0;i<niz.length;i++) {
			System.out.println("Element unijetog niza " + (i+1)+":");
			niz[i]=sc.nextInt();
			
		}
		int parniNegativni=0;
		for(int s=0;s<niz.length;s++) {
			if(niz[s] %2 ==0 && niz[s] < 0) {
				 System.out.println(niz[s]);
				 parniNegativni++;
			}
			
		}
		System.out.println("Parni negativni unijeti elementi ovog niza su: " +parniNegativni);
		sc.close();
	}

}
