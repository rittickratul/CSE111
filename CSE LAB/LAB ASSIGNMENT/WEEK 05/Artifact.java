public class Artifact {
    private static String name;
    private static String owner;
    private static Artifact[] vault = new Artifact[4];
    private static int count;
    public static int power;
    public static int max;
    public static String strongest;

    public Artifact(String n) {
        this(n, "Okabe");
    }

    public Artifact(String n, String o) {
        name = n;
        owner = o;
        power = CalcPower();

    }

    public static void AddtoVault(Artifact a) {
        if (count < 4) {
            vault[count] = a;
            System.out.println(a.getOwner() + " added " + a.GetName() + " successfully to the vault");
            count++;
        } else {
            System.out.println("!!! "+a.getOwner() + " unsuccessful in adding artifact to the vault!!");
        }
    }

    public String GetName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int CalcPower() {
        if (name.length() % 2 == 0) {
            int sum = 0;
            for (int i = 0; i < name.length(); i++) {
                int a = (int) name.charAt(i);
                sum += a;
            }
            power = sum;
        } else {
            int sum = 0;
            for (int i = 0; i < name.length(); i++) {
                int a = (int) name.charAt(i);
                sum += a;
            }
            power = sum;
        }
        return power;
    }

    public static void labReport() {
        System.out.println("=== Future Gadget Lab ===");
        for (int i = 0; i < count; i++) {
            System.out.println(vault[i].name + " added by " + vault[i].owner + " has power of " + vault[i].power + ".");
        }
    }

    public void revealArtifact() {
        System.out.println(GetName()+" addrd by "+getOwner()+" has power of "+this.power);
    }

    public void changeName(String n) {
        name = n;
        power = CalcPower();
        System.out.println("Name changed and power recalculated.");   
    }

    public static String strongest() {
        for(int i = 0;i<count;i++){
            if(max<vault[i].power){
                max = vault[i].power;
                strongest = vault[i].name;
            }
        }
        return strongest;
    }
}
