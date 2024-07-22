package com.example.solo.login;

import com.example.solo.user.Family;
import com.example.solo.user.FamilyRole;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignUpRequest {

	@NotBlank(message = "이름을 입력해 주세요.")
	private String userID;

	@NotBlank(message = "비밀번호가 비어 있습니다.")
	private String password;
	private String passwordCheck;

	@NotBlank(message = "이름이 비어 있습니다.")
	private String name;

	@NotBlank(message = "성별을 체크해 주세요.")
	private String gender;

	@NotBlank(message = "생일을 입력해 주세요.")
	private String birth;

	@NotBlank(message = "핸드폰 번호를 입력해 주세요.")
	private String phone;
	
	// 비밀번호 암호화
    public Family toEntity(String encodedPassword) {
        return Family.builder()
                .userID(this.userID)
                .password(encodedPassword)
                .name(this.name)
                .gender(this.gender)
                .brDay(this.birth)
                .phoneNum(this.phone)
                .role(FamilyRole.USER)
                .build();
    }

}
