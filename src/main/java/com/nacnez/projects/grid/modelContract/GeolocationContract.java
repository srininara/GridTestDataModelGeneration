package com.nacnez.projects.grid.modelContract;

import java.math.BigDecimal;
import com.nacnez.util.modelgen.TargetModel;
import com.nacnez.util.modelgen.generator.rules.DecimalLimit;

@TargetModel(modelClass=com.nacnez.projects.grid.model.Geolocation.class)
public interface GeolocationContract {
	
	@DecimalLimit(lowLimit="-90.00",highLimit="90.00",scale=2)
	public void setLatitude(BigDecimal latitude);
	
	
	@DecimalLimit(lowLimit="-180.00",highLimit="180.00",scale=2)
	public void setLongitude(BigDecimal longitude);

}
