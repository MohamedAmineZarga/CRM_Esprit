package tn.espritcrm.entities;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;



@Entity
@Table(name ="users")
public class User {


	
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   id_u ;

    private String nom ;
    private String prenom ; 
    private String genre ; 
    private String address ; 
    
    

    


    private Date  date_n  ; 
    


    private @NotBlank String email ; 
    
    

    private @NotBlank String password ; 
    
   

    private @NotBlank boolean loggedIn;

    
    
    private String role ; 
    private String etat ; 

    
    
    
//    @Override
//	public String toString() {
//		return "Comptes [id_u=" + id_u + ", nom=" + nom + ", prenom=" + prenom + ", genre=" + genre + ", address="
//				+ address + ", date_n=" + date_n + ", email=" + email + ", password=" + password + ", role="
//				+ role + ", etat=" + etat + " ]";
//	}
//    
    
    // Functions 
    
    
    
  
	
	
	
	public User () 
	{
		
		
	}
	
	
	 public User(@NotBlank String username, 
             @NotBlank String password) {
     this.email = username;
     this.password = password;
     this.loggedIn = false;
 }
	
	

	
	
	
	
	public User( Long  id_u , String email, String password) {
		
		this.id_u = id_u;  
		this.email = email;
		this.password = password;
	}
	
	
	
//	 LOGIN 
	
	
	  public boolean isLoggedIn() {
	        return loggedIn;
	    }
	    public void setLoggedIn(boolean loggedIn) {
	        this.loggedIn = loggedIn;
	    }
	    
	    
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof User)) return false;
	        User user = (User) o;
	        return Objects.equals(email, user.email) &&
	                Objects.equals(password, user.password);
	    }
	    
	    
	    @Override
	    public int hashCode() {
	        return Objects.hash(id_u, email, password, 
	                            loggedIn);
	    }
	    
	    
	    
	    @Override
	    public String toString() {
	        return "User{" +
	                "id=" + id_u +
	                ", user email='" + email + '\'' +
	                ", password='" + password + '\'' +
	                ", loggedIn=" + loggedIn +
	                '}';
	    }
	    
	    


	
	

	
	
	  
    
		public Long  getId_u() {
			return id_u;
		}
	public void setId_u(Long id_u) {
		this.id_u = id_u;
	}


	
	
	
	
	public User(Long id_u, String nom, String prenom, String genre, String address, Date date_n, String email,
			String password, String role, String etat) {
		super();
		this.id_u = id_u;
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.address = address;
		this.date_n = date_n;
		this.email = email;
		this.password = password;
		this.role = role;
		this.etat = etat;
	}


	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date  getDate_n() {
		return date_n;
	}
	public void setDate_n(Date date_n) {
		this.date_n = date_n;
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
	public String getrole() {
		return role;
	}
	public void setrole(String role) {
		this.role = role;
	}
	public String getetat() {
		return etat;
	}
	public void setetat(String etat) {
		this.etat = etat;
	}


    
    
    
    
    
	
	
	
}
