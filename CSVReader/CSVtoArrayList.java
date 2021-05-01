 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays; 

 
public class CSVtoArrayList {
	public static void main(String[] args) {
		
		BufferedReader Buffer = null;
		
		try {
			String Line;
			Buffer = new BufferedReader(new FileReader("a.csv"));
			
			// How to read file in java line by line?
			while ((Line = Buffer.readLine()) != null) {
				//System.out.println("Raw CSV data: " + Line);
				System.out.println("Converted ArrayList data: " + CSVtoArrayList(Line) + "\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (Buffer != null) Buffer.close();
			} catch (IOException Exception) {
				Exception.printStackTrace();
			}
		}
	}
	
	// Utility which converts CSV to ArrayList using Split Operation
	public static ArrayList<String> CSVtoArrayList(String CSV) {
		ArrayList<String> Result = new ArrayList<String>();
		
		if (CSV != null) {
			String[] splitData = CSV.split("\\s*,\\s*");
			for (int i = 0; i < splitData.length; i++) {
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
					//System.out.println(splitData[i].getClass().getName());

					Result.add(splitData[i].trim());
					//System.out.println(splitData[1].getClass().getName());

	String number= Result.get(i);
	//System.out.println(number.getClass());

		float f=Float.parseFloat(number);
		System.out.println(" "+ f);

	 //float ARRAYS DECLARATION
	    float[] float_array = new float[10];
 	   //Assign all the elements of float array to 1
 	 //  Arrays.fill(float_array,1f);
  	  //float ARRAY OUTPUT
  	   Arrays.fill(float_array,f);
      	   System.out.println("float array Element :  "  + float_array[i]);
    
		
  
		//System.out.println(f.getClass().getName());


			  	        		


				}
			}
		}
		
		return Result;
     //   Float number= Result.get(0);
	//System.out.println(number.getClass().getName());

	}
	
}
