/*
 * Created on 2018-10-01 ( Date ISO 2018-10-01 - Time 16:29:37 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;



import java.util.List;

import javax.transaction.Transactional;

import com.ifi.entity.GmailUser;
import com.ifi.repository.GmailUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class GmailUserServiceImpl implements GmailUserService {

	@Autowired
	private GmailUserRepository gmailUserRepository;

	@Override
	public GmailUser getOne(Integer userProfileId) {
		return gmailUserRepository.findById(userProfileId).get();
	}

	@Override
	public Boolean delete(Integer userProfileId) {
		if (gmailUserRepository.getOne(userProfileId) != null) {
			gmailUserRepository.deleteById(userProfileId);
			return true;
		}
		return false;
	}

	@Override
	public GmailUser create(GmailUser gmailUser) {
		return gmailUserRepository.save(gmailUser);
	}

	@Override
	public GmailUser update(GmailUser gmailUserToUpdate) {
						GmailUser gmailUser = gmailUserRepository.getOne(gmailUserToUpdate.getUserProfileId());
										
				if(gmailUserToUpdate.getFacebookId() !=null) {
			
		}
				return gmailUserRepository.save(gmailUser);
	}

	@Override
	public Boolean exist(GmailUser gmailUser) {
						return gmailUserRepository.existsById(gmailUser.getUserProfileId());
									}

	@Override
	public List<GmailUser> findAll() {
		return gmailUserRepository.findAll();
	}

}

