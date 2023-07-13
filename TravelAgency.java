class TravelAgency{

static String touristPlaces[]={null,null,null,null,null,null,null,null,null,null};
static int index;



public static boolean isInserted(String Place){

boolean isInserted=false;
if( Place!=null){
touristPlaces[index]=Place;
index++;
isInserted=true;

}else{
 System.out.println("The touristPlace name is not Inserted");
}
return isInserted;
}

public static void retrievetouristPlaces(){
System.out.println("Invoking retrievetouristPlaces");

for( int Place=0; Place<touristPlaces.length; Place++){
 String reference=touristPlaces[Place];
 System.out.println("The touristPlace name is "+reference);
}

}

public static boolean updatetouristPlaces(String existingtouristPlaces,String updatedtouristPlaces){
	System.out.println("Invoking the updating operation");
	boolean isupdated=false;
	for(int i=0;i<touristPlaces.length;i++){
		if(touristPlaces[i]. equals(existingtouristPlaces)){
			touristPlaces[i]=updatedtouristPlaces;
			isupdated=true;
		}
		
	}
	return isupdated;
	
	
	
}
}