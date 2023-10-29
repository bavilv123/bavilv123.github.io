public class Journal extends Document {
    private int issueNumber;
    private int monthIssue;
    public Journal(String ID, String nxb,int number, int issueNumber, int monthIssue){
        super(ID,nxb, number);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    @Override
    public String toString(){
        return "ID: "+this.ID
                + "\nNXB: "+this.nxb
                + "\nNumber: "+this.number
                + "\nIssuerNumber: "+this.issueNumber
                + "\nMonthNumber: "+this.monthIssue;

    }
}
