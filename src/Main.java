public class Main {
    public static void main(String[] args) {
        System.out.println("Любимое время года: " + favorite + "\nСредняя температура: " + favorite.Temperature + "\nКлимат: " + favorite.getDescription() + "\n");
        Main.iLike(Seasons.ЗИМА);
        Main.printAll();
    }

    public enum Seasons {
        ЗИМА(-14),
        ВЕСНА(4),
        ЛЕТО(15){
            public String getDescription(){
                return "теплое время года";
            }
        },
        ОСЕНЬ(4);

        int Temperature;
        Seasons(int temperature) {
            Temperature = temperature;
        }

        public String getDescription(){
            return "холодное время года";
        }
    }

    static Seasons favorite = Seasons.ЗИМА;

    public static void iLike(Seasons Like){
        switch (Like){
            case ЗИМА:
                System.out.println("Я люблю зиму");
                break;
            case ВЕСНА:
                System.out.println("Я люблю весну");
                break;
            case ЛЕТО:
                System.out.println("Я люблю лето");
                break;
            case ОСЕНЬ:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void printAll(){
        Seasons season[] = Seasons.values();
        for (Seasons  all: season){
            System.out.println(all);
            System.out.println(all.Temperature);
            System.out.println(all.getDescription());
            System.out.println("\n");
        }

    }
}