// Define an enum type called Day, representing the days of the week
enum Day {
    // Enum constants can have associated values or behaviors
    SUNDAY("Sunday", false),
    MONDAY("Monday", true),
    TUESDAY("Tuesday", true),
    WEDNESDAY("Wednesday", true),
    THURSDAY("Thursday", true),
    FRIDAY("Friday", true),
    SATURDAY("Saturday", false);

    // Enum fields
    private final String displayName;
    private final boolean isWeekday;

    // Constructor to initialize enum constants with values
    Day(String displayName, boolean isWeekday) {
        this.displayName = displayName;
        this.isWeekday = isWeekday;
    }

    // Getter methods
    public String getDisplayName() {
        return displayName;
    }

    public boolean isWeekday() {
        return isWeekday;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        // Using enum constants
        Day today = Day.MONDAY;

        // Accessing enum constant's associated values
        System.out.println(today.getDisplayName() + " is a weekday? " + today.isWeekday());

        // Switch statement to perform different actions based on the day
        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday. Work starts!");
                break;
            case FRIDAY:
                System.out.println("Today is Friday. It's almost the weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a weekday. Keep working!");
        }

        // Iterate over all the days using values() method of the enum
        System.out.println("All days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
