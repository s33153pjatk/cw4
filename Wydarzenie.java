public class Wydarzenie {
    private String nazwa, data, miejsce;
    private int maksLiczbaMiejsc = 100, dostepnoscMiejsc = 0;
    private double cena;
    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena);
        this.data = data;
    }
    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this(nazwa, cena, data);
        this.miejsce = miejsce;
    }
    public String getNazwa() { return nazwa; }
    public String getData() { return data; }
    public String getMiejsce() { return miejsce; }
    public int getDostepnoscMiejsc() { return dostepnoscMiejsc; }
    public double getCena() { return cena; }
    public void wyswietlInfo() {
        System.out.println("Wydarzenie: " + nazwa + ", Cena: " + cena + ", Data: " + data);
    }
    public void zarezerwujMiejsce() {
        if (dostepnoscMiejsc < maksLiczbaMiejsc) dostepnoscMiejsc++;
    }
    public void anulujMiejsce() {
        if (dostepnoscMiejsc > 0) dostepnoscMiejsc--;
    }

}

