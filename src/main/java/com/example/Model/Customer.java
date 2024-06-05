package com.example.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	private String name;
	@NotNull
	@Size(min = 0, max = 100)
	String age;
	@NotNull
	@Min(0)
	@Max(16)
	private long aadharcardnumber;
	@NotNull
	@Min(0)
	@Max(14)
	private long accoutnumber;
	@NotNull
	@Size(min = 0, max = 20)
	private String Email;
	@NotNull
	@Min(0)
	@Max(10)
	private long phonenumber;
	@NotNull
	@Size(min = 0, max = 9)
	private String username;
	@NotNull
	@Size(min = 0, max = 12)
	private String password;
	@NotNull
	@Min(3000)
	private double balance;
	


}
