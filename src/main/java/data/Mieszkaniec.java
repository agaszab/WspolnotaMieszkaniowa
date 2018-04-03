package data;

import javax.persistence.*;

@Entity
public class Mieszkaniec {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mieszkanca;

    private String imie;
    private String nazwisko;

    @ManyToOne
    private Mieszkanie mieszkanie;

    @Enumerated(EnumType.STRING)
    private Plec plec;

    public Mieszkaniec(String imie, String nazwisko, Mieszkanie mieszkanie, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.mieszkanie = mieszkanie;
        this.plec = plec;
    }

    public Mieszkaniec() {
    }

    public Long getId_mieszkanca() {
        return id_mieszkanca;
    }

    public void setId_mieszkanca(Long id_mieszkanca) {
        this.id_mieszkanca = id_mieszkanca;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Mieszkanie getMieszkanie() {
        return mieszkanie;
    }

    public void setMieszkanie(Mieszkanie mieszkanie) {
        this.mieszkanie = mieszkanie;
    }

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Mieszkaniec{" +
                "id_mieszkanca=" + id_mieszkanca +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", mieszkanie=" + mieszkanie +
                ", plec=" + plec +
                '}';
    }
}
