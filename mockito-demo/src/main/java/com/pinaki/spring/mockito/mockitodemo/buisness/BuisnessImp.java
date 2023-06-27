package com.pinaki.spring.mockito.mockitodemo.buisness;

public class BuisnessImp {
	private DataService dataService;
	
	
	public BuisnessImp(DataService dataService) {
		super();
		this.dataService = dataService;
	}


	public int findtheMaxNumber() {
		int []data = dataService.retriveDataAll();
		int max = Integer.MIN_VALUE;
		
		for(int value:data) {
			
			if(value > max) {
				max=value;
			}
			
		}
		return max;
		
	}

}

interface DataService{
	int[] retriveDataAll();
}
