package tn.espritcrm.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name = "services")
public class  Services{

	
	
	// Variables 
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		
		
		
		

		private long id_s  ; 
		
		
		private String nom ; 
		private String email_address ; 
		private String phoneNumber ; 
		private String typeS ;
		
		
		
		
		
		public Services() {
			super();
		}
		
		
		public Services(long id_s, String nom, String email_address, String phoneNumber, String typeS) {
			super();
			this.id_s = id_s;
			this.nom = nom;
			this.email_address = email_address;
			this.phoneNumber = phoneNumber;
			this.typeS = typeS;
		}
		public long getId_s() {
			return id_s;
		}
		public void setId_s(long id_s) {
			this.id_s = id_s;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getEmailAddress() {
			return email_address;
		}
		public void setEmailAddress(String emailAddress) {
			this.email_address = emailAddress;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getTypeS() {
			return typeS;
		}
		public void setTypeS(String typeS) {
			this.typeS = typeS;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((email_address == null) ? 0 : email_address.hashCode());
			result = prime * result + (int) (id_s ^ (id_s >>> 32));
			result = prime * result + ((nom == null) ? 0 : nom.hashCode());
			result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
			result = prime * result + ((typeS == null) ? 0 : typeS.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Services other = (Services) obj;
			if (email_address == null) {
				if (other.email_address != null)
					return false;
			} else if (!email_address.equals(other.email_address))
				return false;
			if (id_s != other.id_s)
				return false;
			if (nom == null) {
				if (other.nom != null)
					return false;
			} else if (!nom.equals(other.nom))
				return false;
			if (phoneNumber == null) {
				if (other.phoneNumber != null)
					return false;
			} else if (!phoneNumber.equals(other.phoneNumber))
				return false;
			if (typeS == null) {
				if (other.typeS != null)
					return false;
			} else if (!typeS.equals(other.typeS))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Services [id_s=" + id_s + ", nom=" + nom + ", emailAddress=" + email_address + ", phoneNumber="
					+ phoneNumber + ", typeS=" + typeS + "]";
		} 
		
		
		

		
		
}
