import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fumetteria {

    static List<String> vendiCarte(int euro){
        ArrayList<String> cardsToSell = new ArrayList<String>();
        for (int i = 0; i < euro; i++) {
            cardsToSell.add(generateRandomCards(5));
        }
        return cardsToSell;
    }

    public static String generateRandomCards(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            randomString.append(randomChar);
        }
        return randomString.toString();
    }
}
