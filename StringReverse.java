// Write a program to reverse a given string e.g.("Hello World")
public class StringReverse {
        public static void main(String[] args) {
            String input = "Hello World";
            // StringBuilder is a claass which is mutable
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("Reversed: " + reversed);
        }
        
}


