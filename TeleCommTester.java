class TeleCommTester{
public static void main(String sim[]){
	
	TeleComm.isStored("Airtel");
	TeleComm.isStored("Jio");
	TeleComm.isStored("BSNL");
	TeleComm.isStored("Idea");
	TeleComm.isStored("VI");
	TeleComm.isStored("MTS");
	TeleComm.isStored("Vodafone");
	
	TeleComm.getsimNames();
	
	TeleComm.updatesimNames("BSNL","Idea");
		TeleComm.getsimNames();


	
	
	
	
	
}





}