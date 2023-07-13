class Metro{

static String MetrostationNames[]={null,null,null,null,null,null,null,null,
null,null};
static int index;

public static boolean isCaptrued(String stationNames ){

boolean isCaptrued=false;
if( stationNames!=null){
MetrostationNames[index]=stationNames;
index++;
isCaptrued=true;

}else{
 System.out.println("The station name is not captrued");
}
return isCaptrued;
}

public static void retrieveMetrostationNames(){
System.out.println("Invoking retrieveMetrostationNames");

for( int stationNames=0; stationNames<MetrostationNames.length; stationNames++){
 String reference=MetrostationNames[stationNames];
 System.out.println("The Metro station name is "+reference);
}

}
public static boolean updateMetrostationNames(String existingMetrostationNames,String updatedMetrostationNames){
	System.out.println("Invoking the update operation");
   boolean isupdated=false;
   for(int i=0;i<MetrostationNames.length;i++){
	   if(MetrostationNames[i].equals (existingMetrostationNames)){
		   MetrostationNames[i]= updatedMetrostationNames;
		   isupdated=true;
	   }
	   
   }
	return isupdated;
}


}