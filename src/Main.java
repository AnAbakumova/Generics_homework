public class Main {
    public static void main(String[] args) {
        MagicBox<String> boxOfNames = new MagicBox<>(2);
        boxOfNames.add("Petya");
        boxOfNames.add("Kolya");
        boxOfNames.add("Anya");

        MagicBox<Integer> boxOfYears = new MagicBox<>(2);
        boxOfYears.add(1994);
        boxOfYears.add(1985);
        boxOfYears.add(2001);

        System.out.println(boxOfNames);
        System.out.println(boxOfNames.pick());
        System.out.println(boxOfYears);
        System.out.println(boxOfYears.pick());

    }
}