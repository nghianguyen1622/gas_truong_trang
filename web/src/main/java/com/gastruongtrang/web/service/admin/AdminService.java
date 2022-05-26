package com.gastruongtrang.web.service.admin;

import com.gastruongtrang.web.dto.admin.AdminDto;
import com.gastruongtrang.web.model.admin.Admin;

public interface AdminService {
	Admin findByUsername(String username);
	
	Admin save(AdminDto adminDto);

}
