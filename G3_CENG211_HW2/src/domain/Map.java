package domain;

import domain.map_items.MapItem;
import java.util.ArrayList;

public class Map {
    private ArrayList<ArrayList<MapItem>> map;

    // No-argument constructor
    public Map() {
        this.map = new ArrayList<>();
    }

    // Full-argument constructor
    public Map(ArrayList<ArrayList<MapItem>> map) {
        this.setMap(map);
    }

    // Copy constructor
    public Map(Map other) {
        this.map = new ArrayList<>(other.map);
    }

    // Getters and Setters
    public ArrayList<ArrayList<MapItem>> getMap() {
        // DEEP COPY YAPILMAK ZORUNDA!!!!!!
        return map;
    }

    public void setMap(ArrayList<ArrayList<MapItem>> map) {
        // DEEP COPY YAPILMAK ZORUNDA!!!!!!
        this.map = map;
    }
}

