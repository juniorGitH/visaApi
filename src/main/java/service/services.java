package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connexion.connexion;
import gestionClient.Client;

public class services {
    
  
	  public static boolean save (Client a) 
	    {
	        Connection con = connexion.connecter();
	        boolean ajout = false;
	        String request = "INSERT INTO client(id_client, Nom, num, email, password) VALUES (?,?,?,?,NOW())";
	        
	        try {
	            PreparedStatement ps = con.prepareStatement(request);
	            ps.setInt(1, a.getCodeClient());
	            ps.setString(2, a.getNom());
	            ps.setString(3, a.getNumero());
	            ps.setString(4, a.getEmail());
	            ps.setString(5,a.getPassword());
	            ps.execute();
	            ajout = true;
	         //   System.out.println("Le produit a bien ete enregistrer");
	        } catch (SQLException ex) {
	           
	        }
	        
	        return ajout;
	    }
	  
	    
	    public static boolean modifier (Client a ) {
	        Connection con = connexion.connecter();
	        boolean mod = false;
	        String request = "update client set Nom =?, num = ?, email = ?, password=? where id_client = ? ";
	        
	        try {
	            PreparedStatement ps = con.prepareStatement(request);
	            ps.setInt(1, a.getCodeClient());
	            ps.setString(2, a.getNom());
	            ps.setString(3, a.getNumero());
	            ps.setString(4, a.getEmail());
	            ps.setString(5,a.getPassword());
	            mod = true;
	        } catch (SQLException ex) {
	            
	        }
	        
	        return mod;
	    }
	    
	    public static boolean supprimer (Client a) {
	        Connection con = connexion.connecter();
	        boolean sup = false;
	        String request = "delete from client where code = ?";
	        try {
	            PreparedStatement ps = con.prepareStatement(request);
	            ps.setInt(1, a.getCodeClient());
	            ps.execute();
	            sup = true;
	        } catch (SQLException ex) {
	          
	        }
	        return sup;
	    }
	    
	
	    public static List<Client> listClient() throws SQLException 
	    {
	        Connection con = connexion.connecter();
	        String request = "select * from client";
	        ResultSet rs;
	        List<Client> list = new ArrayList<>();
	        Statement st = con.createStatement();
	        rs = st.executeQuery(request);
	        while(rs.next())
	        {
	            Client a = new Client();
	            a.setCodeClient(rs.getInt("id_client"));
	            a.setNom(rs.getString("Nom"));
	            a.setNumero(rs.getString("num"));
	            a.setEmail(rs.getString("email"));
	            a.setPassword(rs.getString("password"));
	            list.add(a);
	        }
	        return list;
	        
	    }  
	    
}
