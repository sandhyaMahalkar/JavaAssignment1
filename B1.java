
//Question: 1) Write a program to display user profile on screen, including personal accademic details.
//Code:-

class userprofile
{
  public static void main(String[] args)
  {
    String name,branch,college;
    int rollno,userid;
    float percentage;
    name = "Sopan Jadhav";
    branch = "CSE";
    college = "ICEEM";
    rollno = 21;
    percentage = 85.60f;
    userid = 5412855;
    System.out.println("Name:-"+"\t"+name);
    System.out.println("User ID:-"+"\t"+userid);
    System.out.println("Branch:-"+"\t"+branch);
    System.out.println("Roll No:-"+"\t"+rollno);
    System.out.println("College:-"+"\t"+college);
    System.out.println("Percentage:-"+"\t"+percentage);

  }
}


/*Output:-
Name:-	Sopan Jadhav
User ID:-	5412855
Branch:-	CSE
Roll No:-	21
College:-	ICEEM
Percentage:-	85.6

Process finished with exit code 0*/
