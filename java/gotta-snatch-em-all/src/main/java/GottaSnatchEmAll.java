import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
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
        if (collections.isEmpty()) {
            return new HashSet<>();
        }
        Set<String> commons = new HashSet<>(collections.get(0));

        for (int i = 1; i < collections.size(); i++) {
            commons.retainAll(collections.get(i));
        }
        return commons;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();

        for (Set<String> collection : collections) {
            all.addAll(collection);
        }
        return all;
    }
}
