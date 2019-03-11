/*
 this program is used to Used to determine the concavity and convexity of a polygon, t
    aking the example quadrilateral as an example.
 */
package week;

import java.util.Vector;

public class week
{

     public static  void main(String []args)
     {
         Vector x = new Vector(4);
         Vector y = new Vector(4);
         /*
          the point of picture
           */
         x.add(0.00);y.add(0.00);
         x.add(2.00);y.add(1.00);
         x.add(1.00);y.add(0.00);
         x.add(2.00);y.add(-1.00);
         x.add(0.00);y.add(0.00);
         boolean m= true;
         for(int i=0;i<x.size()-1;++i)
         {
             double a=Double.valueOf(x.get(i).toString()),b=Double.valueOf(x.get(i+1).toString());
             int number = out_point_number(a,b,x,y);
             if(number<3)m=false;
         }
         if(!m)System.out.print("is a Convex polygon");
         else System.out.print("is a Concave polygon");
     }
     static  int out_point_number(double a ,double b ,Vector x,Vector y)
     {
         int q=0;
         double m=a-0.01,n=b;
         int number=0;
         for(int i=0;i<x.size()-1;++i)
         {
             double x1=Double.valueOf(x.get(i).toString()),x2=Double.valueOf(x.get(i+1).toString());
             double y1=Double.valueOf(y.get(i).toString()),y2=Double.valueOf(y.get(i+1).toString());
             double  z=(y2-y1)/(x2-x1)*(m-x1)+y1;
             if((z-y1)*(z-y2)<0&&z>b)++number;
         }
         if(judge(number))++q;
         m=a+0.01;n=b;number=0;
         for(int i=0;i<x.size()-1;++i)
         {
             double x1=Double.valueOf(x.get(i).toString()),x2=Double.valueOf(x.get(i+1).toString());
             double y1=Double.valueOf(y.get(i).toString()),y2=Double.valueOf(y.get(i+1).toString());
             double  z=(y2-y1)/(x2-x1)*(m-x1)+y1;
             if((z-y1)*(z-y2)<0&&z>b)++number;
         }
         if(judge(number))++q;
         m=a;n=b+0.01;number=0;
         for(int i=0;i<x.size()-1;++i)
         {
             double x1=Double.valueOf(x.get(i).toString()),x2=Double.valueOf(x.get(i+1).toString());
             double y1=Double.valueOf(y.get(i).toString()),y2=Double.valueOf(y.get(i+1).toString());
             double  z=(y2-y1)/(x2-x1)*(m-x1)+y1;
             if((z-y1)*(z-y2)<0&&z>b)++number;
         }
         if(judge(number))++q;
         m=a;n=b+0.01;number=0;
         for(int i=0;i<x.size()-1;++i)
         {
             double x1=Double.valueOf(x.get(i).toString()),x2=Double.valueOf(x.get(i+1).toString());
             double y1=Double.valueOf(y.get(i).toString()),y2=Double.valueOf(y.get(i+1).toString());
             double  z=(y2-y1)/(x2-x1)*(m-x1)+y1;
             if((z-y1)*(z-y2)<0&&z>b)++number;
         }
         if(judge(number))++q;
         return q;
     }
      static boolean judge(int m)
     {

         if(m%2==0) return true;
         else return false;
     }
}
