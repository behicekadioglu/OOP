package domain.map_items;

import java.util.ArrayList;

import domain.MapPosition;

public class Breaker extends MapItem {
   private ArrayList<MapItem> items;

    // No-argument constructor
    public Breaker() {
        super(new MapPosition(0, 0, false));
        this.items = new ArrayList<>();
    }

    // Full-argument constructor
    public Breaker(MapPosition position, ArrayList<MapItem> items) {
        super(position);
        this.items = items;
    }

    // Copy constructor
    public Breaker(Breaker other) {
        super(new MapPosition(other.getPosition()));
        this.items = new ArrayList<>(other.items);
    }

    // Getters and Setters
    public ArrayList<MapItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MapItem> items) {
        this.items = items;
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
