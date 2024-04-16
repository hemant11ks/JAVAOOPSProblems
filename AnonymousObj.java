class A{
    
public A(){
    System.out.println("Object created");
}

    public void show(){
        System.out.println("In A show");
    }
}

public class AnonymousObj {
    public static void main(String s[]){
        
        // There is no var in stack it also in heap memory
        // If we print this it will show only Object created.
        // This type of obj are called anonymous obj they dont have name
        // there is no reference adn we cant reuse them they created in heap
        // Example: 
        new A().show();
        new A().show(); // Create again new object
        // new A(); // Its object creation

        

         // We can also do
        //  A obj;
        //  obj = new A();
        //  obj.show();

        // A obj = new A(); // obj is basically a reference variable because it refer object
        // obj.show();
    }
}