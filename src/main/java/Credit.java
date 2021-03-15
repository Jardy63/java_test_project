public class Credit {
    private long creditLimit;
    private float interestRate;

    public Credit(){

    }

    public float getInterestRate() {
        return interestRate;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
}
