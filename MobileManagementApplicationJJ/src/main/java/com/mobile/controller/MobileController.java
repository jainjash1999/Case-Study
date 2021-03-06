package com.mobile.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;


@RestController
@RequestMapping("/mobile")
public class MobileController {
	@Autowired
	MobileService service;
	@PostMapping("/addMobile") // http://localhost:6060/mobile/addMobile
	public Mobile addMobile(@RequestBody Mobile mob) {
		return service.addMobile(mob);
	}
	
	@PutMapping("/updateMobile") // http://localhost:6060/mobile/updateMobile
	public Mobile updateMobile(@RequestBody Mobile mob) {
		return service.updateMobile(mob);
	}
	
	@GetMapping("/getMobile/{mid}")
	public Optional<Mobile> getMobile(@PathVariable("mid")int mobileId) {
		return service.getMobile(mobileId);
	}
	@GetMapping("/getAllMobile")
	public Iterable<Mobile> getAllMobile() {
		return service.getAllMobile();
	}
	@DeleteMapping("/deleteMobile/{mid}")
	public void deleteMobile(@PathVariable("mid")int mobileId) {
		 service.deleteMobile(mobileId);
	}

}