//Questions: 5)Write a program to add 2,3,4,5 numbers using constructor overloading 

//Code:-
class add{
    int a,b,c,d,e;
    add(int x,int y)
    {
        a = x;
        b = y;
    }
    int cal(){
        return a+b;
    }
    add(int x,int y, int z){

        a =x;
        b= y;
        c = z;

    }
    int cal2(){
        return a+b+c;
    }
    add(int w,int x,int y,int z){
        a = w;
        b = x;
        c = y;
        d = z;

    }
    int cal3(){
        return a+b+c+d;
    }
    add(int v,int w,int x,int y,int z)
    {
        a = v;
        b = w;
        c = x;
        d = y;
        e = z;
    }
    int cal4(){
        return a+b+c+d+e;
    }
}

public class addition {
    public static void main(String[] args)
    {
        int s,s2,s3,s4;
        add f = new add(10,20);
        s = f.cal();
        System.out.println("addition of two numbers "+s);
        add f2 = new add(10,20,30);
        s2 = f2.cal2();
        System.out.println("addition of three numbers "+s2);
        add f3 = new add(10,20,30,40);
        s3 = f3.cal3();
        System.out.println("addition of four numbers "+s3);
        add f4 = new add(10,20,30,40,50);
        s4 = f4.cal4();
        System.out.println("addition of five numbers "+s4);
    }
}


/*Output:-
addition of two numbers 30
addition of three numbers 60
addition of four numbers 100
addition of five numbers 150

Process finished with exit code 0*/
