class TravelAgencyTester{
public static void main(String Place[]){

 TravelAgency.isInserted("Hampi");
 TravelAgency.isInserted("Lalbagh");
 TravelAgency.isInserted("Nandhi hills");
 TravelAgency.isInserted("Jog falls");
 TravelAgency.isInserted("Gokarna");
 TravelAgency.isInserted("Iskcon temple");
 TravelAgency.isInserted("Mysuru");
 TravelAgency.isInserted("Murdeshwar");
 TravelAgency.isInserted("Kodagu");
 TravelAgency.isInserted("Kudremukh");

TravelAgency.retrievetouristPlaces();

TravelAgency.updatetouristPlaces("Kodagu","chitraDurga");
TravelAgency.retrievetouristPlaces();



}
}