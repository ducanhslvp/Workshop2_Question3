package bai3;

import java.util.Scanner;

public class Book extends Document{
    Scanner scan=new Scanner(System.in);
    private String author;
    private String title;
    private int numberpage;

    public Book(){
        author="";
        title="";
        numberpage=0;
    }
    public Book(int code, String publisher, String circulation, String author, String title, int numberpage) {
        super(code, publisher, circulation);
        this.author = author;
        this.title = title;
        this.numberpage = numberpage;
    }
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberpage() {
        return numberpage;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberpage(int numberpage) {
        this.numberpage = numberpage;
    }

    @Override
    public void input() {
        super.input();

        System.out.println("Input Author: ");
        author=scan.nextLine();
        System.out.println("Input Title: ");
        title=scan.nextLine();
        System.out.println("Input Number Page: ");
        numberpage=scan.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-20d%-20s%-20s%-20s%-20s%-20d\n",code,publisher,circulation,author,title,numberpage);
    }

}
