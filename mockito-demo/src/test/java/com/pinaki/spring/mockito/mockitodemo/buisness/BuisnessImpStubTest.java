package com.pinaki.spring.mockito.mockitodemo.buisness;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuisnessImpStubTest {
	


	@Test
	void findtheMaxNumber_basic() {
		DataServiceStub serviceStub = new DataServiceStub();
		BuisnessImp buisnessImp = new BuisnessImp(serviceStub);
		int result=buisnessImp.findtheMaxNumber();
		assertEquals(5, result);
	}
	
	
	
	class DataServiceStub implements DataService{

		@Override
		public int[] retriveDataAll() {
			
			return new int[] {1,2,3,4,5};
		}
		
	}
	

}

