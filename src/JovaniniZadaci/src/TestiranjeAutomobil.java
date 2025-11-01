
public class TestiranjeAutomobil {

	public static void main(String[] args) {
		Automobil auto= new Automobil("BMW", "Karavan 300", 2015, 6);
		
		
		auto.Ispisi();
		auto.Ubrzaj(300);
		
		auto.Uspori(-9);
		auto.Ispisi();

	}

}
