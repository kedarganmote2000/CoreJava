package SpeedValidation;
import java.util.*;
import java.text.*;   //ParseException;
//import java.text.SimpleDateFormat;

public class Licenserule {
     public static final int MAX_SPEED;
     public static final int MIN_SPEED;
     public static SimpleDateFormat sdf;
     static {
    	  MAX_SPEED=80;
    	  MIN_SPEED=40;
    	  sdf=new SimpleDateFormat("dd-MM-yyyy");
     }
     public static void speedRange(int speed) throws LicenseValidation{
    	 if(speed>MAX_SPEED) {
    		 throw new LicenseValidation("Over Speeding");
    	 }
    	 if(speed<MIN_SPEED) {
    		 throw new LicenseValidation("Under Speed");
    	 }
    	System.out.println("Speed In Range");;
     }
     public static Date LicenseExp(String LicExp) throws ParseException,LicenseValidation{
    	 Date today = new Date();
    	 
    	 Date LicExpire=sdf.parse(LicExp);
    	 if(LicExpire.after(today))
    	 return LicExpire;
    	 throw new LicenseValidation("License Expired");
     }
}
