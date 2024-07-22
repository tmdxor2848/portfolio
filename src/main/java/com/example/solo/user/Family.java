package com.example.solo.user;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Family")
public class Family {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String userID;
	
	private String password;
	
	private String name;
	
	private String brDay;
	
	private String gender;
	
	private String phoneNum;
	
	private FamilyRole role;
	
	@Column(updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
