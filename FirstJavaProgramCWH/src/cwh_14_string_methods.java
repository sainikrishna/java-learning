public class cwh_14_string_methods {
    public static void main(String[] args) {
        String name = "Krishan Saini";
        int length = name.length();
        System.out.println(length);
        // To Lower Case
        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase);
        // To Upper Case
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);
        // trim
        String nonTrimmedString = "     Krishan      ";
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        // Substring
        String sub = name.substring(0);
        System.out.println(sub);
        // Replace
        String newString = name.replace("i", "N");
        System.out.println(newString);
        // Starts With
        System.out.println(name.startsWith("Kris"));
        System.out.println(name.startsWith("Saini"));
        // Ends With
        System.out.println(name.endsWith("ni"));
        System.out.println(name.endsWith("Kri"));
        // Character at index
        System.out.print("Chat at 8 is: ");
        System.out.println(name.charAt(8));
        System.out.print("Chat at 7 is: ");
        System.out.println(name.charAt(9));

        // Index Of
        System.out.println(name.indexOf("sh"));
        System.out.println(name.indexOf("a", 6));

        // Last Index Of
        System.out.println(name.lastIndexOf("a", 5));

        // Equals
        System.out.println(name.equalsIgnoreCase("krishan Saini"));

        // Escape Sequence
        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \\ back slash");
        System.out.println("I am escape sequence \n new line");
        System.out.println("I am escape sequence \t tab");
    }
}
