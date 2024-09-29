package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    SavingAccount saver1 = new SavingAccount();
    SavingAccount saver2 = new SavingAccount();
    saver1.setSavingBalance(6000);
    saver2.setSavingBalance(5000);
    saver1.CalculateMounthlyInterest();
    saver2.CalculateMounthlyInterest();
    System.out.println(saver1.getSavingBalance());
    System.out.println(saver2.getSavingBalance());
    saver1.ModifyInterestRate(0.1);
    saver2.ModifyInterestRate(0.1);
    saver1.CalculateMounthlyInterest();
    saver2.CalculateMounthlyInterest();
    System.out.println(saver1.getSavingBalance());
    System.out.println(saver2.getSavingBalance());
    SavingAccount[] savings=new SavingAccount[2];
    savings[0]=saver1;
    savings[1] = saver2;
    Savers Amir = new Savers("Amir","Biron","327596177","hazait","0587031167","Apollo",savings);
    System.out.println(Amir);
    Amir.PrintAccounts();

    Savers[] ApolloSavers = new Savers[1];
    ApolloSavers[0] = Amir;
    Bankers Apollo = new Bankers("Apollo","Biron","0000000","hazait","999999999",ApolloSavers);
    System.out.println(Apollo);
    Apollo.PrintSavers();





    }
}