package org.example;

import java.util.Arrays;

public class Savers {

    private String FirstName;
    private String FamilyName;
    private String Id;
    private String Adress;
    private String PhoneNumber;
    private String BankerName;
    private SavingAccount[] savingAccounts;

    public Savers(String firstName, String familyName, String id, String adress, String phoneNumber, String bankerName, SavingAccount[] savingAccounts) {
        this.FirstName = firstName;
        this.FamilyName = familyName;
        this.Id = id;
        this.Adress = adress;
        this.PhoneNumber = phoneNumber;
        this.BankerName = bankerName;
        this.savingAccounts = savingAccounts;
    }

    @Override
    public String toString() {
        double balance=0;
        for (int i = 0; i < savingAccounts.length; i++) {
            balance+=this.savingAccounts[i].getSavingBalance();
        }
        return "Savers{" +
                "FirstName='" + FirstName + '\'' +
                ", FamilyName='" + FamilyName + '\'' +
                ", Id='" + Id + '\'' +
                ", Adress='" + Adress + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", BankerName='" + BankerName + '\'' +
                ",number of accounts =" + this.savingAccounts.length +
                ", balance =" + balance +
                '}';


    }
    public void PrintAccounts(){
        System.out.println(Arrays.toString(savingAccounts));
    }
}
