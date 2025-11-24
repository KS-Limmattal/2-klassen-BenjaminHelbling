public class FractionTester {
    public static void main(String[] args) {
        Fraction f = new Fraction(3,5);
        Fraction g = new Fraction(f);
        Fraction h = new Fraction(f);
        // Der folgende Code funktioniert nur, wenn die Felder von Fraction nicht privat sind:
        f.setNumerator(6);
        f.setDenominator(10);
        //System.out.println(f.getNumerator() + "/" + f.getDenominator());
        // wird nicht mehr gebraucht weil man toSTring() hat.
        boolean x = h.equals(f);
        System.out.println(x);
        // toString():
        System.out.println(f.toString());
        // Encapsulation, Getter und Setter:
        //f.setDenominator(3);
        
        System.out.println(h.toString());
        // Copy-Konstruktor und equals():
        
        // Klassen- und Instanzenmethoden:

        // statische Variablen:

    }

}
