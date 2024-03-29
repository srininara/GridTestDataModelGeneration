package com.nacnez.projects.grid.modelContract;

import com.nacnez.projects.grid.model.Geolocation;
import com.nacnez.util.modelgen.Contract;
import com.nacnez.util.modelgen.GenerationContract;
import com.nacnez.util.modelgen.TargetModel;
import com.nacnez.util.modelgen.generator.rules.Alphanumeric;
import com.nacnez.util.modelgen.generator.rules.FromList;
import com.nacnez.util.modelgen.generator.rules.Limit;
import com.nacnez.util.modelgen.generator.rules.Size;

@TargetModel(modelClass=com.nacnez.projects.grid.model.Address.class)
public interface AddressContract extends GenerationContract{

	@Alphanumeric
	@Size(maxSize=32)
	void setFirstLine(String firstLine);

	@Alphanumeric
	@Size(maxSize=32)
	void setSecondLine(String secondLine);


	@FromList(fromList={"India"})
	void setCountry(String country);

	@Limit(lowLimit=110000,highLimit=900000)
	void setPostCode(int postCode);
	
	@Contract(contractClass=com.nacnez.projects.grid.modelContract.GeolocationContract.class)
	public void setCurrentLocation(Geolocation currentLocation);
	

}