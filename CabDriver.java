
package Cab;

public class CabDriver {
    int id;
    String name;
    int password;
    int age;
    String gender;
    CabDriver(int id,String name,int password,int age,String gender)
    {
        this.id=id;
        this.name=name;
        this.password=password;
        this.age=age;
        this.gender=gender;
        
    }
    CabDriver()
    {   
    }
    public String toString()
    {
        return this.id+" "+this.name+" "+this.password+" "+this.age+" "+this.gender;
    }
}
