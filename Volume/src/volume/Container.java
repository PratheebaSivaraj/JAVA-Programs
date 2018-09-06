/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume;

/**
 *
 * @author admin
 */
public class Container {

public
            int vol;
    int volume(int l,int b,int h)
	{
		vol=l*b*h;
		return vol;
	//int volume=l*b*h;
		
	}
	int volume(int a)
	{
		vol=a*a*a;
		return vol;
	//int volume=a*a*a;
        }	
	
public static void main(String args[])
{
    try
    {
    Container outer=new Container();
    Container inner =new Container();
    int o=outer.volume(5);
    int i=inner.volume(1,2,3);
    int remaining=o-i;
    if(remaining>0)
    {
        System.out.println("remaining space "+remaining);
    }
    else
    {
        throw new Exception();
    }
    }
    catch(ClassNotFoundException e1)
    {
        System.out.println("number format");
    }
    
    catch(NumberFormatException e)
    {
        System.out.println("number format");
    }
    catch(Exception e2)
    {
       
        System.out.println("Exception");
    }
    
}
}
