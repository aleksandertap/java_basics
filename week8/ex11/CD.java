package week8.ex11;

public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;
    private double weight = 0.1;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    public double weight() {
        return this.weight;
    }

    public String toString(){
        return artist + ": " + title + " ( " +  publishingYear + " )";
    }
}
