package bai3;

public class Newspaper extends Document {
    private String releaseDate;

    public Newspaper(){
        releaseDate="";
    }

    public Newspaper(int code, String publisher, String circulation, String releaseDate) {
        super(code, publisher, circulation);
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Input Release Date: ");
        releaseDate=scan.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-20d%-20s%-20s%-20s\n",code,publisher,circulation,releaseDate);
    }
}
