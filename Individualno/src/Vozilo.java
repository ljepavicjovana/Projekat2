
public class Vozilo {
	protected String proizvodjac;
	protected int godinaProizvodnje;
	protected int kubikaza;
	protected String boja;
	
	public Vozilo(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja) {
		this.proizvodjac=proizvodjac;
		this.godinaProizvodnje=godinaProizvodnje;
		this.kubikaza=kubikaza;
		this.boja=boja;
	}

	public String getProizvodjac() {
		return proizvodjac;
	}

	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public int getKubikaza() {
		return kubikaza;
	}

	public String getBoja() {
		return boja;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	public void prikazInformacije() {
		System.out.print("Proizvodjac vozila " +proizvodjac);
		System.out.print("Godina proizvodnje vozila: " +godinaProizvodnje);
		System.out.print("Kubikaza " +kubikaza);
		System.out.print("Boja vozila " +boja);
	}
	public float cijenaRegistracije() {
		float cijena;
		cijena = 100;
		if(godinaProizvodnje < 2010) 
			cijena +=30;
		if(kubikaza > 2000)
			cijena += 50;
		
		return cijena;
		
	}
}
