package Tasksheet112;

public class Main { // tasksheet-1-1-2

    public static void main (String[] args){

        int x = 1, y = 2;   // 32423
          
        int z = x += y; // x = 3 , y = 2 , z = 3
        System.out.println(z);

        z = z -= (x -= y); // x = 1 , y = 2, z = 2
        System.out.println(z);

        z = z *= y; // x = 1 , y = 2 , z = 4
        System.out.println(z);

        z = z /= y; // x = 1 , y = 2, z = 2
        System.out.println(z);

        z = z += y += (z *= y += x); // x = 1 , y = 8 , z = 10
        z = z %= y -= x; // x = 1 , y = 7 , z = 3
        System.out.println(z);

        // int x = 2, z = 3;
        // x = x * z;
        // x *= z;
        // System.out.println(x);

    }
}
