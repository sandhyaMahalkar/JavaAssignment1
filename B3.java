// Question: 3) Write a program to display addition of two numbers on screen by taking inpute form the user

// Code:
class addition
{
  public static void main(String[] args) {
    int a,b,sum;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Number ");
    a= in.nextInt();
    System.out.println("Enter Number ");
    b= in.nextInt();
    sum=a+b;
    System.out.println("Addition = "+sum);
  }
}
/*Output:
Enter Number 
5
Enter Number 
6
Addition = 11

Process finished with exit code 0*/
