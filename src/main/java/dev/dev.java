package dev;

public class dev {

	private int codeDev;
	   private  String nom;
	   private String formation;
	   private String password;
	   private String numero;
	   private String competences;
	    


	   public dev(int codeDev, String nom, String formation, String password, String numero, String competences) {
	        this.codeDev = codeDev;
	        this.nom = nom;
	        this.formation = formation;
	        this.competences = competences;
	        this.password = password;
	        this.numero = numero;
	    }

		public int getCodeDev() {
		return codeDev;
	}





	public void setCodeDev(int codeDev) {
		this.codeDev = codeDev;
	}





	public String getNom() {
		return nom;
	}





	public void setNom(String nom) {
		this.nom = nom;
	}





	public String getFormation() {
		return formation;
	}





	public void setFormation(String formation) {
		this.formation = formation;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public String getNumero() {
		return numero;
	}





	public void setNumero(String numero) {
		this.numero = numero;
	}





	public String getCompetences() {
		return competences;
	}





	public void setCompetences(String competences) {
		this.competences = competences;
	}

	@Override
	public String toString() {
		return "dev [codeDev=" + codeDev + ", nom=" + nom + ", formation=" + formation + ", password=" + password
				+ ", numero=" + numero + ", competences=" + competences + "]";
	}





		
}
