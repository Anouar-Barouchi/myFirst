import java.awt.*;
import java.awt.TextField;

public class Text extends TextField {
	
	Font f = new Font("Garamond", Font.BOLD,30);
	
	public Text() {
		this.setText("0");
		this.setFont(f);
		
	}
	int getInt() {
		String d = this.getText();
		int s = Integer.valueOf(d);
		return s;
	}
	public String Calc_Bovins(int v)
    {
        String msg=null;
        int x=v;
        int x40,x30;
        x40=0;x30=0;
        if(v>=120)
        {
            
        
        if(v%40 ==0 ||v% 30==0||v % 40<10||v % 30<10)
        {
            if(v%40==0 ||v%40<10)
            {msg=(v/40+"MO");
                
            }
           
            else 
            {
              msg=(v/30+"T");   
            }
               
        }
           
        else 
        {
        	do
            {
                if(x!=40 )
                {
                    x=x-30;
                    x30=x30+1;
                }
                 if((x!=30) && (x>=40 ))
                {
                    x=x-40;
                    x40=x40+1;
                }
                
                
                
            }while(x>=30);
            
            
            msg=(x30+"T + "+x40+"MO");
        }
            
        
        
        }
        else
        {
            
                
               if(v<30)
               {
                   msg=("No Zakat");
               }
                    if(v>=30&&v<=39)
                    {
                        msg=("1T");
                    }
                 
                    if(x>=40&&x<=59)
                    {
                        msg=("MO");
                    }
                   
                    if(x>=60&&x<=69)
                    {
                        msg=("2T" );
                    }
                    
                    if(x>=70&&x<=79)
                    {
                        msg=(" MO+T");
                    }
                    
                    if(x>=80&&x<=89)
                    {
                        msg=("2MO");
                    }
                    if(x>=90&&x<=99)
                    {
                        msg=("3T");
                    }
                    if(x>=100&&x<=119)
                    {
                        msg=("MO+2T");
                    }
                    
                   
                    
                    
            
        }
        
        
        
        
        
        
        
        
        return msg;
    }
	
	public String calc(int v)
    {
        String msg = null;
        
        int x=v;
        int x40,x50;
        
        
        
        x40=0;x50=0;
        if(v>120)
        {
            
        
        if(v%50==0 ||v%40==0 || v%40<10 ||v%50<10)
        {
            if(v%50==0||v%50<10)
            {msg=(v/50+"H"); 
                
            }
           
            else
            {
              msg=(v/40+"H");   
            }
               
        }
           
        else 
        {
            do
            {
                if((x!=50) )
                {
                    x=x-40;
                    x40=x40+1;
                }
                 if((x!=40)  && (x>=50) )
                {
                    x=x-50;
                    x50=x50+1;
                }
                
                
                
            }while(x>=40);
            
            
            msg=(x40+"L ET "+x50+"H");
        }
            
        
        
        }
        else
        {
            
                
               if(v<5)
               {
                   msg=("Vous N'avez aucun Zakat");
               }
                    if(v>=5&&v<=24)
                    {
                        msg=(x/5+"Chaite");
                    }
                 
                    if(x>=25&&x<=35)
                    {
                        msg=(" M");
                    }
                   
                    if(x>=36&&x<=45)
                    {
                        msg=("L" );
                    }
                    
                    if(x>=46&&x<=60)
                    {
                        msg=(" H");
                    }
                    
                    if(x>=61&&x<=75)
                    {
                        msg=("J");
                    }
                   
                    if(x>=76&&x<=90)
                    {
                        msg=(" 2L");
                    }
                   
                    if(x>=91&&x<=120)
                    {
                        msg=(" 2H");
                    }
                   
                    
                    
            
        }
        return msg;
        
    }
	
	public float calcNum(int v)
    {
    	float x;
    	
    	if(v<450500)
    	{
    		x=0;
    	}
    	else
    	{
    		x=(float) ((v*2.5)/100);
    	}
    	
    	return x;
    	
    }

    public String Calc_Ovins(int v)
    {
    	 String msg=null;
	        int x=v;
	        int x40,x30;
	        x40=0;x30=0;
	        if(v>=400)
	        {
	            
	        msg=(v/100+"C");
	        }
	        else
	        {
	            
	                
	               if(v<40)
	               {
	                   msg=("No Zakat");
	               }
	                    if(v>=40&&v<=120)
	                    {
	                        msg=("1C");
	                    }
	                 
	                    if(x>=121&&x<=200)
	                    {
	                        msg=("2C");
	                    }
	                   
	                    if(x>=201&&x<=399)
	                    {
	                        msg=("3C" );
	                    }
	                    
	                    
	                    
	                   
	                    
	                    
	            
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        return msg;
    }
    public float calc_agrA(int v)
    {
    	float x=0;
    	if(v<675)
    	{
    		x=0;
    	}
    	else{
    		x=(v*5)/100;
    		
    	}
    	return x;
    }
    public float calc_agrs(int v)
    {
    	float x=0;
    	if(v<675)
    	{
    		x=0;
    	}
    	else{
    		x=(v*10)/100;
    		
    	}
    	return x;
    }
    
    
	

}
