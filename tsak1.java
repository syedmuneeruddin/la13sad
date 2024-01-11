package lab12;
//2021f-bse-033
//ALizain
public class tsak1 {
	public static void main(String args[]) { 
	int[] number = {21,31,41,51,61,71,81,91,101,111,121};
	try{
		System.out.println(number[0]);
		System.out.println(number[11]);
		}
		catch(ArrayIndexOutOfBoundsException e){ System.out.println ("Array Index is Out Of Bounds");
		}
		}

	
}
