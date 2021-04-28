package com.springboot.payload.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.payload.Dao.PayloadDao;
import com.springboot.payload.Service.PayloadService;
import com.springboot.payload.entity.Load;

@RestController
@RequestMapping(value="/api/loadbooking")
public class MyController {
	
	@Autowired
	PayloadService payloadService;
	
	@PostMapping(value="/createloading")
	public Load createLoading(@RequestBody Load load) {
		//return payloadService.createLoading(load);
		return this.payloadService.createLoading(load);
	}

}
