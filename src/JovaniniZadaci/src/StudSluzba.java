/*2. Kreirati jednostavan program za potrebe studentske službe. U sistemu je potrebno
omogućiti upravljanje podacima o studentima (ime, prezime, broj indeksa i dodati tri
ocjene).
a. U testnoj klasi potrebno je dodati nove studente i informacije o njima.
b. Na osnovu unešenih ocjena potrebno je izračunati prosječnu ocjenu i na
osnovu prosjeka odrediti da li student može ostvariti pravo na studentski
kredit (prosjek veći od 9).
c. Na kraju programa, koristeći statičku promjenljivu, potrebno je odštampati
spisak studenata u formatu: (Ime , Prezime, Stipendija (Da/Ne)).
*/
public class StudSluzba {
	private String ime;
	private String prezime;
	private String broj_indeksa;
	private int ocjena1, ocjena2, ocjena3;
	
	public StudSluzba(String ime,String prezime, String broj_indeksa, int ocjena1, int ocjena2, int ocjena3) {
		this.ime=ime;
		this.prezime=prezime;
		this.broj_indeksa=broj_indeksa;
		this.ocjena1=ocjena1;
		this.ocjena2=ocjena2;
		this.ocjena3=ocjena3;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public String getBroj_indeksa() {
		return broj_indeksa;
	}
	public int getOcjena1() {
		return ocjena1;
	}
	public int getOcjena2() {
		return ocjena2;
	}
	public int getOcjena3() {
		return ocjena3;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public void setBroj_indeksa(String broj_indeksa) {
		this.broj_indeksa = broj_indeksa;
	}
	public void setOcjena1(int ocjena1) {
		this.ocjena1 = ocjena1;
	}
	public void setOcjena2(int ocjena2) {
		this.ocjena2 = ocjena2;
	}
	public void setOcjena3(int ocjena3) {
		this.ocjena3 = ocjena3;
	}
	
	public boolean imaStipendiju() {
	    double prosjek = (ocjena1 + ocjena2 + ocjena3) / 3.0;
	    if (prosjek > 9) {
	        System.out.println("Student ima pravo na studentski kredit.");
	        return true;
	    } else {
	        System.out.println("Student nema pravo na studentski kredit.");
	        return false;
	    }
	}

//ovdje koristim ternarni operator 
	public void ispisi() {
	    System.out.println("Ime: " + ime + ", Prezime: " + prezime + 
	                       ", Stipendija: " + (imaStipendiju() ? "Da" : "Ne"));
	}


}
