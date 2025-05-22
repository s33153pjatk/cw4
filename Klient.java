import java.util.ArrayList;

public class Klient {
        private String imie, nazwisko, email;
        private ArrayList<Wydarzenie.Wydarzenie> listaRezerwacji = new ArrayList<>();
        public Klient(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }
        public Klient(String imie, String nazwisko, String email) {
            this(imie, nazwisko);
            this.email = email;
        }
        public String getImie() { return imie; }
        public String getEmail() { return email; }
        public void dodajRezerwacje(Wydarzenie.Wydarzenie w) {
            listaRezerwacji.add(w);
            w.zarezerwujMiejsce();
        }
        public void wyswietlRezerwacje() {
            for (Wydarzenie.Wydarzenie w : listaRezerwacji) {
                w.wyswietlInfo();
            }
        }
        public void anulujRezerwacje(Wydarzenie.Wydarzenie w) {
            if (listaRezerwacji.remove(w)) {
                w.anulujMiejsce();
            }
        }
        public boolean zawieraRezerwacje(Wydarzenie.Wydarzenie w) {
            return listaRezerwacji.contains(w);
        }
    }
