package domain.map_items;

import domain.MapPosition;

public  class MapItem {
    private MapPosition position;

    // No-argument constructor
    public MapItem() {
        this.position = new MapPosition(0, 0, false);
    }

    // Full-argument constructor
    public MapItem(MapPosition position) {
        this.setPosition(position);
    }

    // Copy constructor
    public MapItem(MapItem other) {
        this.setPosition(other.getPosition());
    }

    public void interaction(Player player) {
        // This method will be overridden in the subclasses
    }

    // Getters and Setters
    public MapPosition getPosition() {
        // Return a deep copy of the position
        return new MapPosition(position);
    }

    public void setPosition(MapPosition position) {
        this.position = new MapPosition(position);
    }

    // Clone method
    @Override
    public MapItem clone() {
        try {
            return (MapItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can't happen
        }
    }

    // toString method
    @Override
    public String toString() {
        return "MapItem{" +
                "position=" + position +
                '}';
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MapItem mapItem = (MapItem) obj;
        return position.equals(mapItem.position);
    }
}

