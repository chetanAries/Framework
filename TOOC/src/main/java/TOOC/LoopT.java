package TOOC;

import org.testng.annotations.Test;

public class LoopT {
	
    public static void main(String[]args) throws Exception
    {
    	Temecula tem= new Temecula();
		for(int i=0; i<3; i++)
		{
			tem.selectProduct();
		}
   

    }}
