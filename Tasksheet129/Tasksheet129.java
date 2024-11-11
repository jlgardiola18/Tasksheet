package Tasksheet129;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
  
    @Override
    public boolean feed(boolean timeToEat) {
        //Put gorilla food into cage
        if (timeToEat) {
            System.out.println("Feed the gorilla.");
        } else {
            System.out.println("Don't feed.");
        }
        return timeToEat;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Groom the gorilla");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Pet the gorilla");
    }
}

public class Tasksheet129{
    public static void main(String[] args) {   

        Gorilla gorilla = new Gorilla();
        gorilla.feed(false);
        gorilla.groom();
        gorilla.pet();
        
    }
}