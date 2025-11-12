public class FractionTester {
    public static void main(String[] args) {
        Fraction f = new Fraction();
        // Der folgende Code funktioniert nur, wenn die Felder von Fraction nicht privat sind:
        f.setNumerator(12);
        f.setDenominator(1);
        //System.out.println(f.getNumerator() + "/" + f.getDenominator());
        // wird nicht mehr gebraucht weil man toSTring() hat.
        
        // toString():
        System.out.println(f.toString());
        // Encapsulation, Getter und Setter:
        f.setDenominator(3);
        System.out.println(f.toString());
        // Copy-Konstruktor und equals():
        
        // Klassen- und Instanzenmethoden:

        // statische Variablen:

    }

}
