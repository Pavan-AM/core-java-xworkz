class Garden{

static String flowerNames[]={null,null,null,null,null,null,null,null};
static int index;

public static boolean isPreserved(String flower){

boolean isPreserved=false;
if( flower!=null){
flowerNames[index]=flower;
index++;
isPreserved=true;

}else{
 System.out.println("The flower name is not presereved");
}
return isPreserved;
}

public static void retrieveflowerNames(){
System.out.println("Invoking retrieveflowerNames");

for( int flower=0; flower<flowerNames.length; flower++){
 String reference=flowerNames[flower];
 System.out.println("The flower name is "+reference);
}

}
public static boolean updateflowerNames(String existingflowerNames,String updatedflowerNames){
	System.out.println("Invoking the updateing operation");
	boolean isupdated=false;
	for(int flowerIndex=0;flowerIndex<flowerNames.length;flowerIndex++){
		if(flowerNames[flowerIndex].equals(existingflowerNames)){
			flowerNames[flowerIndex]=updatedflowerNames;
		isupdated=true;
		}
	}
	return isupdated;
	
	}
}