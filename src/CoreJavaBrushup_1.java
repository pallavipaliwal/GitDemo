import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int[] arr = new int[5];
			arr[0] = 1;
			arr[1] = 2;			
			arr[2] = 3;
			arr[3] = 4;
			arr[4] = 5;
			
			int[] arr2 = {1,2,3,4,5,6,8,88,66};
			System.out.println(arr[2]);
			
			
			//---------------FOR LOOP------------------
			
			for(int i = 0; i<arr.length; i++)
	
			{
				System.out.println(i);
			}
			
			for(int j = 0; j<arr2.length;j++)
			{
				System.out.println(arr2[j]);
			}
	
	//-----------ENHANCED LOOPS
			
			for(int ab :arr2)
				System.out.println(ab);
			
	//-------------ARRAY LIST
			
			ArrayList<String> a = new ArrayList<String>();
			a.add("Rahul");
			a.add("Pooja");
			a.add("Neha");
			a.add("Shikha");
			a.remove(1);
			a.get(2);
			System.out.println(a);
			System.out.println(a.get(2));
			//To Check if certain element is present in the Array List or not
			
			System.out.println(a.contains("Shikha"));
	
			
	//----------HOW TO CONVERT ARRAY TO ARRAY LIST----------
			
			String[] arr12 = {"neha","geeta", "ram", "seeta", "rajan"};
			for(String abc :arr12)
			System.out.println(abc);
			List<String> ch = Arrays.asList(arr12);
			System.out.println(ch);
	
			
	//-----------STRINGS-------
			
			//STRING IS AN OBJECT THAT REPRESENT SEQUENCE OF CHARACTERS AND WE CAN DEFINE STRING IN 2 WAYS ONE IS USING STRING LITERALS OR USING 
			//NEW OPERATOR
			
			String s = "rahul";
			String s1 = "rahul";
			
			String s2 = new String("Rahul");
			String s3 = new String("Rahul");
			
			//since we are using New operator so it will allocated new memory in the backend unlike the previous type
			
			
			
			//-----------------PROGRAM TO PRINT THE NAME IN REVERSE
			
			String name = "Pallavi Paliwal";
			for(int i = name.length()-1;i>=0;i--)
			{
				System.out.println(name.charAt(i));
			}
			
	}
}
