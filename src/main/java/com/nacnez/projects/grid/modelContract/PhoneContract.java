package com.nacnez.projects.grid.modelContract;

import com.nacnez.util.modelgen.TargetModel;

@TargetModel(modelClass=com.nacnez.projects.grid.model.Phone.class)
public interface PhoneContract {

	public void setStdCode(String stdCode);
	public void setPhoneNumber(String phoneNumber);
	
}
