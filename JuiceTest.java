public class JuiceTest {

    public static void main(String[] args) {
        // Creating objects of Mango, Water, Ice, and Sugar
        Mango mango = new Mango();
        mango.setFruitName("Mango");
        mango.setColor("Yellow");
        mango.setType("Alphonso");
        mango.setRipe(true);
        mango.setWeight(1.5f);
        mango.setTaste("Sweet");
        mango.setVitaminCContent(25); // in mg

        Water water = new Water();
        water.setType("Mineral");
        water.setTemperature(23.5f);
        water.setQuantity(100); // in ML

        Ice ice = new Ice();
        ice.setShape("Cube");
        ice.setQuantity(3.0f);
        ice.setType("Crushed");

        Sugar sugar = new Sugar();
        sugar.setType("Organic");
        sugar.setColor("Brown");
        sugar.setQuantity(1.0f); // one tablespoon

        // Creating a Kitchen object
        Kitchen kitchen = new Kitchen();

        // Preparing juice with Mango, Ice, Water, and Sugar
        Juice mangoJuice = kitchen.prepareJuice(mango, ice, water, sugar);
        System.out.println("Mango Juice: " + mangoJuice);
    }
}

class Kitchen {

    Juice prepareJuice(Fruit fruit, Ice ice, Water water, Sugar sugar) {
        System.out.println("Preparing juice...");
        Juice juice = new Juice();
        juice.setColor(fruit.getColor());
        juice.setFiltered(true);
        juice.setQuantity(fruit.getWeight() + water.getQuantity() + ice.getQuantity() + sugar.getQuantity());
        juice.setTemperature(water.getTemperature() - ice.getQuantity());
        juice.setType(fruit.getType() + " " + fruit.getFruitName() + " Juice");
        return juice;
    }
}

class Fruit {
    private String fruitName;
    private String type;
    private float weight;
    private String color;
    private boolean ripe;

    // Getters and setters for Fruit properties
    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRipe() {
        return ripe;
    }

    public void setRipe(boolean ripe) {
        this.ripe = ripe;
    }
}

class Mango extends Fruit {
    private String taste;
    private int vitaminCContent;

    // Getters and setters for Mango properties
    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getVitaminCContent() {
        return vitaminCContent;
    }

    public void setVitaminCContent(int vitaminCContent) {
        this.vitaminCContent = vitaminCContent;
    }
}

class Water {
    private String type;
    private float quantity;
    private float temperature;

    // Getters and setters for Water properties
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}

class Ice {
    private String type;
    private float quantity;
    private String shape;

    // Getters and setters for Ice properties
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}

class Sugar {
    private String type;
    private float quantity;
    private String color;

    // Getters and setters for Sugar properties
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Juice {
    private float quantity; // In ML
    private String type;
    private float temperature;
    private boolean filtered; // true / false
    private String color;

    // Getters and setters for Juice properties
    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public boolean isFiltered() {
        return filtered;
    }

    public void setFiltered(boolean filtered) {
        this.filtered = filtered;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Juice [quantity=" + quantity + ", type=" + type + ", temperature=" + temperature + ", filtered="
                + filtered + ", color=" + color + "]";
    }
}
