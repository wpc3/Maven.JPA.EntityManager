package entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "artist")

public class Artist {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "instrument")
    private String instrument;

//    @ManyToOne()
//    @JoinTable(name = "id")
//    private CD cd;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "artist_cd", joinColumns =
            @JoinColumn(name = "artist_id"),
            inverseJoinColumns = @JoinColumn(name = "cd_id")

    )
    private Set<CD> cds = new HashSet<>();


    public Artist(int id, String firstName, String lastName, String instrument) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.instrument = instrument;
    }

    public Artist(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

//    public CD getCd() {
//        return cd;
//    }
//
//    public void setCd(CD cd) {
//        this.cd = cd;
//    }


    public Set<CD> getCds() {
        return cds;
    }

    public void setCds(Set<CD> cds) {
        this.cds = cds;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", instrument='" + instrument + '\'' +
                '\n' +'}';
    }
}
