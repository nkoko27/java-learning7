public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point \n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                            \u2022 First Point
                                \u2022 Sub point""";
        System.out.println(textBlock);
        int age = 35;
        System.out.printf("Your age is %d%n", age);
        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        for (int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %6d %n", i);
        }
    }
}
