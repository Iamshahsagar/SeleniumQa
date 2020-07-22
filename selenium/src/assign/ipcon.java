package assign;

import java.net.InetAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ipcon {
	
	public static boolean isValidIP(String ipAddr){
		
		Pattern ptn = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
		Matcher mtch = ptn.matcher(ipAddr);
	//	return mtch.find();
		    }

	   public static void main(String args[]) throws Exception
	   {
	      /* public static InetAddress getLocalHost()
	       * throws UnknownHostException: Returns the address 
	       * of the local host. This is achieved by retrieving 
	       * the name of the host from the system, then resolving 
	       * that name into an InetAddress. Note: The resolved 
	       * address may be cached for a short period of time.
	       */
		   
		  
	     
	        
	        
	        
	      InetAddress myIP=InetAddress.getLocalHost();
	 
	      /* public String getHostAddress(): Returns the IP 
	       * address string in textual presentation.
	       */
	      String st = myIP.getHostAddress();
	      
	      System.out.println("My IP Address is: " + st);
	    //System.out.println(+MyIpMatch.isValidIP(st));
	  }

}


