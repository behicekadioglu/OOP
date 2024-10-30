
package domain.map_items;

import domain.MapPosition;
import java.util.ArrayList;

public class Booster extends MapItem {
    private ArrayList<MapItem> items;

    // No-argument constructor
    public Booster() {
        super(new MapPosition(0, 0, false));
        this.items = new ArrayList<>();
        this.items.add(new Diamond());
        this.items.add(new Coin());
        this.items.add(new Treasure());
    }

    // Full-argument constructor
    public Booster(MapPosition position, ArrayList<MapItem> items) {
        super(position);
        this.setItems(items);
    }

    // Copy constructor
    public Booster(Booster other) {
        super(new MapPosition(other.getPosition()));
        this.setItems(other.getItems());
    }
    
    //overriding the interaction method for booster arraylist
    public void interactionOfBooster(Player player) {
        for (MapItem item : items) {
            item.interaction(player);
        }
    }

    // Getters and Setters
    public ArrayList<MapItem> getItems() {
        // DEEP COPY YAPILMALI
        return items;
    }

    public void setItems(ArrayList<MapItem> items) {
        this.items = new ArrayList<>(items);
    }

    // toString method
    @Override
    public String toString() {
        return "Booster{" +
                "position=" + getPosition() +
                ", items=" + items +
                '}';
    }

    // equals method
    public boolean equals(Booster other) {
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

