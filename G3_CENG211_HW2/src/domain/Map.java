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

    // Getter with deep copy
    public ArrayList<ArrayList<MapItem>> getMap() {
        ArrayList<ArrayList<MapItem>> deepCopy = new ArrayList<>();
        for (ArrayList<MapItem> row : this.map) {
            ArrayList<MapItem> rowCopy = new ArrayList<>();
            for (MapItem item : row) {
                rowCopy.add(item.clone()); // Assuming MapItem has a clone() method
            }
            deepCopy.add(rowCopy);
        }
        return deepCopy;
    }

    // Setter with deep copy
    public void setMap(ArrayList<ArrayList<MapItem>> map) {
        ArrayList<ArrayList<MapItem>> deepCopy = new ArrayList<>();
        for (ArrayList<MapItem> row : map) {
            ArrayList<MapItem> rowCopy = new ArrayList<>();
            for (MapItem item : row) {
                rowCopy.add(item.clone()); // Assuming MapItem has a clone() method
            }
            deepCopy.add(rowCopy);
        }
        this.map = deepCopy;
    }
}

