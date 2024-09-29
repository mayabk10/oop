package org.example;

import java.util.Arrays;

public class Bankers {

    private String FirstName;
    private String FamilyName;
    private String Id;
    private String Adress;
    private String PhoneNumber;
    private Savers [] SaversList;

    public Bankers(String firstName, String familyName, String id, String adress, String phoneNumber, Savers[] saversList) {
        this.FirstName = firstName;
        this.FamilyName = familyName;
        this.Id = id;
        this.Adress = adress;
        this.PhoneNumber = phoneNumber;
        this.SaversList = saversList;
    }

    @Override
    public String toString() {
        return "Bankers{" +
                "FirstName='" + FirstName + '\'' +
                ", FamilyName='" + FamilyName + '\'' +
                ", Id='" + Id + '\'' +
                ", Adress='" + Adress + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", SaversNumbers=" + SaversList.length +
                '}';
    }
    public void PrintSavers(){
        System.out.println(Arrays.toString(SaversList));
    }
}
