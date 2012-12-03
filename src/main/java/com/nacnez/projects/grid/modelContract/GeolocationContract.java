package com.nacnez.projects.grid.modelContract;

import com.nacnez.util.modelgen.TargetModel;
import com.nacnez.util.modelgen.generator.rules.DoubleLimit;

@TargetModel(modelClass=com.nacnez.projects.grid.model.Geolocation.class)
public interface GeolocationContract {
	
	@DoubleLimit(lowLimit="-90.00",highLimit="90.00")
	public void setLatitude(Double latitude);
	
	
	@DoubleLimit(lowLimit="-180.00",highLimit="180.00")
	public void setLongitude(Double longitude);

}
