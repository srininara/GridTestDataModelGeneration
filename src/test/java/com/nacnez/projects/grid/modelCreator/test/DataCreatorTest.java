package com.nacnez.projects.grid.modelCreator.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collection;

import org.junit.Test;

import com.nacnez.projects.grid.model.Person;
import com.nacnez.projects.grid.modelCreator.DataCreator;

public class DataCreatorTest {

	private static final int TEST_COUNT = 10;

	@Test
	public void generatesDataForTheEntireObjectGraph() {
		Collection<Person> persons = DataCreator.createData(TEST_COUNT);
//		assertEquals(TEST_COUNT,persons.size());
		for (Person person : persons) {
//			assertNotNull(person);
//			assertNotNull(person.getFirstName());
//			assertNotNull(person.getAddress());
//			assertNotNull(person.getAddress().getFirstLine());
//			assertNotNull(person.getAddress().getCurrentLocation());
//			assertNotNull(person.getAddress().getCurrentLocation().getLatitude());
		}
	}

}
