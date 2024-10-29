package domain.map_items;

import domain.MapPosition;

public abstract class MapItem {
    protected MapPosition position;

    // No-argument constructor
    public MapItem() {
        this.position = new MapPosition(0, 0, false);
    }

    // Full-argument constructor
    public MapItem(MapPosition position) {
        this.position = position;
    }

    // Copy constructor
    public MapItem(MapItem other) {
        this.position = new MapPosition(other.getPosition());
    }

    public void interaction(Player player) {
        // This method will be overridden in the subclasses
    }

    // Getters and Setters
    public MapPosition getPosition() {
        return position;
    }

    public void setPosition(MapPosition position) {
        this.position = position;
    }

    
}

