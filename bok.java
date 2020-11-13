public class bok {
String titel;
String text;
String datum;


    public bok(String titel, String text, String datum){
        this.titel = titel;
        this.text = text;
        this.datum = datum;
    }
    @Override
    public String toString() {
       return this.titel + "\n" + this.text + "\n" + this.datum; 
    }
}
