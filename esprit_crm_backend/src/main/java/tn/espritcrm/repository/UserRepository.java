package tn.espritcrm.repository;


//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;




//import org.springframework.data.jpa.repository.Query;
//
//
//import org.springframework.stereotype.Repository;

import tn.espritcrm.entities.User;



//@Repository
public interface UserRepository extends JpaRepository<User, Long > {



	
//	User findUserSample(String email, String password);

	
//	    @Query("SELECT u FROM User u WHERE u.email = ?1")
//	    public User findByEmail(String email);
//	     
	
	
}
