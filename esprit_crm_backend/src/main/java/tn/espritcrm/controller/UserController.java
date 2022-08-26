package tn.espritcrm.controller;



import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

//import java.util.Collection;
import java.util.List;


import tn.espritcrm.repository.UserRepository;
import tn.espritcrm.entities.*;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMethod;





@RestController
@CrossOrigin(origins = "http://localhost:8099")
@RequestMapping("/api/v1/users")







public class UserController {
    @Autowired
   private  UserRepository userRepository;
    
    
    
    
    
 // get all users 
 	//  WORK 

    @GetMapping("/list")
	public List<User> getAllusers(){
		return userRepository.findAll();
	}
 	
 	
    
    
    @GetMapping("/msg")
    public Status getmsg() {
      
    	System.out.println("MSG");
        return Status.SUCCESS;
    }
    
    
//    
 
    @PostMapping("/register")
    public Status registerUser(@Valid @RequestBody User newUser) {
        List<User> users = userRepository.findAll();
        System.out.println("New user: " + newUser.toString());
        for (User user : users) {
            System.out.println("Registered user: " + newUser.toString());
            if (user.equals(newUser)) {
                System.out.println("User Already exists!");
                return Status.USER_ALREADY_EXISTS;
            }
            
            
            
        }
        userRepository.save(newUser);
        return Status.SUCCESS;
    }
    
  
  
    // create Reclamations rest API
   	@PostMapping("/new")
   	public User createUsers(@RequestBody User newUser ) {
   		return userRepository.save(newUser);
   	} 
   	

//    @PostMapping("/login")
//
//    
//    public Status loginUser(@Valid  User user) {
//        List<User> users = userRepository.findAll();
//        for (User other : users) {
//            if (other.equals(user)) {
//            	user.setLoggedIn(true);
//                userRepository.save(user);
//                return Status.SUCCESS;
//            }
//        }
//        return Status.FAILURE;
//    }
    
    
//    
//    
//    @PostMapping("/logout")
//    public Status logUserOut(@Valid @RequestBody User user) {
//        List<User> users = userRepository.findAll();
//        for (User other : users) {
//            if (other.equals(user)) {
//                user.setLoggedIn(false);
//                userRepository.save(user);
//                return Status.SUCCESS;
//            }
//        }
//        return Status.FAILURE;
//    }
//    
//    
//    
//    @DeleteMapping("/users/all")
//    public Status deleteUsers() {
//        userRepository.deleteAll();
//        return Status.SUCCESS;
//    }
}