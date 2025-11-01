/* Napisati klasu Automobil sa atributima: marka, model, godiste i brzina (int).
a. Kreirati konstruktor, getere i setere.
b. Dodati metod ubrzaj(int vrijednost) koji povećava brzinu, ali ne smije preći
200.
c. Dodati metod uspori(int vrijednost) koji smanjuje brzinu, ali ne smije pasti
ispod 0.
d. Dodati metod ispisi() koji prikazuje podatke o automobilu.
*/
public class Automobil {
	private String marka;
	private String model;
	private int godiste;
	private int brzina;
	
	public Automobil (String marka, String model, int godiste, int brzina){
		this.marka=marka;
		this.model=model;
		this.godiste=godiste;
		this.brzina=brzina;
	}
	
	public void Ubrzaj(int vrijednost) {
		brzina+=vrijednost;
		if(brzina>200) {
			brzina=200;
			System.out.println("Brzina ne smije preci 200. ");
		}
		
	}
	public void Uspori(int vrijednost) {
		brzina += vrijednost;
		if(brzina<0) {
			brzina=0;
			System.out.println("Brzina ne smije biti ispod nule.");
		}
	}
	public void Ispisi() {
		System.out.println("Marka: " +marka+ ",model " +model +", godiste " + godiste+ " , brzina " +brzina);
	}
}
