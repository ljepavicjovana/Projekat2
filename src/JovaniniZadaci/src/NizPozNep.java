/*Napisati program koji broji koliko niz ima parnih brojeva
i koliko neparnih brojeva.
Na kraju ispisati oba rezultata.
*/
public class NizPozNep {

	public static void main(String[] args) {
		int niz[] = {1, 4, 80, 90, 120, 340};
		int parniBrojevi=0;
		int neparniBrojevi=0;
		
		for(int broj:niz) {
			if(broj%2==0) {
				parniBrojevi++;
				
			}else if(broj%2!=0) {
				//ili samo else{ neparniBrojevi++ da se skrati...
				neparniBrojevi++;
				
			}
			System.out.println("Parnih brojeva u nizu ima" +parniBrojevi+ ",Neparnih brojeva u nizu ima: " +neparniBrojevi);
		}
		

}
	
}
