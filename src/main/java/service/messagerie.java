package service;

import java.sql.Date;

public class messagerie {

private int idDev;
private int idClient;
private String contenu;
private Date heur;
public messagerie(int idDev, int idClient, String contenu, Date heur) {
	this.idDev = idDev;
	this.idClient = idClient;
	this.contenu = contenu;
	this.heur = heur;
}
public int getIdDev() {
	return idDev;
}
public void setIdDev(int idDev) {
	this.idDev = idDev;
}
public int getIdClient() {
	return idClient;
}
public void setIdClient(int idClient) {
	this.idClient = idClient;
}
public String getContenu() {
	return contenu;
}
public void setContenu(String contenu) {
	this.contenu = contenu;
}
public Date getHeur() {
	return heur;
}
public void setHeur(Date heur) {
	this.heur = heur;
}
@Override
public String toString() {
	return "messagerie [idDev=" + idDev + ", idClient=" + idClient + ", contenu=" + contenu + ", heur=" + heur + "]";
}



}
