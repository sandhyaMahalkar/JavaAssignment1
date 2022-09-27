//Question : 6) Write a program to add 2,3,4,5 numbers using functions
//Code:-

class A {
    int a, b, c, d, e;

    int Ad(int x, int y) {

        a = x;
        b = y;
        return a + b;

    }

    int Cj(int x,int y,int z)
    {
        a = x;
        b = y;
        c = z;
        return a+b+c;
    }
    int D(int w,int x,int y,int z)
    {
        a = w;
        b = x;
        c = y;
        d = z;
        return a+b+c+d;
    }
    int E(int v,int w,int x,int y,int z){
        a=v;
        b=w;
        c=x;
        d=y;
        e=z;
        return a+b+c+d+e;
    }

}
public class Addition{
    public static void main(String[] args)
    {
        A f = new A();
        int S;

        S= f.Ad(10,20);
        System.out.println("addtion of two numbers" + S);
        S = f.Cj(10,20,30);
        System.out.println("Addtion of Three numbers "+ S);
        S = f.D(10,20,30,40);
        System.out.println("Addition of Four numbers "+S);
        S = f.E(10,20,30,40,50);
        System.out.println("Addition of five numbers "+S);
    }
}


/*Output:
addtion of two numbers30
Addtion of Three numbers 60
Addition of Four numbers 100
Addition of five numbers 150

Process finished with exit code 0*/
