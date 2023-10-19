// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //cosa cazzo servono gli ogetti d'istanza anziche oggetti statici?

        //il mio deck è un oggetto dinamico eccolo qui
        Deck mioDeck = new Deck();
        System.out.println(mioDeck.cards.size());

        mioDeck.cards.addAll(Fumetteria.vendiCarte(5));
        System.out.println(mioDeck.cards.size());

        //arriva montanari con il suo deck
        Deck deckTanari = new Deck();

        Toscanini.furtoCarte(deckTanari, mioDeck);
        Toscanini toscanini1 = new Toscanini();

        System.out.println("il deck di Tanari ora contiene:"+deckTanari.cards.size());
        System.out.println("il mio deck ora contiene:"+mioDeck.cards.size());

        Polizia.invalidazioneCartaRubata(deckTanari);

        System.out.println(deckTanari.cards.size());

        Toscanini toscanini2 = new Toscanini();
        System.out.println("c'è una retata da stringi");
        toscanini2.retata = true;

        System.out.println("stato retata a toscanini 1 :" +toscanini1.retata);
        System.out.println("stato retata a toscanini 2 :" +toscanini2.retata);







    }
}