
public class Glavna {

	public static void main(String[] args) {
		Automobil auto = new Automobil("Mercedes" , 2018, 1800, "crvena", 3, "dizel");
		Kamion kamion= new Kamion("Volvo", 2001, 4000, "crna", 12, true);
		Kombi kombi = new Kombi("Mercedes", 2016, 2000, "bijela", 9);
		
		System.out.println("===Automobil===");
		auto.prikazInformacije();
		System.out.println("Registracija" + auto.cijenaRegistracije() +"EUR");
		
		System.out.println("===Kamion===");
		kamion.prikazInformacije();
		System.out.println("Registracija " +kamion.cijenaRegistracije() +"EUR");
		
		System.out.println("Kombi");
		kombi.prikazInformacije();
		System.out.println("Registracija " + kombi.cijenaRegistracije() + "EUR");
		
	}

}
