/*Kreirati klasu Zaposleni koja ima sledeće atribute: ime, prezime, godine_staza,
plata. Voditi računa koji tipovi podataka se vezuju za navedene atribute. Obavezno
je kreirati konstruktor kojim se objekat klase može kreirati.
a. Kreirati getter i setter metode kojima se može pristupiti određenom
atributu objekta, kao i eventualno taj atribut izmijeniti (pomoću seter
metode).
b. Klasa Zaposleni mora da sadrži metodu koja vrši ispisivanje zaposlenih (Ime
i prezime, godine staza).
c. Kreirati makar 5 objekata klase Zaposleni i testirati getter i setter metode,
kao i ispis Zaposlenih (ispis objekta klase).
d. U klasi Zaposleni potrebno je napraviti metodu koja će ispisati ime
zaposlenog koji ima najveću platu.
e. Potrebno je dodati i metodu koja će provjeriti iznos plate i ako je manja od
800 uvećaće je 6 posto u slučaju da zaposleni ima preko 10 godina staža.
*/
public class Zaposleni {
	private String ime;
	private String prezime;
	private int godine_staza;
	private float plata;
	
	public Zaposleni(String ime, String prezime, int godine_staza, float plata) {

		this.ime=ime;
		this.prezime=prezime;
		this.godine_staza=godine_staza;
		this.plata=plata;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getGodine_staza() {
		return godine_staza;
	}

	public float getPlata() {
		return plata;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public void setGodine_staza(int godine_staza) {
		if(godine_staza >= 0) 
			this.godine_staza=godine_staza;
		else{
			System.out.println("Godine radnog staza ne mogu biti u minusu.");
			
		}
		
	}

	public void setPlata(float plata) {
		if(plata > 0) this.plata = plata;
		else{
			System.out.println("Plata ne moze biti nula. ");
		}
	}
	public void Ispisivanje() {
		//println je za primanje jednog argumenta, a ja imam 3 zbog toga nece da mi prihvati sve u jedan red
		System.out.println("Ime zaposlenog: " + ime + 
                ", Prezime zaposlenog: " + prezime + 
                ", Godine staza: " + godine_staza + 
                ", Plata: " + plata);		
	}
	//Ispisuje ime zaposlenog koji ima najvecu platu
	public void IznosPlate(){
		if(plata < 800 && godine_staza > 10) {
			plata +=1.06;
		}else {
			System.out.println("Plata se ne povecava, ostaje ista.");
		}
		
	}
}
