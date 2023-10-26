package service;

import java.sql.Date;

public class Projet {
	private Date temp;
	private int idProjet;
	private int idDev;
	private String Nom;
	private String type;
	private String status;
	private float cout;
	public Projet(Date temp, int idProjet, int idDev, String nom, String type, String status, float cout) {
		this.temp = temp;
		this.idProjet = idProjet;
		this.idDev = idDev;
		Nom = nom;
		this.type = type;
		this.status = status;
		this.cout = cout;
	}
	public Date getTemp() {
		return temp;
	}
	public void setTemp(Date temp) {
		this.temp = temp;
	}
	public int getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}
	public int getIdDev() {
		return idDev;
	}
	public void setIdDev(int idDev) {
		this.idDev = idDev;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getCout() {
		return cout;
	}
	public void setCout(float cout) {
		this.cout = cout;
	}
	@Override
	public String toString() {
		return "Projet [temp=" + temp + ", idProjet=" + idProjet + ", idDev=" + idDev + ", Nom=" + Nom + ", type="
				+ type + ", status=" + status + ", cout=" + cout + "]";
	}
	
}
