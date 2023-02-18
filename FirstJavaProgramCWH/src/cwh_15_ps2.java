public class cwh_15_ps2 {
    public static void main(String[] args) {
        // Problem 1
        String name = "Jack Parker";
        String lower = name.toLowerCase();
        System.out.println(lower);

        // Problem 2
        String text = "To Lower Case";
        String newString = text.replace(" ", "_");
        System.out.println(newString);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Krishan");
        System.out.println(letter);
    }
}
