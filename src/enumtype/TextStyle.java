package enumtype;

import java.util.Set;

//@Getter
//@AllArgsConstructor
public enum TextStyle {
    BOLD(1), ITALIC(2), UNDERLINE(4), STRIKETHROUGH(8);

    private final int code;

    public int getCode() {
        return code;
    }

    TextStyle(int code) {
        this.code = code;
    }

    public static int getStyleCode(Set<TextStyle> styles){
        return styles.stream().mapToInt(TextStyle::getCode).sum();
    }
}

// int styleCode = TextStyle.getStyleCode(Enumset.of(TextStyle.BOLD, TextStyle.ITALIC));

class TextStyleUtil{
    public static final int STYLE_BOLD = 1 << 0; // 1
    public static final int STYLE_ITALIC = 1 << 1; // 2
    public static final int STYLE_UNDERLINE = 1 << 2; // 4
    public static final int STYLE_STRIKETHROUGH = 1 << 3; // 8
}
