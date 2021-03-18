package com.company;

public class Main {
    static Account[] myAccounts = new Account[3];
    public static void main(String[] args) {

        Account Janet = new Account("Janet", "Ottowa", "Ontario", "Canada", "1/5/09 11:37", "Product1",1200,"Visa","4234120954489197", "1/5/09 19:24");
        Account James = new Account("James", "Burpengary", "Queensland", "Australia", "1/5/09 20:00", "Product2",3600,"Visa","4904344348439820", "12/10/08 19:53");
        Account MehmetFatih = new Account("Mehmet Fatih", "Helsingor", "Frederiksborg", "Denmark", "1/3/09 13:24", "Product1",1200,"Visa","4737470823565213", "1/9/09 11:14");

        myAccounts[0] = Janet;
        myAccounts[1] = James;
        myAccounts[2] = MehmetFatih;
        System.out.println("Accounts: ");
        System.out.println(Janet);
        System.out.println(James);
        System.out.println(MehmetFatih);
        System.out.println("Who has a valid credit card: ");
        setCreditCard(Janet.cardNumber, Janet.name);
        setCreditCard(James.cardNumber, James.name);
        setCreditCard(MehmetFatih.cardNumber, MehmetFatih.name);
    }

    public static boolean setCreditCard(String ccNumber, String name){
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() - 1; i >= 0; i--){
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (alternate){
                n *= 2;
                if (n > 9){
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        if(sum % 10 != 0){
            System.out.println(name + "´s credit card is invalid");
        }else{
            System.out.println(name + "´s credit card is valid");
        }
        return (sum % 10 == 0);
    }
}
