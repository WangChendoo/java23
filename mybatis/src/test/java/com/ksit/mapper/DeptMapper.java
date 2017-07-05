package com.ksit.mapper;

import com.ksit.entity.Dept;

public interface DeptMapper {
	Dept findByIdLoadAccount(Integer id);
	
	
	
}
