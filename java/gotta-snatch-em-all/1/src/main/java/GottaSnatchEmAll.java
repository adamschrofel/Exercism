import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> newCollection = new HashSet<>();
        for (String card : cards) {
            newCollection.add(card);
        }
        return newCollection;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> myExtras = new HashSet<>(myCollection);
        Set<String> theirExtras = new HashSet<>(theirCollection);
        myExtras.removeAll(theirCollection);
        theirExtras.removeAll(myCollection);

        return !myExtras.isEmpty() && !theirExtras.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commons = new HashSet<>(collections.get(0));

        for (int i = 1; i < collections.size(); i++) {
            Set<String> temp = collections.get(i);
            commons.retainAll(temp);
        }
        return commons;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>();

        for (Set<String> collection : collections) {
            allCards.addAll(collection);
        }
        return allCards;
    }
}
