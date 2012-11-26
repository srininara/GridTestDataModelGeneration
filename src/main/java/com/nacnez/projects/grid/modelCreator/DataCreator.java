package com.nacnez.projects.grid.modelCreator;

import java.util.Collection;

import com.nacnez.projects.grid.model.Person;
import com.nacnez.projects.grid.modelContract.PersonContract;
import com.nacnez.util.modelgen.GeneratorFactory;
import com.nacnez.util.modelgen.ModelGenerator;

public class DataCreator {
	public static Collection<Person> createData(int count) {
		ModelGenerator<Person> smg = GeneratorFactory.get();
		Collection<Person> c = smg.make(count)
				.instancesWith(PersonContract.class).andProvideAsCollection();
		return c;
	}

}
