import java.util.Scanner;

public class UvecavaZaX {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Unesi duzinu zeljenog niza");
		int duzina=sc.nextInt();
		
		int niz[] = new int[duzina];
		
		for(int i=0;i<niz.length;i++) {
			System.out.println("Element unijetog niza " + (i+1) + ":");
				niz[i] =sc.nextInt();
		}
		System.out.println("Unesite zeljenu vrijednost x: ");
		int x = sc.nextInt();
		
		
		for(int s=0;s<niz.length;s++) {
			if(niz[s]%2==0) {
				niz[s]+=x;
				
				System.out.println(niz[s]);
				sc.close();
				
			}
		}
		
	}

}
