package lesson4.strategy;

import lesson4.strategy.payment.PaymentStrategy;

import java.util.Scanner;

public class WebsitePayPage {

    public void pay(int transferMoney, PaymentStrategy paymentStrategy){
//
//        String userChoice = in.nextLine();
//
//        if (userChoice == "PAY_PAL"){
////            login();
////            feeCalculate()
////            moneyTransfer()
//        }
//        else if (userChoice == "CREDIT_CARD"){
//            //credit card
//            //swq
//        }else if (userChoice == "CRYPTO"){
//            //blockchain payment logic
//        }
        paymentStrategy.collectPaymentDetails();
        paymentStrategy.processPayment(transferMoney);

    }

}
