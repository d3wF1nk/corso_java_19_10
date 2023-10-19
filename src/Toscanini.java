public class Toscanini {
    public static void furtoCarte(Deck maranza, Deck civile) {
        if (retata == false){
            maranza.cards.addAll(civile.cards);
            civile.cards.clear();
        }else{
            System.out.println("impossibile rubare carte durante una retata");
        }
    }

    public static boolean retata = false;
}
