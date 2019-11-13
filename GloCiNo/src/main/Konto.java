package GloCiNo;

/**
 * Diese Klasse enthält ein Konto, das mit einer bestimmten Spendenaktion assoziiert ist.
 */
class Konto {
	/**
	 * Die Bankleitzahl des Kontos
	 */
	private String blz;

	/**
	 * Die Kontonummer
	 */
	private String kontoNr;

	/**
	 * Der Name des Kontoinhabers
	 */
	private String name;

	/**
	 * Die Bank des Kontos
	 */
	private String bank;

	//private Aktion aktion;
	//private Spende spende;
	//later we will create a method that takes spende and forward it to aktion without saving it in konto class

	public Konto(String blz, String kontoNr, String name, String bank) {
		this.blz = blz;
		this.kontoNr = kontoNr;
		this.name = name;
		this.bank = bank;
	}

	//getters and setters for variables

	public String getBlz() {
		return blz;
	}

	public void setBlz(String blz) {
		this.blz = blz;
	}

	public String getKontoNr() {
		return kontoNr;
	}

	public void setKontoNr(String kontoNr) {
		this.kontoNr = kontoNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
			this.bank = bank;
		}
}