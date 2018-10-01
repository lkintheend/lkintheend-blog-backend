/*
 * Created on 2018-10-01 ( Date ISO 2018-10-01 - Time 16:29:37 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;

import com.ifi.entity.GmailUser;
import java.util.List;

public interface GmailUserService {

	public GmailUser getOne(Integer userProfileId);

	public List<GmailUser> findAll();

	public Boolean delete(Integer userProfileId);

	public GmailUser create(GmailUser gmailUser);

	public GmailUser update(GmailUser gmailUser);

	public Boolean exist(GmailUser gmailUser);
}