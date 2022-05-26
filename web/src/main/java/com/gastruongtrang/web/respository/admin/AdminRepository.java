package com.gastruongtrang.web.respository.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gastruongtrang.web.model.admin.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{
	Admin findByUsername(String username);

}
