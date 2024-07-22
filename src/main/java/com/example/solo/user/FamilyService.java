package com.example.solo.user;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.solo.login.LoginRequest;
import com.example.solo.login.SignUpRequest;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;


@Service
@Transactional
@RequiredArgsConstructor
public class FamilyService {
	
	private FamilyRepository familyRepository;
	
	
	
	
	/**
     * loginId 중복 체크
     * 회원가입 기능 구현 시 사용
     * 중복되면 true return
     */
    public boolean checkLoginIdDuplicate(String userID) {
        return familyRepository.existsByUserID(userID);
    }
	
	// 회원가입
	public void createFamily(SignUpRequest req) {
	}
	
	
	/**
     *  로그인 기능
     *  화면에서 LoginRequest(loginId, password)을 입력받아 loginId와 password가 일치하면 User return
     *  loginId가 존재하지 않거나 password가 일치하지 않으면 null return
     */
	public Family login(LoginRequest req) {
		Optional<Family> optionalFamily = familyRepository.findByUserID(req.getUserID());
		
		if(optionalFamily.isEmpty()) {
			return null;
		}
		
		Family family = optionalFamily.get();
		
		if(!family.getPassword().equals(req.getPassword())) {
			return null;
		}
		return family;
	}
	
	public Family getLoginUserById(Long userId) {
		if(userId == null) return null;
		
		Optional<Family> optionalFamily = familyRepository.findById(userId);
		if(optionalFamily.isEmpty()) return null;
		
		return optionalFamily.get();
	}
	
	public Family getLoginUserByLoginId(String loginId) {
		if(loginId == null) return null;
		
		Optional<Family> optionalFamily = familyRepository.findByUserID(loginId);
		if(optionalFamily.isEmpty()) return null;
		
		return optionalFamily.get();
	}
}
