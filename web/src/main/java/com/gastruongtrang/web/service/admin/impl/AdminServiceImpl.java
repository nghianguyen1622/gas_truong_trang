package com.gastruongtrang.web.service.admin.impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gastruongtrang.web.dto.admin.AdminDto;
import com.gastruongtrang.web.model.admin.Admin;
import com.gastruongtrang.web.respository.RoleRepository;
import com.gastruongtrang.web.respository.admin.AdminRepository;
import com.gastruongtrang.web.service.admin.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	

	@Override
	public Admin findByUsername(String username) {
		
		return adminRepository.findByUsername(username);
	}

	@Override
	public Admin save(AdminDto adminDto) {
		Admin admin = new Admin();
		admin.setFirstName(adminDto.getFistName());
		admin.setLastName(adminDto.getLastName());
		admin.setUsername(adminDto.getUsername());
		admin.setPassword(adminDto.getPassword());
		admin.setRoles(Arrays.asList(roleRepository.findByName("ADMIN")));
		
		return adminRepository.save(admin);
	}

}
