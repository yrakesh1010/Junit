package com.rk.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.BeforeClass;
import org.junit.Test;

import com.rk.dao.ContactDao;
import com.rk.exception.IdNotFoundException;
import com.rk.pojo.ContactPojo;

public class ContactServiceTest_01 {
	
	private static ContactDao mock;
	static ContactServiceImpl service;
	

	
	//creating proxy
	@BeforeClass
	public static void init() {
    mock = EasyMock.createMock(ContactDao.class);
    
        //setting behavior of proxy for method getNameById_01()
  		EasyMock.expect(mock.findNameById(101)).andReturn("rakesh");
  		EasyMock.expect(mock.findNameById(202)).andReturn("Suresh");
  		
  		 //getAllNames_02() 
  		List<String> names=new ArrayList<String>();
		names.add("RAKESH");
		names.add("Raju");
		names.add("SHYAM");
		//setting behavior of proxy for getAllNames_02() 
		EasyMock.expect(mock.findNames()).andReturn(names);
		
		//getNameByPojoIdTest_03()
		ContactPojo pojo=new ContactPojo();
		pojo.setId(105);
		pojo.setName("rakesh");
		pojo.setAddress("Hydrabad");
	    EasyMock.expect(mock.findByIdPojo(105)).andReturn(pojo);
		
	    //getNameByPojoException_04()
	    EasyMock.expect(mock.findByIdPojo(206)).andReturn(null);
	    
		//It is use to save mock behavior for all test cases
		EasyMock.replay(mock);
  		
        service=new ContactServiceImpl();
       //Inject mock object into service class 
        service.setConDao(mock);
	}
	
	@Test
	public void getNameById_01() {
		String nameById = service.getNameById(101);
		assertNotNull(nameById);
	}
	
	@Test
	public void getAllNames_02() {
		List<String> allNames = service.getAllNames();
		assertNotNull(allNames);
	}
	
	@Test
	public void getNameByPojoIdTest_03() {
	    ContactPojo nameByPojoId = service.getNameByPojoId(105);
		assertNotNull(nameByPojoId);
			
	}
	
	@Test(expected = IdNotFoundException.class)
	public void getNameByPojoException_04() {
		 service.getNameByPojoId(206);
	}
}
