package com.gabrielluizsf.RegisterSeriesAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielluizsf.RegisterSeriesAPI.entities.Series;
import com.gabrielluizsf.RegisterSeriesAPI.repositories.SeriesRepository;

@RestController
@RequestMapping(value ="/series/API")
public class RegisterController {
	@Autowired
 private SeriesRepository repository;
	
	//Print All Series
	@GetMapping
	public List<Series>seeAll(){
		List<Series> result = repository.findAll();
		return result;
			
		
	}
	//print 1 Series
	@GetMapping(value="/{id}")
	public Series findSeries(@PathVariable Long id){
		Series result = repository.findById(id).get();
		return result;
			
		
	}
	//print 1 Series
	@PostMapping
	public Series insert(@RequestBody Series series){
		Series result = repository.save(series);
		return result;
			
		
	}
}
