package com.aopioc.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.aopioc.entity.User;
import com.aopioc.feign.UserFeignClient;
import com.netflix.discovery.converters.Auto;



@RestController
public class UserController {
	
	private static final Log log = LogFactory.getLog(UserController.class); 

 /* @Autowired
  private UserFeignClient userFeignClient;

  @GetMapping("/user/{id}")
  public User findById(@PathVariable Long id) {
    return this.userFeignClient.findById(id);
  }
  
  @GetMapping("/user/findAll")
  public List<User> findAll() {
    return this.userFeignClient.findAll();
  }
  
  @GetMapping("/user/findByCondition/{param}")
  public User findByCondition(@PathVariable String param) {
	  System.out.println(param);
	  User user = this.userFeignClient.findByCondition(param);
	 // System.out.println(user.getUsername());
    return user;
  }*/
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/user/{id}")
	public User findOne(@PathVariable Long id){
		return restTemplate.getForObject("http://localhost:8767/"+id, User.class);
	}
	
  
  
  
  
}
