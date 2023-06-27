package com.pinaki.spring.mockito.mockitodemo.buisness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class BuisnessImpMockTest {
	


	@Test
	void findtheMaxNumber_basic() {
		
		DataService dataServiceMock  = mock(DataService.class);
		when(dataServiceMock.retriveDataAll()).thenReturn(new int[] {1,2,3,4,5});
		BuisnessImp buisnessImp = new BuisnessImp(dataServiceMock);
		int result=buisnessImp.findtheMaxNumber();
		assertEquals(5, result);
	}
	
	@Test
	void findtheMaxNumber_SingleValue() {
		
		DataService dataServiceMock  = mock(DataService.class);
		when(dataServiceMock.retriveDataAll()).thenReturn(new int[] {5});
		BuisnessImp buisnessImp = new BuisnessImp(dataServiceMock);
		int result=buisnessImp.findtheMaxNumber();
		assertEquals(5, result);
	}
	
	
	

}
	



