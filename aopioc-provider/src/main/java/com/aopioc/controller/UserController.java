package com.aopioc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @Description: 服务提供者
 *
 * @author: zhouzhou
 *
 * @email: cglcoder@sina.com
 *
 * 日期：2018年3月27日
 */

import com.aopioc.entity.User;
import com.aopioc.repository.UserRepository;
@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/{id}")
	public User findOne(@PathVariable Long id) {
		return userRepository.findOne(id);
	}
	
	
	
	
	
	
}
