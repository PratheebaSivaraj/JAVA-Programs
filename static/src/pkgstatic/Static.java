/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;

/**
 *
 * @author admin
 */
public class Static {

    /**
     *
     */
    public
           final static String c;
    static
    {
        c="WELCOME";
        System.out.println(c);
    }
     char a;
    static int r=0;
    static int g=0;        
    static int b=0;
    void process(char a)
    {
         
     switch (a) {
         case 'r':
            
              r++;
             break;
         case 'b':
           
                 b++;
             break;
           
         case 'g':
            
              g++;
             break;
         default:
             break;
     }
      System.out.println("red"+r);
              System.out.println("blue"+b);
               System.out.println("green"+g);
        
    }
    
    public static void main(String args[])
    {
        Static b=new Static();
       b.process('r');
       System.out.println("");
          b.process('g');
             System.out.println("");
             b.process('b');
                System.out.println("");
       
      
    }
    
}
