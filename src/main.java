public class main {
    public static void main(String[] args) {
        Film film1 = new Film("Incepcja", "Christopher Nolan", 2010, 8.9, true, 148);
        Film film2 = new Film("Matrix", "Lana Wachowski", 1999, 8.7);
        Film film3 = new Film("Szeregowiec Ryan", "Steven Spielberg", 1998);
        Film film4 = new Film("Avengers: Endgame", "Anthony Russo", 2019, 9.0, false, 182);

        film2.setDostepnosc(false);
        film3.setOcena(9.5);
        film4.setCzasTrwaniaMinuty(200);

        double ocenaFilmu1 = film1.getOcena();
        System.out.println("Ocena filmu 1: " + ocenaFilmu1);
    }
}
