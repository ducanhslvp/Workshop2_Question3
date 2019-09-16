package bai3;

public class Magazine extends Document {
    private String issueNumber;
    private String monthly;

    public Magazine(){
        issueNumber = "";
        monthly = "";
    }

    public Magazine(int code, String publisher, String circulation, String issueNumber, String monthly) {
        super(code, publisher, circulation);
        this.issueNumber = issueNumber;
        this.monthly = monthly;
    }
    public void Magazine(){
        issueNumber="";
        monthly="";
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public String getMonthly() {
        return monthly;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void setMonthly(String monthly) {
        this.monthly = monthly;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Input IssueNumber: ");
        issueNumber=scan.nextLine();
        System.out.println("Input Monthly:  ");
        monthly=scan.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-20d%-20s%-20s%-20s%-20s\n",code,publisher,circulation,issueNumber,monthly);
    }
}
