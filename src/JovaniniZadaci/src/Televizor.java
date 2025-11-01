/*Napisati klasu Televizor sa atributima: brojKanala (int, mora biti ≥ 1), nazivKanala
(String), jacinaTona (int, između 0 i 10). Potrebno je odraditi:
a. Konstruktor koji postavlja početne vrijednosti atributa.
b. Getere i setere za sve atribute (sa provjerama da broj kanala ≥ 1 i da je jačina
tona u opsegu 0–10).
c. Metod pojacajTon() koji uvećava jačinu tona za 1, ali ne može preći 10.
d. Metod ispisi() koji ispisuje broj kanala, naziv kanala i trenutnu jačinu tona.
*/
public class Televizor {
	//Atributi
	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;
	
	//Konstruktori
	
	public Televizor(int brojKanala, String nazivKanala, int jacinaTona) {
		this.brojKanala=brojKanala;
		this.nazivKanala=nazivKanala;
		this.jacinaTona=jacinaTona;
		
	}

	public int getBrojKanala() {
		return brojKanala;
	}

	public String getNazivKanala() {
		return nazivKanala;
	}

	public int getJacinaTona() {
		return jacinaTona;
	}

	public void setBrojKanala(int brojKanala) {
		if (brojKanala >=1 ) {
			this.brojKanala = brojKanala;
		}
			
		
		
	}

	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}

	public void setJacinaTona(int jacinaTona) {
		if(jacinaTona >=0 && jacinaTona<=10)
		this.jacinaTona = jacinaTona;
	}
	public void pojacajTon() {
		if(jacinaTona < 10) {
			jacinaTona++;
		}
	}
	public void Ispisi() {
		System.out.println("Broj kanala: " +brojKanala);
		System.out.println("Naziv kanala : " +nazivKanala);
		System.out.println("Jacina tona : " +jacinaTona);
	}

}
