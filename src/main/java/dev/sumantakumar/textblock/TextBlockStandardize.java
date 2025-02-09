package dev.sumantakumar.textblock;

public class TextBlockStandardize {
    public static void main(String[] args) {
        String withoutTextBlock = "Hello World!," +
                "\nThis is a Simple String." +
                "\nPlease use \"Text Block!\"";

        System.out.println(withoutTextBlock);
        System.out.println("=================");
        String withTextBlock = """
                Hello World!,
                This is a q text block.
                Thanks for using "Text Block!"
                """;

        System.out.println(withTextBlock);
    }
}
