package service;

import java.sql.Date;

public class Commande {
	private int idClient;
	private int idProjet;
	private Date dateDebu;
	private Date dateFin;
	private String etat;
	public Commande(int idClient, int idProjet, Date dateDebu, Date dateFin, String etat) {
	
		this.idClient = idClient;
		this.idProjet = idProjet;
		this.dateDebu = dateDebu;
		this.dateFin = dateFin;
		this.etat = etat;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public int getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}
	public Date getDateDebu() {
		return dateDebu;
	}
	public void setDateDebu(Date dateDebu) {
		this.dateDebu = dateDebu;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "Commande [idClient=" + idClient + ", idProjet=" + idProjet + ", dateDebu=" + dateDebu + ", dateFin="
				+ dateFin + ", etat=" + etat + "]";
	}
	
	
}
