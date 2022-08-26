package tn.espritcrm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import tn.espritcrm.exception.ResourceNotFoundException;
import tn.espritcrm.entities.Services;
import tn.espritcrm.repository.ServicesRepository;




@RestController
@CrossOrigin(origins = "http://localhost:9989")
@RequestMapping("/api/v1/Services")






public class ServicesController {


	
	
	@Autowired
	private ServicesRepository ServicesRepository;
	
	
	
	// get all Services 
	//  WORK 
	@GetMapping("/Services")
	public List<Services> getAllServices(){
		return ServicesRepository.findAll();
	}		
	
	
	
	
	
	 // create Services rest API
	@PostMapping("/Services")
	public Services createServices(@RequestBody Services newReclamation ) {
		return ServicesRepository.save(newReclamation);
	} 
	
	
	
	
	
	
	
	
	
	
	// get Services by id rest API 
	@GetMapping("/Services/{id_s}")
	public ResponseEntity<Services> getServicesById(@PathVariable Long id_s) {
		
	
		
		Services Services = ServicesRepository.findById(id_s)
				.orElseThrow(() -> new ResourceNotFoundException("Services not exist with id :" + id_s));
		
		

		
		
		return ResponseEntity.ok(Services);
		

		
	}
	
	
	
	
	
	// update Services rest api
	
	@PutMapping("/Services/{id_s}")
	public ResponseEntity<Services> updateServices(@PathVariable (value = "id_s") Long id_s, 
			@Valid @RequestBody Services ServicesDetails) {
		Services Services = ServicesRepository.findById(id_s)
				.orElseThrow(() -> new ResourceNotFoundException("Services not exist with id :" + id_s));
		
		Services.setId_s(ServicesDetails.getId_s());
		//Services.setDate(ServicesDetails.getDate());
		Services.setNom(ServicesDetails.getNom());
		Services.setEmailAddress(ServicesDetails.getEmailAddress());
	
		
		Services.setPhoneNumber(ServicesDetails.getPhoneNumber());
		
		Services.setTypeS(ServicesDetails.getTypeS());
		
		Services updatedServices = ServicesRepository.save(Services);
		return ResponseEntity.ok(updatedServices);
	}
	
	// delete Services rest API
	@DeleteMapping("/Services/{id_s}")
	public ResponseEntity<Map<String, Boolean>> deleteServices(@PathVariable Long id_s){
		Services Services = ServicesRepository.findById(id_s)
				.orElseThrow(() -> new ResourceNotFoundException("Services not exist with id :" + id_s));
		
		ServicesRepository.delete(Services);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	

	

	
	
}