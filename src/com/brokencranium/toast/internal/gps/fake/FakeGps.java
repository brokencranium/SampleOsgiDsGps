package com.brokencranium.toast.internal.gps.fake;

import com.brokencranium.toast.gps.IGps;

public class FakeGps implements IGps {
	public FakeGps(){}
	
	 @Override
	public int getHeading(){
	        return 90;
	    }

	    @Override
		public int getLatitude(){
	        return 3776999;
	    }

	    @Override
		public int getLongitude(){
	        return -12244694;
	    }

	    @Override
		public int getSpeed(){
	        return 50;
	    }

}
