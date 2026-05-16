package com.ar.opps1.encapsulations;

public class ExampleHome {
    private String Place ;
  private   String Town ;
     private String HouseAdress ;
  private   int HouseMembers ;

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }

    public String getHouseAdress() {
        return HouseAdress;
    }

    public void setHouseAdress(String houseAdress) {
       this.HouseAdress = houseAdress;
    }

    public int getHouseMembers() {
        return HouseMembers;
    }

    public void setHouseMembers(int houseMembers) {
       this.HouseMembers = houseMembers;
    }

    public void PlaceArea() {
        System.out.println("The place area is Kadapa ");
    }
        public void TownArea(){
            System.out.println("Town Of the Area is Proddatur");
        }
    public void AdressofHouse(){
        System.out.println("House adress is OmShanthi Nelayam near cinihub ");
    }

        public void MembersofPeople(){
            System.out.println("Total number of people in house " + HouseMembers );
        }

}
