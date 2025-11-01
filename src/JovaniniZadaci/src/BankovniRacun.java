/* Napisati klasu BankovniRacun sa atributima: imeVlasnika, stanje (double).
a. Kreirati konstruktor, getere i setere.
b. Dodati metod uplati(double iznos) koji povećava stanje.
c. Dodati metod isplati(double iznos) koji smanjuje stanje samo ako ima
dovoljno sredstava.
d. Dodati metod ispisi() koji prikazuje trenutno stanje računa.
*/
public class BankovniRacun {
	private String imeVlasnika;
	private double stanje;
	
	public BankovniRacun(String imeVlasnika, double stanje) {
		this.imeVlasnika=imeVlasnika;
		this.stanje=stanje;
	}

	public String getImeVlasnika() {
		return imeVlasnika;
	}

	public double getStanje() {
		return stanje;
	}

	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika = imeVlasnika;
	}

	public void setStanje(double stanje) {
		this.stanje = stanje;
	}
	public void Uplati(double iznos) {
		stanje +=iznos;
		System.out.println("Stanje na racunu se povecava");
	}
	public void Isplati(double iznos) {
		if(stanje>=iznos) {
			stanje-=iznos;
			System.out.println("Nemate dovoljno sredstava.");
			
		}
	}
	
	public void Ispisi() {
		System.out.println("Vlasnik pod imenom: " +imeVlasnika+ ",ima stanje na racunu u iznosu od: " +stanje);
	}
}
