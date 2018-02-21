package com.hibernate.demo;

public class DebitCart extends Payment  {
	
	 private int pinNumber;
     private String cardName;
     public int getPinNumber() {
         return pinNumber;
     }
     public void setPinNumber(int pinNumber) {
         this.pinNumber = pinNumber;
     }
     public String getCardName() {
         return cardName;
     }
     public void setCardName(String cardName) {
         this.cardName = cardName;
     }
}
