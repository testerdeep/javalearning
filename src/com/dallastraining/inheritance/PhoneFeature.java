package com.dallastraining.inheritance;

public class PhoneFeature {
	
	void feature(Mobiles mobile){
		
		mobile.call();
		mobile.sms();
	}
	
	void feature(SmartPhone phone){
		
		phone.call();
		phone.sms();
		phone.callhistory();
		phone.games();
		phone.internetaccess();
		
	}

}
