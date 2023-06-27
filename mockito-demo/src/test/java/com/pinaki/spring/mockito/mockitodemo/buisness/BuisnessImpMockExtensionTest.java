package com.pinaki.spring.mockito.mockitodemo.buisness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BuisnessImpMockExtensionTest {
	
	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private BuisnessImp buisnessImp;
	
	


	@Test
	void findtheMaxNumber_basic() {
		
		when(dataServiceMock.retriveDataAll()).thenReturn(new int[] {1,2,3,4,5});
		assertEquals(5, buisnessImp.findtheMaxNumber());
	}
	
	@Test
	void findtheMaxNumber_SingleValue() {
		
		when(dataServiceMock.retriveDataAll()).thenReturn(new int[] {5});
		assertEquals(5, buisnessImp.findtheMaxNumber());
	}
	
	
	

}
	



