package lesson4.strategy;

import lesson4.strategy.payment.PayPalPayment;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {


        PayPalPayment payPalPayment = new PayPalPayment();

        WebsitePayPage websitePayPage = new WebsitePayPage();

        websitePayPage.pay(34, payPalPayment);


    }


}
