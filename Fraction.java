public class Fraction {
    static int numberOfFractions;
    private int numerator, denominator;

    //erzeugt die Fraktion (konstruktor)
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;                  // this. ersezt ein Objekt wie zum beispiel f. das ist dazu da um verschiedene objekten die gleiche Funktion zu geben bzw die gleiche anwendung.
        this.setDenominator(denominator);
        numberOfFractions ++;
    }

    //kopiert eien Fraktion (konstruktor)
    public Fraction(Fraction f) {               // nicht das gleiche f wie bei der Objekt f. es benötigt einfach ein Objekt aus der Klasse Fraktion
        this(f.numerator, f.denominator);
    }
    //wenn leere Fraktion (konstruktor)
    public Fraction() {                             // wenn man eine Funktion Fraction() ohne inhalt ausführt ruft es mit "this" die Funktion mit dem gleichen Namen auf aber mit inhalt 0,1 so das es kein error gibt.
        this(0, 1);       
    }

    @Override
    public String toString() {
        return  numerator +"/" + denominator ;
    }

    public int getDenominator() {               // mit dieser funkton kann man uf den denuminator zugreifen in anderen klassen obwohl er auf privat gestellt ist.
        return denominator;
    }

    public void setDenominator(int denominator) {                   // mit dieser funktion kann man den denuminator verändern in adneren klassen auch wenn er auf privat gestellt ist
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        } else {
            this.denominator = denominator;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void add(Fraction f) {       // speichert die adition in dem angewendeten objekt (bsp: g.add(h); wird in g gespeichert)
        this.setNumerator(this.numerator * f.denominator + this.denominator * f.numerator); 
        this.setDenominator(this.denominator * f.denominator);
    }

    public static Fraction add(Fraction f, Fraction g) {               // rechnet die zwei fraktionen zusammen (nenner wird zuerst gleich gemacht). g und f sind nur platzhalter sind nicht die Objekte 
        return new Fraction(f.numerator * g.denominator + f.denominator * g.numerator, f.denominator * g.denominator); // gibt ein neuers Objekt zurück
    }
    
    public boolean equals(Fraction f) {                                             // prüft auf inhalts gleichheit 
        return this.numerator * f.denominator == this.denominator * f.numerator;
    }


    
}
