/*Napisati program koji od korisnika traži:

dužinu niza,

sve elemente niza,

i zatim ispisuje koliko u tom nizu ima pozitivnih, a koliko negativnih brojeva
*/
import java.util.Scanner;
public class NizPozNeg {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite zeljenu duzinu niza: ");
	int duzina=sc.nextInt();
	
	//sada unosim taj niz tj memoriju za duzinu u nizu
	int niz[] = new int[duzina];
	
	for(int i=0;i<niz.length;i++) {
		System.out.println("Element koji se unosi na poziciji: " + (i+1) + ":");
		niz[i]=sc.nextInt();
		
	}
	int imaPozitivnih=0;
	int imaNegativnih=0;
	for(int s=0;s<niz.length;s++) {
		if(niz[s]>0) {
			imaPozitivnih++;
		}else if(niz[s]<0) {
			imaNegativnih++;
			
			sc.close();
		}
		
	}
	System.out.println("Pozitivnih brojeva ima: " +imaPozitivnih+ ",negativnih brojeva ima" +imaNegativnih);
	
	
	

}
	
}
