package org.example;

public class SavingAccount {

        private double SavingBalance;
        public static double AnnualInterestRate;
    public SavingAccount(){
        AnnualInterestRate=0.06;
    }
    public void setSavingBalance(double savingBalance) {
        SavingBalance = savingBalance;
    }

    public double getSavingBalance() {
        return SavingBalance;
    }

    public void CalculateMounthlyInterest(){
        this.SavingBalance += this.SavingBalance*AnnualInterestRate/12;
    }

    public void ModifyInterestRate(double newIntrestRate){
        AnnualInterestRate = newIntrestRate;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "SavingBalance=" + SavingBalance +
                '}';
    }
}
