package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Customer;
import com.example.Repository.CustomerRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	
	@Autowired
	CustomerRepository br;
	//long id;
	//String name;
	
	@GetMapping("/read")
	public List<Customer> read() {
		return br.findAll();
	}

	@GetMapping("/readname/{id}")
	public Optional<Customer> readbyname(@PathVariable long id) {
		return br.findById(id);
	}

	//@GetMapping("/readOne/{id}")
	//public Optional<Band> readOne(@PathVariable int id) {
		//return ts.readOne(id);
	//}

	// add
	@PostMapping("/add")
	public Customer add(@RequestBody Customer e) {
		return br.save(e);
	}

//	//update
	@PutMapping("/update/{id}")
	public void update(@RequestBody long id, @RequestBody Customer e) {
		Optional<Customer> Customer = br.findById(id);

		br.save(Customer.get());
	}

	// delete
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		
		br.deleteById(id);
	}
}
