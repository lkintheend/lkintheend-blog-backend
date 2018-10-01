/*
 * Created on 2018-10-01 ( Date ISO 2018-10-01 - Time 16:29:37 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;



import java.util.List;

import javax.transaction.Transactional;

import com.ifi.entity.GroupsCatagory;
import com.ifi.repository.GroupsCatagoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class GroupsCatagoryServiceImpl implements GroupsCatagoryService {

	@Autowired
	private GroupsCatagoryRepository groupsCatagoryRepository;

	@Override
	public GroupsCatagory getOne(Integer id) {
		return groupsCatagoryRepository.findById(id).get();
	}

	@Override
	public Boolean delete(Integer id) {
		if (groupsCatagoryRepository.getOne(id) != null) {
			groupsCatagoryRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public GroupsCatagory create(GroupsCatagory groupsCatagory) {
		return groupsCatagoryRepository.save(groupsCatagory);
	}

	@Override
	public GroupsCatagory update(GroupsCatagory groupsCatagoryToUpdate) {
						GroupsCatagory groupsCatagory = groupsCatagoryRepository.getOne(groupsCatagoryToUpdate.getId());
										
				if(groupsCatagoryToUpdate.getName() !=null) {
			
		}
				return groupsCatagoryRepository.save(groupsCatagory);
	}

	@Override
	public Boolean exist(GroupsCatagory groupsCatagory) {
						return groupsCatagoryRepository.existsById(groupsCatagory.getId());
									}

	@Override
	public List<GroupsCatagory> findAll() {
		return groupsCatagoryRepository.findAll();
	}

}


