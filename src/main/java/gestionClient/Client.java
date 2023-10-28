package gestionClient;

public class Client {
	
	private int codeClient;
   private  String nom;
   private String email;
   private String password;
   private String numero;
    




	public Client(int codeC, String nom, String email, String password, String numero) {
        this.codeClient = codeC;
        this.nom = nom;
        this.email = email;
        this.password = password;
        this.numero = numero;
    }


	public Client() {
		// TODO Auto-generated constructor stub
	}


	public int getCodeClient() {
		return codeClient;
	}


	public void setCodeClient(int codeClient) {
		this.codeClient = codeClient;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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

	@Override
public String toString() {
	return "Client [codeClient=" + codeClient + ", nom=" + nom + ", email=" + email + ", password=" + password
			+ ", numero=" + numero + "]";
}

	
}
