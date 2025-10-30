
public class Kamion extends Vozilo {
	private double kapacitetTereta;
	private boolean prikolica;
	
	public Kamion(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, double kapacitetTereta, boolean prikolica) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		this.kapacitetTereta=kapacitetTereta;
		this.prikolica=prikolica;
	}
	@Override
	public void prikazInformacije() {
        super.prikazInformacije();
        System.out.println("Kapacitet tereta: " + kapacitetTereta + " tona");
        System.out.println("Prikolica: " + (prikolica ? "Da" : "Ne"));
    }
	@Override
	public float cijenaRegistracije() {
        float cijena = super.cijenaRegistracije();

        if (prikolica)
            cijena += 50;

        return cijena;
    }
}
