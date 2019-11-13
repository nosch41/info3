package GloCiNo;

/**
 * Diese Klasse enthält persönliche Daten eines Aktionsorganisators.
 */
class Organisator {
	/**
	 * Emailadresse des Organisators
	 */
	private String email;

	/**
	 * Nachname des Organisators
	 */
	private String nachname;

	/**
	 * Vorname des Organisators
	 */
	private String vorname;

	/**
	 * Passwort des Organisators
	 */
	private String passwort;

	public Organisator(String email, String nachname, String vorname, String passwort) {
		this.email = email;
		this.nachname = nachname;
		this.vorname = vorname;
		this.passwort = passwort;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

}
