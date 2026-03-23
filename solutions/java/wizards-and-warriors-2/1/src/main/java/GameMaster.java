public class GameMaster {

    // describe method that returns a description of a Character
    public String describe(Character c) {
        return "You're a level " + c.getLevel() + " " + c.getCharacterClass() + " with " + c.getHitPoints()
                + " hit points.";
    }

    // describe method that returns a description of a Destination
    public String describe(Destination d) {
        return "You've arrived at " + d.getName() + ", which has " + d.getInhabitants() + " inhabitants.";
    }

    // describe method that returns a description of a TravelMethod
    public String describe(TravelMethod t) {
        return "You're traveling to your destination " + (t == TravelMethod.WALKING ? "by walking." : "on horseback.");
    }

    // describe method that returns a description of a Character, Destination and
    // TravelMethod
    public String describe(Character c, Destination d, TravelMethod t) {
        StringBuilder sb = new StringBuilder();
        sb.append(describe(c) + " ");
        sb.append(describe(t) + " ");
        sb.append(describe(d));
        return sb.toString();

    }

    // describe method that returns a description of a Character and Destination
    public String describe(Character c, Destination d) {
        TravelMethod t = TravelMethod.WALKING;
        String description = describe(c, d, t);
        return description;

    }
}
