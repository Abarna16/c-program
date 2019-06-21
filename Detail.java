
package Cab;

public class Detail {
  
     String source;
    String destination;
    int id;
    int fare;
   double com;
    Detail(String source,String destination,int id,int fare,double com)
    {
        this.source=source;
        this.destination=destination;
        this.id=id;
        this.fare=fare;
        this.com=com;
    }
    public String toString()
    {
        return "Source is "+this.source+" Destination is "+this.destination+"customer id"+this.id+"fare is"+this.fare+"commision "+this.com;
    }
}
