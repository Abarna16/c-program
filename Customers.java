
package Cab;

public class Customers {
    int id;
    String name;
    int password;
    int age;
    String gender;
    Customers(int id,String name,int password,int age,String gender)
    {
        this.id=id;
        this.name=name;
        this.password=password;
        this.age=age;
        this.gender=gender;
        
    }
    Customers()
    {   
    }
    public String toString()
    {
        return this.id+" "+this.name+" "+this.password+" "+this.age+" "+this.gender;
    }
}
