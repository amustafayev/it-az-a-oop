package lesson4.strategy.Model;

public class CardDetails {
    private String pun;
    private  String sonIstifadeMuddeti;
    private int cv;
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public CardDetails(String pun, String sonIstifadeMuddeti, int cv, int balance) {
        this.pun = pun;
        this.sonIstifadeMuddeti = sonIstifadeMuddeti;
        this.cv = cv;
        this.balance = balance;
    }

    public String getSonIstifadeMuddeti() {
        return sonIstifadeMuddeti;
    }

    public int getCv() {
        return cv;
    }

    public int getBalance() {
        return balance;
    }

    public String getPun() {
        return pun;
    }
}
