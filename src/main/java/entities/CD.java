package entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cd")

public class CD {
    @Id

    @Column(name = "id")
    private  int id;

    @Column(name = "title")
    private String title;

    @Column(name = "genre")
    private  String genre;

    @Column(name = "year")
    private  int year;

    @Column(name = "price")
    private  int price;


    @OneToMany(mappedBy = "id", fetch = FetchType.EAGER)
    private Set<Artist> artists = new HashSet<>();

    public CD(int id, String title, String genre, int year, int price) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    public CD() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Set<Artist> getArtists(){

        return artists;
    }

    public void setArtists(Set<Artist> artists){
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "CD{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", artists=" + artists +
               '\n' + '}';
    }
}
