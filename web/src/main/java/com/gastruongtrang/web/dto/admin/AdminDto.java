package com.gastruongtrang.web.dto.admin;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class AdminDto {
	
	@Size(min = 2, max = 10, message = "Tên chứa từ 2 đến 10 kí tự!")
	private String fistName;
	
	@Size(min = 2, max = 10, message = "Tên chứa từ 2 đến 10 kí tự!")
	private String lastName;
	
	private String username;
	
	@Size(min = 5, max = 15, message = "Mật khẩu từ 5 đến 15 kí tự!")
	private String password;
	
	private String repeatPassword;

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}
	
	


}
