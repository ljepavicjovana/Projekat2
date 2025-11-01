/*Napisati program koji pronalazi najveći i najmanji broj u nizu cijelih brojeva.*/
public class NajmNajvElNiza {

	public static void main(String[] args) {
		int niz[] = {1,15,6,8,19,45,48};
		
		int najmanjiElement=niz[0];
		int najveciElemen=niz[0];
		
		for(int broj: niz) {
			if(broj<najmanjiElement) {
				najmanjiElement=broj;
			}else {
				if(broj>najveciElemen) {
					najveciElemen=broj;
				}
			}
		}
		System.out.println("Najveci element u nizu je: " +najveciElemen + "\nNajmanji element u nizu je: " +najmanjiElement);

}
	
}
