package Cab;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {
public static void main(String args[])
{
    int choice,i;
    ArrayList<Customers> customer=new ArrayList<Customers>();
        customer.add(new Customers(1,"zz",99,25,"F"));
         customer.add(new Customers(2,"yy",88,61,"M"));
          customer.add(new Customers(3,"xx",77,22,"M"));
           customer.add(new Customers(4,"ww",66,36,"F"));
    ArrayList<CabDriver> driver=new ArrayList<CabDriver>();
       driver.add(new CabDriver(1,"aaa",111,43,"M"));
        driver.add(new CabDriver(2,"bbb",222,31,"M"));
          driver.add(new CabDriver(3,"ccc",333,38,"F"));
           driver.add(new CabDriver(4,"ddd",444,28,"F"));
           
     ArrayList<Locations> location=new ArrayList<Locations>();
        location.add(new Locations(1,"A",0));
         location.add(new Locations(3,"C",4));
         location.add(new Locations(4,"D",7));
           location.add(new Locations(6,"F",9));
             location.add(new Locations(2,"B",15));
               location.add(new Locations(7,"G",18));  
               location.add(new Locations(8,"H",20));
                 location.add(new Locations(5,"E",23));
     ArrayList<CabLocation> cablocation=new ArrayList<CabLocation>();
      cablocation.add(new CabLocation("D",1));
        cablocation.add(new CabLocation("G",2));
         cablocation.add(new CabLocation("H",3));
          cablocation.add(new CabLocation("A",4));    
           ArrayList<Detail> detail=new ArrayList<Detail>();
          
                 
//              for(CabLocation k:cablocation)
//                      {
//                         System.out.println(k.getLocation()+k.getCabId());
//                       }     
               
           
           
//          for(Locations k:location)
//           {
//               System.out.println(k);
//           }
               
    
   do
   {
      System.out.println("1.Admin Login\n2.Customer Signup\n3.User Login\n4.CabDriver Login5.Exit");
       
       Scanner scanner=new Scanner(System.in);
       choice=scanner.nextInt();
       switch(choice)
       {
           case 1:
               int flag=0;
                    Admin admin = new Admin();
                    int choice1;
                    scanner.nextLine();
                    System.out.println("Enter  name");
                    String name =scanner.nextLine();
                    System.out.println("Enter password");
                    String password = scanner.nextLine();
                    if(admin.name.equals(name))
                    {
                        if(admin.password.equals(password))
                        {
                            flag=1;
                        }
                    }
                    if(flag==1)
                    {
                    System.out.println("Login successfull");
                    do
                    {
                         System.out.println("1.Add cab\n2.Add Location\n3.Remove Location\n4.view details\n5.Exit");
                       choice1=scanner.nextInt();
                    switch(choice1)
                    {
                        case 1:
                            
                            System.out.println();
                            int id1,age1,password1;
                            String name1,gender1,initial;
                            System.out.println("Enter id");
                             id1=scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter name");
                            name1=scanner.nextLine();
                            System.out.println("Enter password");
                            password1=scanner.nextInt();
                            System.out.println("Enter age");
                            age1=scanner.nextInt();
                             scanner.nextLine();
                            System.out.println("Enter gender");
                            gender1=scanner.nextLine();
                             System.out.println("Enter Initial Location");
                           initial=scanner.nextLine();
                             driver.add(new CabDriver(id1,name1,password1,age1,gender1));
                              cablocation.add(new CabLocation(initial,id1));
                              System.out.println("Cab added successful");
                              break;
                        case 2:
                            System.out.println("Id Name Distance from origin");
                            for(Locations k:location)
                            {
                                System.out.println(k.getId()+"   "+k.getName()+"     "+k.getDistance());
                            }
                            int distance,id;
                            String location1;
                            System.out.println("Enter the id");
                            id=scanner.nextInt();
                            scanner.nextLine();
                              System.out.println("Enter the location");
                            location1=scanner.nextLine();
                              System.out.println("Enter the distance");
                            distance=scanner.nextInt();
                             location.add(new Locations(id,location1,distance));
                             System.out.println("Location added successfully");
                             break;
                        case 4:
                          for(CabLocation l:cablocation)
                          {
                              System.out.println(l);
                          }
                           
                          break;
                            
                    }
                    
                    }while(choice1<5);
                    }
                    else 
                    System.out.println("Login Failed");
                    break;
                    
                   
           case 3:
               int flag3=0;
                    Customers customers = new Customers();
                    int choice3,cid=0;
                    scanner.nextLine();
                    System.out.println("Enter  name");
                    String customerName =scanner.nextLine();
                    System.out.println("Enter password");
                    int customerPassword = scanner.nextInt();
                     for(Customers k:customer)
                    {
                    if(k.name.equals(customerName))
                    {
                        if(k.password==customerPassword)
                        {
                            flag3=1;
                            cid=k.id;
                        }
                    }
                    }
                    if(flag3==1)
                    {
                    System.out.println("Login successfull");
                    do
                    {
                       // System.out.println("Location"+" "+"cabId");
                       for(CabLocation k:cablocation)
                      {
                         System.out.println(k.getLocation()+"        "+k.getCabId());
                       }  
                    
                       System.out.println("Enete your id");
                     System.out.println("1.Book Cab\n5.Exit");
                     System.out.println("Enter your choice");
                     choice3=scanner.nextInt();
                     switch(choice3)
                     {
                         case 1:
                             String source,destination;
                             int sourcedis=0,destinationdis=0,cabdis=0,min=100,cabid=0,confirm=0,trips=0;
                             scanner.nextLine();
                                System.out.println("Enter your source location");
                                source=scanner.nextLine();
                                System.out.println("Enter your destination location");
                                destination=scanner.nextLine();
                                for(Locations p3:location)
                                {
                                   if(source.equalsIgnoreCase(p3.name))
                                   {
                                       sourcedis=p3.distance;
                                   }
                                   if(destination.equalsIgnoreCase(p3.name))
                                       destinationdis=p3.distance;
                                       
                                }
                                int diff=Math.abs(destinationdis-sourcedis);
                               //System.out.println(sourcedis+" "+destinationdis);
                                for(CabLocation p:cablocation)
                                {
                                    if(p.flag==0)
                                    {
                                   for(Locations p1:location)
                                    {
                                   if(p.location.equals(p1.name))
                                   {
                                       cabdis=p1.distance;
                                   }
                             
                                       
                                    }
                                   cabdis=Math.abs(sourcedis-cabdis);
                                  // System.out.println("dis"+cabdis+" "+sourcedis);
                                    if(min>cabdis)
                                    {
                                        min=cabdis;
                                        cabid=p.cabId;
                                        trips=p.trips;
                                        
                                         //System.out.println("min valu"+min+" "+cabid);
                                    }
                                    if(min==cabdis)
                                    {
                                        if(trips>p.trips)
                                        {
                                             min=cabdis;
                                        cabid=p.cabId;
                                        trips=p.trips;
                                        }
                                    }
                                    }
                                }
                                  //System.out.println("min"+min+" "+cabid);
                                if(cabid!=0)
                                {
                                    confirm=1;
                                    int fare=(diff*10);
                                    double com=fare*0.3;
                                    System.out.println("Accepted...your cab number is: "+cabid+"\nTotal Fare is"+fare);
                                      for(CabLocation p:cablocation)
                                     {
                                    if(cabid==p.cabId)
                                    { p.flag=1;
                                    p.total=p.total+fare;
                                    p.location=destination;
                                       p.trips=p.trips+1;
                                       p.commision=p.commision+(int)com;
                                      // CabLocation
                                       CabLocation ob=new CabLocation(source,destination,cid,fare,com);
                                       
                                    }
                                    else
                                        p.flag=0;
                                     }
                                }
                                
//                                for(CabLocation p:cablocation)
//                                     {
//                                     System.out.println(p.trips);
//                                     }
                                
                     }
                    }while(choice3<5);
                    }
                    else 
                    System.out.println("Login Failed");
                    break;
                   
       }
       
   }while(choice<5);
   
}
}
