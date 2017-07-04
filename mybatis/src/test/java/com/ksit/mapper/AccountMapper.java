package com.ksit.mapper;

import java.util.List;

import com.ksit.entity.Account;

public interface AccountMapper {
	Account selectById(Integer id);
	void save(Account acc);
	void deleteById(Integer id);
	void modify(Account acc);
	List<Account> findAll();
	
	
	
}
