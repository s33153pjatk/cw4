import java.util.*;
class Main {
    public class Main {
        public static void main(String[] args) {
            SystemRezerwacji system = new SystemRezerwacji();
            Wydarzenie koncert = new Wydarzenie("Koncert Symphony", 120.0);
            Wydarzenie teatr = new Wydarzenie("Hamlet", 85.0);
            system.dodajWydarzenie(koncert);
            system.dodajWydarzenie(teatr);
            Klient klient1 = new Klient("Jan", "Kowalski", "jan@example.com");
            Klient klient2 = new Klient("Anna", "Nowak", "anna@example.com");
            system.dodajKlienta(klient1);
            system.dodajKlienta(klient2);
            system.dokonajRezerwacji(klient1, koncert);
            system.dokonajRezerwacji(klient2, koncert);
            system.wyswietlRezerwacjeKlienta(klient1);
            Wydarzenie znalezione = system.znajdzWydarzenie("Koncert Symphony");
            System.out.println("Znalezione: " + znalezione.getNazwa());
            system.zmodyfikujCene(koncert, 150.0);
            System.out.println("Nowa cena koncertu: " + koncert.getCena());
            system.anulujRezerwacje(klient2, koncert);
            System.out.println("Miejsca dostępne: " + koncert.getDostepnoscMiejsc());
        }
    }
}

