// Question: 4) Write a program to add 3 numbers using constructor.

// Code:-


class add{
    int a,b,c;
    add(int x,int y,int z)
    {
        a = x;
        b = y;
        c = z;
    }
    int cal(){
        return a+b+c;
    }
}
public class addition {
    public static void main(String[] args) {
        int sum;
        add d =new add(10,20,30);
        sum = d.cal();
        System.out.println("Addtion "+sum);
    }
}

/*Output:-
  
Addtion 60

Process finished with exit code 0*/
