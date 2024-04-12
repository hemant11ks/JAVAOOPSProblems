public class ObjMethodPerson implements Cloneable {
    private String name;
    private int age;

    // Constructor
    public ObjMethodPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Implementing clone() method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Allows creating a copy of the Person object
    }

    // Implementing equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // If the compared object is the same instance
            return true;
        if (obj == null || getClass() != obj.getClass()) // If the compared object is null or of a different class
            return false;
            ObjMethodPerson person = (ObjMethodPerson) obj; // Casting the object to Person type for comparison
        return age == person.age && name.equals(person.name); // Comparing the attributes of both objects
    }

    // Implementing hashCode() method
    @Override
    public int hashCode() {
        int result = name.hashCode(); // Generating hash code based on name
        result = 31 * result + age; // Combining hash code with age
        return result;
    }

    // Implementing toString() method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        // Creating a Person object
        ObjMethodPerson person1 = new ObjMethodPerson("Alice", 30);

        // Cloning the Person object
        ObjMethodPerson person2 = null;
        try {
            person2 = (ObjMethodPerson) person1.clone(); // Cloning the person1 object
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Printing the objects
        System.out.println("Original: " + person1);
        System.out.println("------------------------------");
        System.out.println("Cloned: " + person2);
        System.out.println("------------------------------");

        // Testing equals() method
        System.out.println("Are they equal? " + person1.equals(person2)); // Comparing two objects for equality
        System.out.println("------------------------------");

        // Testing hashCode() method
        System.out.println("Hashcode of person1: " + person1.hashCode());
        System.out.println("------------------------------");
        System.out.println("Hashcode of person2: " + person2.hashCode());
        System.out.println("------------------------------");
    }
}
