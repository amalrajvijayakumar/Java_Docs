package forGit;

public class Tenali
{
public static void main (String[] args)
{
Tenali story = new Tenali();
story.find_security(1024);
story.find_flowers(7);
story.print_1();
}

void print_1()
{
int count = 1;
while (count<=5)
     {
//     System.out.print(1+ " ");
         System.out.println(count);
     count = count+1;
     }
}



void find_flowers(int temples)
{
int flower_count =1;
while (temples>0)
     {flower_count=flower_count * 2;
     temples= temples - 1;
     }

System.out.println("Flower count is " + flower_count);

}



void find_security(int beats)
{
int security= 0;
while (beats>1)
{
System.out.println("Each security gets" + (beats/2));
beats= beats/2;
security= security+1;
}
System.out.println("Total no. of Securities" + security);
}


}
