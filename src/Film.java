public class Film {
    private String tytul;
    private String rezyser;
    private int rokProdukcji;
    private double ocena;
    private boolean dostepnosc;
    private int czasTrwaniaMinuty;

    // Konstruktory
    public Film(String tytul, String rezyser, int rokProdukcji, double ocena, boolean dostepnosc, int czasTrwaniaMinuty) {
        this.tytul = tytul;
        this.rezyser = rezyser;
        this.rokProdukcji = rokProdukcji;
        this.ocena = ocena;
        this.dostepnosc = dostepnosc;
        this.czasTrwaniaMinuty = czasTrwaniaMinuty;
    }

    public Film(String tytul, String rezyser, int rokProdukcji, double ocena) {
        this(tytul, rezyser, rokProdukcji, ocena, true, 0);
    }

    public Film(String tytul, String rezyser, int rokProdukcji) {
        this(tytul, rezyser, rokProdukcji, 0.0, true, 0);
    }

    // Metody dostępowe (getter, setter)
    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getRezyser() {
        return rezyser;
    }

    public void setRezyser(String rezyser) {
        this.rezyser = rezyser;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public boolean isDostepnosc() {
        return dostepnosc;
    }

    public void setDostepnosc(boolean dostepnosc) {
        this.dostepnosc = dostepnosc;
    }

    public int getCzasTrwaniaMinuty() {
        return czasTrwaniaMinuty;
    }

    public void setCzasTrwaniaMinuty(int czasTrwaniaMinuty) {
        this.czasTrwaniaMinuty = czasTrwaniaMinuty;
    }
}