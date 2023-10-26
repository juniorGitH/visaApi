package service;

import java.sql.Date;

public class Notification {

	private int idDev;
	private int idNotification;
	private String type;
	private String Contenue;
	private Date heur;
	private String lens;
	public Notification(int idDev, int idNotification, String type, String contenue, Date heur, String lens) {
		this.idDev = idDev;
		this.idNotification = idNotification;
		this.type = type;
		Contenue = contenue;
		this.heur = heur;
		this.lens = lens;
	}
	public int getIdDev() {
		return idDev;
	}
	public void setIdDev(int idDev) {
		this.idDev = idDev;
	}
	public int getIdNotification() {
		return idNotification;
	}
	public void setIdNotification(int idNotification) {
		this.idNotification = idNotification;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContenue() {
		return Contenue;
	}
	public void setContenue(String contenue) {
		Contenue = contenue;
	}
	public Date getHeur() {
		return heur;
	}
	public void setHeur(Date heur) {
		this.heur = heur;
	}
	public String getLens() {
		return lens;
	}
	public void setLens(String lens) {
		this.lens = lens;
	}
	@Override
	public String toString() {
		return "Notification [idDev=" + idDev + ", idNotification=" + idNotification + ", type=" + type + ", Contenue="
				+ Contenue + ", heur=" + heur + ", lens=" + lens + "]";
	}
	
	
}
