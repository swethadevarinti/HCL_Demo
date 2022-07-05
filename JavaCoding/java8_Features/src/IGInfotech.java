import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;

public class IGInfotech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reverse the string

		String s = "My Name is Shubham";
		String reverse = "" ;
		System.out.println("s::::::::::::"+s);
		
		s = s.replace(".", "");
		String[] words = s.split("\\s");
		
		for(int i = words.length-1;i>=0;i--) {
			reverse +=words[i]+" ";
			if(i==0) {
				reverse+=".";
			}
		}

		String inputStr ="I am going for an interview";
		inputStr = inputStr.toLowerCase();
		for(char i :inputStr.toCharArray()){
			
			if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: "+i);
				break;
			}
		}
		
		int[] array = {24,54,56,76,50,50,98,2 };
        int sum = 100;
		int count = 0; 
		 
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
            	if ((array[i] + array[j]) == sum) {
            		count++;
            		System.out.println(":::::::::::"+array[i]+":::::::::::"+array[j]);
            		System.out.printf("Count of pairs is %d", count);
            	}
            }
        }
        
        
        YearMonth ym = YearMonth.of(2022, Month.JANUARY);
        LocalDate d3 = ym.atDay(1).with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.SATURDAY));
        System.out.println("d3:::::::::::::::::::::::"+d3);
        
        
        
        
        

	}

}
