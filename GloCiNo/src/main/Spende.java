package GloCiNo;

/**
 * Diese Klasse enthält eine von einem Spender getätigten Spende, dessen Status sich verfolgen lässt.
 */
class Spende {
	/**
	 * Der Spendenbetrag
	 */
	private double betrag;

	/**
	 * Ob eine Quittung erwünscht ist
	 */
	private boolean quittung;

	/**
	 * Der (Firmen-)Name des Spenders
	 */
	private String spenderName;

	/**
	 * Der Status der getätigten Spende
	 */
	private GloCiNo.Status status = GloCiNo.Status.IN_BEARBEITUNG;

	/**
	 * Art, auf die gezahlt werden soll
	 */
	private Zahlweise zahlweise;

	/**
	 * Eine Spende erstellen, in der explizit eine Quittung gewünscht/abgelehnt wird
	 */
	public Spende(double betrag, boolean quittung, String spenderName) {
		this.betrag = betrag;
		this.quittung = quittung;
		this.spenderName = spenderName;
	}

	/**
	 * Implizit eine Spende ohne anschließende Quittung erstellen
	 */
	public Spende(double betrag, String spenderName) {
		this.betrag = betrag;
		this.spenderName = spenderName;
	}

	public double getBetrag() {
		return betrag;
	}

	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}

	public boolean getQuittung() {
		return quittung;
	}

	public void setQuittung(boolean quittung) {
		this.quittung = quittung;
	}

	public String getSpenderName() {
		return spenderName;
	}

	public void setSpenderName(String spenderName) {
		this.spenderName = spenderName;
	}

	public Status getStatus() {
		return status;
	}
}
