import java.util.ArrayList;

public class SystemRezerwacji {
        private ArrayList<Wydarzenie.Wydarzenie> wydarzenia = new ArrayList<>();
        private ArrayList<Wydarzenie.Klient> klienci = new ArrayList<>();
        public void dodajWydarzenie(Wydarzenie.Wydarzenie w) {
            wydarzenia.add(w);
        }
        public void dodajKlienta(Wydarzenie.Klient k) {
            klienci.add(k);
        }
        public void dokonajRezerwacji(Wydarzenie.Klient k, Wydarzenie.Wydarzenie w) {
            k.dodajRezerwacje(w);
        }
        public void anulujRezerwacje(Wydarzenie.Klient k, Wydarzenie.Wydarzenie w) {
            k.anulujRezerwacje(w);
        }
        public void wyswietlRezerwacjeKlienta(Wydarzenie.Klient k) {
            k.wyswietlRezerwacje();
        }
        public Wydarzenie.Wydarzenie znajdzWydarzenie(String nazwa) {
            for (Wydarzenie.Wydarzenie w : wydarzenia) {
                if (w.getNazwa().equals(nazwa)) return w;
            }
            return null;
        }
        public void zmodyfikujCene(Wydarzenie.Wydarzenie w, double nowaCena) {
            if (wydarzenia.contains(w)) {
                wydarzenia.get(wydarzenia.indexOf(w)).cena = nowaCena;
            }
        }

}
