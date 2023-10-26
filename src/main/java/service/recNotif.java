package service;

public class recNotif {
	private int idClient;
	private int idNotification;
	public recNotif(int idClient, int idNotification) {
		
		this.idClient = idClient;
		this.idNotification = idNotification;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public int getIdNotification() {
		return idNotification;
	}
	public void setIdNotification(int idNotification) {
		this.idNotification = idNotification;
	}
	@Override
	public String toString() {
		return "recNotif [idClient=" + idClient + ", idNotification=" + idNotification + "]";
	}
	
	
}
