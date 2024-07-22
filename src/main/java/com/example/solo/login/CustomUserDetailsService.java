package com.example.solo.login;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetailsService;

//import com.example.solo.user.Family;
//import com.example.solo.user.FamilyRepository;

public class CustomUserDetailsService {
	
//	@Autowired
//	private FamilyRepository familyRepository;
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UserNotFoundException {
//        // 사용자 조회 로직
//        Family family = familyRepository.findByUserID(userID)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
//        
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), Collections.emptyList());
//    }
}
