package com.cts.productservice.service;

import java.util.List;
import java.util.Optional;

import com.cts.productservice.entity.*;
import com.cts.productservice.repo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisplayService {
    
    @Autowired
    public DisplayRepository displayRepository;

    public void addDisplayReviews(Display display){
        displayRepository.save(display);
    }

    public Optional<Display> getByDisplayId(int displayId){
        return displayRepository.findById(displayId);
    }

    public List<Display> findByProductIdDisplay(int productId){
        return displayRepository.findByProductIdDisplay(productId);
    }

    public void deleteDisplayReview(int displayId) {
		displayRepository.deleteById(displayId);	
	} 

    public Iterable<Display> getAllDisplay(){
        return displayRepository.findAll();
    }
}