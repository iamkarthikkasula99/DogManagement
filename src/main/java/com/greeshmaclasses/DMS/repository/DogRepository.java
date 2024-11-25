package com.greeshmaclasses.DMS.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.greeshmaclasses.DMS.Models.Dog;


/*
 * @author Greeshma Borra
 * S567537
 * 
 */

public interface DogRepository extends CrudRepository<Dog , Integer> {
	List<Dog> findByName(String Name);
	

}