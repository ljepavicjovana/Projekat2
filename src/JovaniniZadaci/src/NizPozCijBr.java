/*Napisati program koji provjerava koliko niz ima pozitivnih cijelih brojeva.*/



public class NizPozCijBr {

	public static void main(String[] args) {
		
		int[] brojevi = {1,4,7,8,1};
		int pozitivniBrojevi=0;
		
		
		
		for(int broj: brojevi) {
			if(broj>0) {
				System.out.println(+broj);
				pozitivniBrojevi++;
				System.out.println("U nizu ima " + pozitivniBrojevi + " pozitivnih brojeva.");
			}else continue;
			
		}
		
			
		}
	
}
