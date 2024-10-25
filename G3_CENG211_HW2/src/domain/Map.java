package domain;

import java.util.ArrayList;

import domain.map_items.MapItem;

public class Map {
     private ArrayList<ArrayList<MapItem>> map;

    // No-argument constructor
    public Map() {
        this.map = new ArrayList<>();
    }

    // Full-argument constructor
    public Map(ArrayList<ArrayList<MapItem>> map) {
        this.map = map;
    }

    // Copy constructor
    public Map(Map other) {
        this.map = new ArrayList<>(other.map);
    }

    // Getters and Setters
    public ArrayList<ArrayList<MapItem>> getMap() {
        return map;
    }

    public void setMap(ArrayList<ArrayList<MapItem>> map) {
        this.map = map;
    }

   
    
}

