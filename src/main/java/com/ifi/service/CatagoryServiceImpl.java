/*
 * Created on 2018-10-01 ( Date ISO 2018-10-01 - Time 16:29:37 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;



import java.util.List;

import javax.transaction.Transactional;

import com.ifi.entity.Catagory;
import com.ifi.repository.CatagoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CatagoryServiceImpl implements CatagoryService {

	@Autowired
	private CatagoryRepository catagoryRepository;

	@Override
	public Catagory getOne(Integer id) {
		return catagoryRepository.findById(id).get();
	}

	@Override
	public Boolean delete(Integer id) {
		if (catagoryRepository.getOne(id) != null) {
			catagoryRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public Catagory create(Catagory catagory) {
		return catagoryRepository.save(catagory);
	}

	@Override
	public Catagory update(Catagory catagoryToUpdate) {
						Catagory catagory = catagoryRepository.getOne(catagoryToUpdate.getId());
														
				if(catagoryToUpdate.getName() !=null) {
			
		}
				if(catagoryToUpdate.getGroupsCatagory() !=null) {
			
		}
				return catagoryRepository.save(catagory);
	}

	@Override
	public Boolean exist(Catagory catagory) {
						return catagoryRepository.existsById(catagory.getId());
													}

	@Override
	public List<Catagory> findAll() {
		return catagoryRepository.findAll();
	}

}


