import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        System.out.println(myMap);
        myMap.addBuilding(new Building("Dewey Hall", "4 Neilson Drive"));
        myMap.addBuilding(new House ("Tyler", "164 Green Street", 4, true, false));
        myMap.addBuilding(new House("101 Green Street"));//Morris House
        myMap.addBuilding(new Library("Neilson Library", "7 Neilson Drive", 4, true));
        myMap.addBuilding(new Library("122 Green Street", 2));//Josten Library
        myMap.addBuilding(new Cafe("Compass Cafe", "7 Neilson Drive", 1, 50, 50, 50, 50));
        myMap.addBuilding(new Cafe("100 Elm Street")); //Campus Center Cafe
        myMap.addBuilding(new House("49 Elm Street", true, true));//Northrop House
        myMap.addBuilding(new House("Comstock", "1 Mandelle Road", 4, true, true));
        myMap.addBuilding(new House("Hubbard", "3 Green Street", 4, false, false));
        System.out.println(myMap.toString());

    }
    
}
