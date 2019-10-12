package main.java.POJO;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name ="accounts")
public class Accounts
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountID;

    private int custID;
    private String accNo;
    private double current_bal;
    private double min_bal;
    private double trans_limit;

    public Accounts(){}

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getCurrent_bal() {
        return current_bal;
    }

    public void setCurrent_bal(double current_bal) {
        this.current_bal = current_bal;
    }

    public double getMin_bal() {
        return min_bal;
    }

    public void setMin_bal(double min_bal) {
        this.min_bal = min_bal;
    }

    public double getTrans_limit() {
        return trans_limit;
    }

    public void setTrans_limit(double trans_limit) {
        this.trans_limit = trans_limit;
    }

    @Override
    public String toString() {
        return "Accounts {accNo=" + accNo + ", accountID=" + accountID + ", current_bal=" + current_bal + ", custID="
                + custID + ", min_bal=" + min_bal + ", trans_limit=" + trans_limit + "}";
    }

    public Accounts(int custID, String accNo, double current_bal, double min_bal, double trans_limit) {
        this.custID = custID;
        this.accNo = accNo;
        this.current_bal = current_bal;
        this.min_bal = min_bal;
        this.trans_limit = trans_limit;
    }
    
    
    
}