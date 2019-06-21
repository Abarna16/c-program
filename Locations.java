
package Cab;

public class Locations {
    int id;
    String name;
    int distance;
    Locations()
    {
        
    }
    Locations(int id,String name,int distance)
    {
        this.id=id;
        this.name=name;
        this.distance=distance;
    }
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public int getDistance()
    {
        return this.distance;
    }
     public String toString()
    {
        return this.id+" "+this.name+" "+this.distance;
    }
}
