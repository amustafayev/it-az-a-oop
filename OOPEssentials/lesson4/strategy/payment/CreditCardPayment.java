package lesson4.strategy.payment;

import lesson4.strategy.Model.CardDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy{
    List<CardDetails> cartStorage =
            Arrays.asList(new CardDetails("4164785434235647",
                    "06/24",
                    123,1000000),new CardDetails("4164785555535647",
                    "06/24",
                    123,10000) );

    private CardDetails userCard = null;

    @Override
    public void collectPaymentDetails() {
        Scanner in = new Scanner(System.in);
        String pun= in.nextLine();
        String sonIstifadeMuddeti= in.nextLine();
        int cv= in.nextInt();

        for(int i=0;i<cartStorage.size();i++){
                CardDetails cardDetail = cartStorage.get(i);
                if (cardDetail.getPun() == pun &&
                        cardDetail.getSonIstifadeMuddeti()==sonIstifadeMuddeti &&
                        cardDetail.getCv()==cv){
                userCard = cardDetail;
            }

        }

    }

    @Override
    public void processPayment(int transferMoney) {
        if(userCard !=null){
            if(userCard.getBalance()>=transferMoney){
                userCard.setBalance(userCard.getBalance()
                        -transferMoney);


            }else {
                System.out.println("balansda kif..");
            }
        }else {
            System.out.println("card tapilmadi...");
        }

    }
}
