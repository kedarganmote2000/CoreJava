package SpeedValidation;
import java.util.*;
import static SpeedValidation.Licenserule.*;
public class TesterLicense {

	public static void main(String[] args) {
	    try(Scanner sc = new Scanner(System.in)) {
	    	System.out.println("Enter Speed");
	    	speedRange(sc.nextInt());
	    	System.out.println("Enter Licence Expire Date(dd-MM-yyyy)");
	    	System.out.println("Your Lic Expiring on" + LicenseExp(sc.next()));
	    }
	    catch(Exception e) {
	    	System.out.println(e.getMessage());
	    }
	}

}
