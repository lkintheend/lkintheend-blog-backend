/*
 * Created on 2018-10-01 ( Date ISO 2018-10-01 - Time 16:29:46 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;

import com.ifi.entity.User;
import java.util.List;

public interface UserService {

	public User getOne(Integer userProfileId);

	public List<User> findAll();

	public Boolean delete(Integer userProfileId);

	public User create(User user);

	public User update(User user);

	public Boolean exist(User user);
}