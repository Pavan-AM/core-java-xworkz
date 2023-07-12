class IceCreameTester{
public static void main(String flavor[]){

 IceCreame.isInserted("Vanilla");
 IceCreame.isInserted("Chocolate");
 IceCreame.isInserted("Strawberry");
 IceCreame.isInserted("Coffee");
 IceCreame.isInserted("Rocky road");
 IceCreame.isInserted("Butter pecan");
 IceCreame.isInserted("Black cherry");
 IceCreame.isInserted("Oreo");
 IceCreame.isInserted("Lemon sorbet");
 IceCreame.isInserted("Caramel");



IceCreame.updateIceCreameflavors("Coffee","Kulfi");
IceCreame.retrieveIceCreameflavors();


int newLength=IceCreame.deleteIceCreameflavors("Oreo");

System.out.println("getAllIceCreameflavorsPostdeleted");
IceCreame.getAllIceCreameflavorsPostdeleted(newLength);

 int newLength1=IceCreame.deleteIceCreameflavors("Caramel");
 System.out.println("getAllIceCreameflavorsPostdeleted");
IceCreame.getAllIceCreameflavorsPostdeleted1(newLength1);



}
}