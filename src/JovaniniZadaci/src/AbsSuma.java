/*Napisati program koji na osnovu niza cijelih brojeva računa apsolutnu sumu
svih negativnih parnih elemenata za unijeti niz. Štampati sumu.
Primjer:
Input: {-2, 7, -5, 3, 1, -4}
Output: 6 (|-2| + |-4|)*/

public class AbsSuma {

	public static void main(String[] args) {
		int niz[] = {-2, 7, -5, 3, 1, -4};
		
		int suma=0;
		
		for(int broj: niz) {
			if(broj % 2 ==0 && broj < 0) {
				suma+=Math.abs(broj);
				System.out.println("Suma unijetog niza je: " +suma);
				
			}
		}

}
	
}
