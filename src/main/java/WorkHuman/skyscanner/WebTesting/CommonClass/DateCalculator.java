package WorkHuman.skyscanner.WebTesting.CommonClass;

public class DateCalculator {

	 int []days={ 31, 28, 31, 30, 31, 30,
             31, 31, 30, 31, 30, 31 };
	 String []months = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August", "September", "October", "November", 
			        "December"};
	 
	 public int getDay(int currentDay, String month)
	 {   
		 if((currentDay + 3) > days[findIndex(month)])
	        return(days[findIndex(month)]- (currentDay+3));
		 else
			 return currentDay+3;
	 }
    public int findIndex(String month)
    {
    	if (months == null) {
            return -1;
        }
 
        // find length of array
        int len = months.length;
        int i = 0;
 
        // traverse in the array
        while (i < len) {
 
            // if the i-th element is t
            // then return the index
            if (months[i].equals(month)) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
    public String getMonth(int currentDay, String month)
    {
    	if((currentDay + 3) > days[findIndex(month)])
    	return months[findIndex(month)+1];
    	else
    		return months[findIndex(month)];
    }
    
}
