
package domain.map_items;

import domain.MapPosition;
import java.util.ArrayList;

public class Breaker extends MapItem {
    private ArrayList<MapItem> items;

    // No-argument constructor
    public Breaker() {
        super(new MapPosition(0, 0, true));
        this.items = new ArrayList<>();
        // Adding Frog and Mushroom objects to the items list
        this.items.add(new Frog());
        this.items.add(new Mushroom());
    }

    // Full-argument constructor
    public Breaker(MapPosition position, ArrayList<MapItem> items) {
        super(position);
        setItems(items);
    }

    // Copy constructor
    public Breaker(Breaker other) {
        super(new MapPosition(other.getPosition()));
        this.setItems(other.getItems());

    }
    
    //overriding the interaction method for breaker arraylist
    public void interactionOfBreaker(Player player) {
        for (MapItem item : items) {
            item.interaction(player);
        }
    }

    // Getters and Setters
    public ArrayList<MapItem> getItems() {
        ArrayList<MapItem> deepCopy = new ArrayList<>();
        for (MapItem item : this.items) {
            deepCopy.add(item.clone());
        }
        return deepCopy;
    }

    public void setItems(ArrayList<MapItem> items) {
        this.items = new ArrayList<>(items);
    }

    // toString method
    @Override
    public String toString() {
        return "Breaker{" +
                "position=" + getPosition() +
                ", items=" + items +
                '}';
    }

    // equals method
    public boolean equals(Breaker other) {
        if (other == null) return false;

        if (!this.getPosition().equals(other.getPosition())) {
            return false;
        }

        if (this.items.size() != other.items.size()) {
            return false;
        }

        for (int i = 0; i < this.items.size(); i++) {
            if (!this.items.get(i).equals(other.items.get(i))) {
                return false;
            }
        }
        return true;
    }
}
