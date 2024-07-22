package com.example.solo.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepository extends JpaRepository<Family, Long>{
	Optional<Family> findByUserID(String userID);
	boolean existsByUserID(String userID);
	boolean existsByPhoneNum(String phoneNum);
}
