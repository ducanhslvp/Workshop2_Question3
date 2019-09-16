package bai3;

import java.io.*;
import java.util.*;

public class Menu {

    Scanner scan=new Scanner(System.in);

    List<Document> list=new ArrayList<Document>();
    ArrayList<Book> listbook=new ArrayList<Book>();
    ArrayList<Magazine> listMagazine =new ArrayList<Magazine>();
    ArrayList<Newspaper> listNewspaper = new ArrayList<Newspaper>();

    public void input(){
        int choice;
        do {

            System.out.println("\n1. Input Book : ");
            System.out.println("2. Input Magazine: ");
            System.out.println("3. Input Newspaper : ");
            System.out.println("0. Exit : ");
            choice=scan.nextInt();
            switch (choice){
                case 1:
                    Book book=new Book();
                    book.input();
                    listbook.add(book);
                    list.add(book);
                    break;
                case 2:
                    Magazine magazine=new Magazine();
                    magazine.input();
                    listMagazine.add(magazine);
                    list.add(magazine);
                    break;
                case 3:
                    Newspaper newspaper=new Newspaper();
                    newspaper.input();
                    listNewspaper.add(newspaper);
                    list.add(newspaper);
            }
        } while (choice!=0);
    }
    public void output(){
        if (!listbook.isEmpty()){
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","Code","Publisher","Circulation","Auther","Title","NumberPage");
            for (Book book :listbook){
                book.output();
            }
        } else System.out.println("No any Book: ");

        if(!listMagazine.isEmpty()){
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","Code","Publisher","Circulation","IssueNumber","Monthly");
            for (Magazine magazine: listMagazine)
                magazine.output();
        } else System.out.println("No any Magazine: ");

        if (!listNewspaper.isEmpty()){
            System.out.printf("%-20s%-20s%-20s%-20s\n","Code","Publisher","Circulation","ReleaseDate");
        } else System.out.println("No any Newspaper: ");
    }
    public void update(){
        int choice;
        int find;
        do {

            System.out.println("\n1. Remove : ");
            System.out.println("2. Update: ");
            System.out.println("0. Exit : ");
            choice=scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter you Remove: ");
                    find=scan.nextInt();
                    for (Document document: list) {
                        if (document.getCode()==find)
                            list.remove(document);
                    }
                    for (Book book: listbook) {
                        if (book.getCode()==find)
                            listbook.remove(book);
                    }
                    break;
                case 2:
                    System.out.println("Enter you Update: ");
                    find=scan.nextInt();
                    for (int i = 0; i < listbook.size(); i ++){
                        if (listbook.get(i).getCode() == find){
                            listbook.get(i).setCode(234);
                            listbook.get(i).setPublisher("ok");
                            listbook.get(i).setAuthor("ok");
                        }
                    }
                    System.out.println("list book: ");
                    for (Book book : listbook) {
                        book.output();
                    }

            }
        } while (choice!=0);
    }
    public void search(){
        int find;
        System.out.println("Enter you code: ");
        find=scan.nextInt();
        for (Document document: list)
            if (document.getCode()==find) {
                document.output();
                break;
            }
    }
    public void sort(){
        Collections.sort(list, new Comparator<Document>() {
            @Override
            public int compare(Document o1, Document o2) {
                return o1.getCode() - o2.getCode();
            }
        });
        for (Document document: list)
            document.output();
    }
    public void write() throws IOException{
        FileWriter fileWriter=new FileWriter("D:\\HOC TAP\\JAVA   JAVA\\Mon lap trinh huong doi tuong\\Excercise 2\\src\\bai3\\file.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

        for (Book book: listbook){
            bufferedWriter.write(book.getCode() + " " + book.getAuthor() + " " + book.getTitle());
        }
        bufferedWriter.close();
    }
    public void read() throws IOException {
        File file=new File("D:\\HOC TAP\\JAVA   JAVA\\Mon lap trinh huong doi tuong\\Excercise 2\\src\\bai3\\file.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        String line=bufferedReader.readLine();
        while (line!=null){
            System.out.println(line);
            line=bufferedReader.readLine();
        }
        fileReader.close();
        bufferedReader.close();
    }
}
