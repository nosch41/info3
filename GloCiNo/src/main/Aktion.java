package GloCiNo;

/**
 * Diese Klasse enthält Informationen zu einer Spendenaktion.
 */
class Aktion {
	/**
	 * Der Name der Aktion
	 */
	private String name;

	/**
	 * Die bisher gesammelten Spenden
	 */
	private double spenden;

	/**
	 * Das angestrebte Spendenziel
	 */
	private double spendenziel;

	/**
	 * Eine komplett neue Aktion erstellen
	 */
	public Aktion(String name, double spendenziel) {
		this.name = name;
		this.spenden = 0;
		this.spendenziel = spendenziel;
	}

	/**
	 * Eine unabhängig schon bestehende Aktion nachträglich in das System aufnehmen
	 */
	public Aktion(String name, double spenden, double spendenziel) {
		this.name = name;
		this.spenden = spenden;
		this.spendenziel = spendenziel;
	}

	public double getSpendenziel() {
		return spendenziel;
	}

	public void setSpendenziel(double spendenziel) {
		this.spendenziel = spendenziel;
	}

	public double getSpenden() {
		return spenden;
	}

	public void setSpenden(double spenden) {
		this.spenden = spenden;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
