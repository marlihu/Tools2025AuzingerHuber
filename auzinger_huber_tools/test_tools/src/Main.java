// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Eingabe with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Umschalt+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Umschalt+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Strg+F8.
            System.out.println("i = " + i);
            String newString = "New line of code";
        }

        thisIsANewMethod();
        anotherNewMethod();
        guessWhatEvenMoreMethods(69);
    }

    public static void thisIsANewMethod() {
        System.out.println("Merge conflict in nano, geil!");
        int i = 0;
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
    }

    public static void anotherNewMethod() {
        String string = "wow";
        System.out.println(string);

        String anotherString;
        anotherString = "another one";
    }

    public int getNumber() {
        return 0;
    }

    public static void guessWhatEvenMoreMethods(int thisIsAnIntegerParameter) {
        System.out.println("Given parameter: " + thisIsAnIntegerParameter);
    }
}
