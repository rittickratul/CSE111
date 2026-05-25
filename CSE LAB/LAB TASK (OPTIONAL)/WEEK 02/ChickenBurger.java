public class ChickenBurger {
    public String bun;
    public int price;
    public String sauceOption;
    public String spiceLevel;
    public String [] validSpices = {"Mild", "Spicy", "Naga", "Extreme"};
    public ChickenBurger() {
        this.bun = "Sesame";
        this.price = 200;
        this.sauceOption = "Less";
        this.spiceLevel = "Not Set";
    }
    public void customizeSpiceLevel(String level) {
        boolean found = false;
        for (String s : validSpices) {
            if (s.equals(level)) {
                found = true;
                break;
            }
        }
        if (found) {
            this.spiceLevel = level;
            System.out.println("Spice level set to " + level + ".");
        } else {
            System.out.println("This spice level is unavailable.");
        }
    }
    public String serveBurger() {
        if (this.spiceLevel.equals("Not Set")) {
            return "Cannot serve now. Customize Spice Level first.";
        } else {
            return "The burger is being served:-\n" +
                   "Bun Type: " + this.bun + "\n" +
                   "Price: " + this.price + "\n" +
                   "Sauce Option: " + this.sauceOption + "\n" +
                   "Spice Level: " + this.spiceLevel;
        }
    }
}