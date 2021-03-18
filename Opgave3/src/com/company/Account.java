package com.company;

public class Account {
    String name;
    String city;
    String state;
    String country;
    String date;
    String product;
    int price;
    String paymentType;
    String cardNumber;
    String accountCreeated;

    public Account(String name, String city, String state, String country, String date, String product, int price, String paymentType, String cardNumber, String accountCreeated) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.date = date;
        this.product = product;
        this.price = price;
        this.paymentType = paymentType;
        this.cardNumber = cardNumber;
        this.accountCreeated = accountCreeated;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", date='" + date + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", paymentType='" + paymentType + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", accountCreeated='" + accountCreeated + '\'' +
                '}';
    }
}
