package Tasksheet115;

public class Task115{   // late sir, nag brown out
    public static void main(String[] args) {
        
        String a = new String("Wow");
        String c = "Wow!";
        String b = a;
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        // System.out.println(b3);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }

    }
}