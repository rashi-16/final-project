package com.ntl.movieapp.login.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntl.movieapp.login.movies.dao.CredentialsDao;
import com.ntl.movieapp.login.movies.dao.ProfileDao;
import com.ntl.movieapp.login.movies.model.CredentialsBean;
import com.ntl.movieapp.login.movies.model.ProfileBean;




@Service
public class ProfileService {

	public ProfileService() {
		super();
	}
	
	
	@Autowired
	ProfileDao profileDao;
	@Autowired
	CredentialsDao credDao;
	
	
	public ProfileBean register(ProfileBean profileBean) {
		CredentialsBean credentialsBean=new CredentialsBean();

		String charf = profileBean.getFirstName().substring(0,2);
		int id=(int) Math.round(Math.random()*10000);
		String uniqueId=charf+id;
		profileBean.setUserId(uniqueId);
		credentialsBean.setUserID(profileBean.getUserId());
		credentialsBean.setPassword(profileBean.getPassword());
		credentialsBean.setLoginStatus(0);
		profileDao.save(profileBean);
		credDao.save(credentialsBean);
		
		return profileBean;
	}

	

}
