
public class TestiranjeZaposleni {

	public static void main(String[] args) {
		//Konstruktori su mi this.ime=ime itd zbog toga cemo ovako
		Zaposleni z = new Zaposleni("Jovana", "Ljepavic " , 5, 200);
		Zaposleni z1= new Zaposleni("Monika", "Velimirovic", 6, 500);
		Zaposleni z2= new Zaposleni("Ana", "Vukicevic", 8, 5000);
		//prvo ispisivanje
		z.Ispisivanje();
		z1.Ispisivanje();
		z2.Ispisivanje();
		//ovdje sam promijenila platu da vidim hoce li se promijeniti kad pokrenem
		z2.setPlata(900);
		//ovo je da bi se nova vrijednost plate pokrenula, umjesto 5000 da bude 900
		z2.Ispisivanje();
		
		//Da vidim ko ima najvecu platu postavicu da Jovana ima najvecu platu
		Zaposleni najveci = z;
		
		if(z2.getPlata() > najveci.getPlata()) {
			najveci = z2;
		}else if(z1.getPlata() > najveci.getPlata()) {
			najveci=z1;
		}
		
		System.out.println("\nZaposleni sa najvecom platom: " 
	            + najveci.getIme() + " " + najveci.getPrezime() 
	            + " (Plata: " + najveci.getPlata() + ")");
	    }
	}


