package com.ashokit.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyString;

import java.lang.reflect.Method;

import org.junit.Ignore;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import com.ashokit.dao.UserDaoImpl;

public class UserServiceTest {

	@Test
	@Ignore
	public void testGetNameByUserId() {
		UserDaoImpl mockDao = PowerMockito.mock(UserDaoImpl.class);
		//This will call mock method
		PowerMockito.when(mockDao.findNameById(101))
					.thenReturn("Nick");
		
		UserService service = new UserService(mockDao);
		String name = service.getNameByUserId(101);
		assertEquals("Nick", name);
	}
	
	@Test
	@Ignore
	public void testGetEmailByUserId() {
		UserDaoImpl mockDao = PowerMockito.mock(UserDaoImpl.class);
		//This will call Real method
		PowerMockito.when(mockDao.findEmailById(101))
					.thenCallRealMethod();
		
		UserService service = new UserService(mockDao);
		
		String email = service.getEmailByUserId(101);
		
		assertEquals("john.k@gmail.com", email);
	}
	
	@Test
	@Ignore
	public void testDoProcess() {
		UserService mockService = PowerMockito.mock(UserService.class);
		try {
                        //Do Nothing for methods which are returning void
			PowerMockito.doNothing().when(mockService, "pushMsgToKafkaTopic", anyString());
			mockService.doProcess();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testM1() throws Exception {
		UserService userServiceSpy = PowerMockito.spy(new UserService());

		PowerMockito.when(userServiceSpy, "formatMsg", "test msg")
					.thenReturn("TEST MSG FORMATTED");
		
		String formattedMsg = userServiceSpy.m1();
		assertNotNull(formattedMsg);
	}
}
