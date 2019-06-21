package Cab;

import java.util.ArrayList;

public class CabLocation {
    String location;
    int total;
    int commision;
    ArrayList<Detail> detail=new ArrayList<Detail>();
    
  
    int cabId;
    int flag;
    int trips;
    CabLocation(String location,int cabId)
    {
        this.location=location;
        this.cabId=cabId;
        
        
    }
    CabLocation(String source,String destination,int id,int fare,double com)
    {
        detail.add(new Detail(source,destination,id,fare,com));
    }
    public String getLocation()
    {
        return this.location;
    }
    public int getCabId()
    {
        return this.cabId;
    }
    public String toString()
    {
         for(Detail x:detail)
                          {
                              System.out.println(x);
                          }
        return this.total +"Number of trips "+this.trips ;
    }
}
