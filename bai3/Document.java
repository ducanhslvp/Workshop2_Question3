package bai3;

import java.util.Scanner;

public class Document {
    protected Scanner scan=new Scanner(System.in);
    protected int code;
    protected String publisher;
    protected String circulation;

    public Document(){
        code = 0;
        publisher = "";
        circulation = "";
    }

    public Document(int code, String publisher, String circulation) {
        this.code = code;
        this.publisher = publisher;
        this.circulation = circulation;
    }

    public int getCode() {
        return code;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCirculation() {
        return circulation;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCirculation(String circulation) {
        this.circulation = circulation;
    }
    public void input(){
        System.out.println("Input: code");
        code=scan.nextInt();
        System.out.println("Input Publisher: ");
        scan.nextLine();
        publisher=scan.nextLine();
        System.out.println("Input circulation: ");
        circulation=scan.nextLine();
    }
    public void output(){

    }
}
