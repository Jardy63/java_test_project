import java.util.Calendar;

public class Payment {
    private Calendar dateToPay;
    private int paymentAmount;
    private int loanBody;
    private int loanPercent;

    public Payment (Calendar dateToPay, int paymentAmount){
        this.dateToPay = dateToPay;
        this.paymentAmount = paymentAmount;
    }
}
