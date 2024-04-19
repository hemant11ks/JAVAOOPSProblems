public class TextFormat {

    public static void main(String[] args) {
        String bulletIt = "Print a Bullet List:" + "\t\u2022 First Point" + "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                \u2022 First Point
                \u2022 Sub Point""";
                System.out.println(textBlock);

                // Format number
                int age = 25;
                System.out.printf("Your age is %d%n", age);

                int yearOfBirth = 2023 - age;
                System.out.printf("Age = %d, Birth year = %d", age, yearOfBirth);

                System.out.printf("Your age is %.2f%n", (float) age);

                for(int i =1; i<=10; i*= 10){
                    System.out.printf("Printing %6d %n", i);
                }

                String formattedString = String.format("Your age is %d", age);
                System.out.println(formattedString);

                formattedString = "Your age is %d".formatted(age);
                System.out.println(formattedString);

                // Complex Format Specifiers
                // %[argument_index$][flags][width][.precision]conversion


    }
    
}
