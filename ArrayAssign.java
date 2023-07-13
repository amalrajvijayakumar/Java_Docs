package forGit;

public class ArrayAssign {

public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayAssign aa = new ArrayAssign();
//aa.arraycentum();
//aa.arrayless();
aa.arraygreater();
//aa.arrayodd();
//aa.arrayeven();
	}
private void arraycentum() {
		// TODO Auto-generated method stub
		int [] Amalraj = {89,93,78,100,90,97};
		int i =0;
		while (i<Amalraj.length)
			{
			if(Amalraj[i] == 100)
			System.out.println("Centum- " + Amalraj[i]);
			i++; 
		}
	}
	
private void arrayless() {
		// TODO Auto-generated method stub
	int [] Amalraj = {89,93,78,100,90,97};
	int i =0;
	while (i<Amalraj.length)
	{
		if (Amalraj[i] < 80)
			System.out.println("Less than 80- " + Amalraj[i]);
		i++;
 }
	}
private void arraygreater() {
	// TODO Auto-generated method stub
	int [] Amalraj = {67,93,78,100,90,97};
	int i =0;
	int count =0;
	while (i<Amalraj.length)
	{
		if (Amalraj[i] > 80)
		System.out.println("Greater than 80- " + Amalraj[i]);
		i++;
		count = count + Amalraj[i];
		System.out.println(count);		
	}
	}

private void arrayodd() {
	// TODO Auto-generated method stub
	int [] Amalraj = {89,93,78,100,90,97};
	int i =0;
	int count =0;
	while (i<Amalraj.length)
	{
			System.out.println("Odd- " + Amalraj[i]);
		i= i+2;
		count++;
		
		
	}
}

private void arrayeven() {  
	// TODO Auto-generated method stub
	int [] Amalraj = {89,93,78,100,90,97};
	int i =1;
	while (i<Amalraj.length)
	{
			System.out.println("Even- " + Amalraj[i]);
		i= i+2;
	}
  }
}



