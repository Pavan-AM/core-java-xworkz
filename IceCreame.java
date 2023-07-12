class IceCreame{

static String IceCreameflavors[]={null,null,null,null,null,null,null,null,
null,null};
static int index;



public static boolean isInserted(String flavor){

boolean isInserted=false;
if( flavor!=null){
IceCreameflavors[index]=flavor;
index++;
isInserted=true;

}else{
 System.out.println("The flavor name is not Inserted");
}
return isInserted;
}

public static void retrieveIceCreameflavors(){
System.out.println("Invoking retrieveIceCreameflavors");

for( int flavor=0; flavor<IceCreameflavors.length; flavor++){
 String reference=IceCreameflavors[flavor];
 System.out.println(reference);
}

}
public static boolean updateIceCreameflavors(String existingIceCreameflavors,String updatedIceCreameflavors){
	System.out.println("Invoking of updating operation");
	boolean isupdated=false;
   for(int flavorIndex=0;flavorIndex<IceCreameflavors.length;flavorIndex++){
	if(IceCreameflavors[flavorIndex].equals(existingIceCreameflavors)){
		IceCreameflavors[flavorIndex]=updatedIceCreameflavors;
		isupdated=true;
	}
}
return isupdated;
	
}
public static int deleteIceCreameflavors(String existingIceCreameflavors){
	System.out.println("Invoking of deleting operation");
	boolean isdeleted=false;
	int flavorIndex;
	int noOfElement=IceCreameflavors.length;
	
	for(flavorIndex=0; flavorIndex<IceCreameflavors.length;flavorIndex++){
		if(IceCreameflavors[flavorIndex].equals(existingIceCreameflavors)){
			break;
			
		}
		
	}
	 if(flavorIndex<noOfElement){
	 noOfElement=noOfElement-1;
	 for(int newflavorIndex=flavorIndex;newflavorIndex<noOfElement;newflavorIndex++){
		 
		IceCreameflavors[newflavorIndex]= IceCreameflavors[newflavorIndex+1];
	 }
	 }
	return noOfElement;
	
}
public static void getAllIceCreameflavorsPostdeleted(int newLength){
	for(int flavorIndex=0; flavorIndex<newLength;flavorIndex++){
		System.out.println(IceCreameflavors[flavorIndex]);
		
		
	}
	
}

	
	
}
