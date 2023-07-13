package self;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo sd = new StringDemo();
		sd.check_start();
		sd.check_ends(); 
		}
private void check_ends() {
		// TODO Auto-generated method stub
		String name1 = "amalraj";
		String name2 ="raj";
		boolean ends = true;   //i = name2 j = name1
		int j= name1.length()-1; 
		for(int i = name2.length()-1; i>0; i--) {
			if (name1.charAt(j)==name2.charAt(i))
			{
				j--;
				continue;
			}
			else {
				System.out.println("No, not ends with");
				ends = false;
				break;
				}
			}
			if (ends == true)
				{
				System.out.println("yes ends with " + name2);
				}
		}


	private void check_start() {
		// TODO Auto-generated method stub
		String name1 = "amalraj";
		String name2 = "amal";
	
		boolean starts = true;
		for (int i=0; i<name2.length(); i++){
			if (name1.charAt(i) == name2.charAt(i))
			{
			continue;
			}
		else
			{
			starts = false;
			break;
			}
		}
		if (starts == true)
		{
			System.out.println("yes " + name1 + " starting like " + name2);
		}
		else
		{
			System.out.println("Not starts with " + name2);
		}
	}	
}


//THese all are to understand how to print string //
//String lastmovie1= "Gn";
//String lastmovie2= "Gn";
//String lastmovie3= "Gn";
//String lastmovie4= "Gn";
//
//System.out.println(lastmovie1.hashCode());
//System.out.println(lastmovie2.hashCode());
//System.out.println(lastmovie3.hashCode());
//System.out.println(lastmovie4.hashCode());
//lastmovie1 = "2018";
//System.out.println(lastmovie1.hashCode());
//System.out.println(lastmovie2.hashCode());
//System.out.println(lastmovie3.hashCode());
//System.out.println(lastmovie4.hashCode());
//String name = "praveen";

//System.out.println(name.length());   
//for(int i = 0; i<name.length(); i++)
//
//{
//	if(name.charAt(i) =='a')
//	System.out.println(name.charAt(i));
//}
//System.out.println(name.charAt(0));
//System.out.println(name.charAt(name.length()-1));
//System.out.println(name.charAt(name.length()/2));
//}