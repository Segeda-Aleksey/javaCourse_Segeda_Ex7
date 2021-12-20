import java.awt.*;

public enum Season {

    WINTER(Color.WHITE),
    SPRING(Color.BLUE),
    SUMMER(Color.GREEN),
    AUTUMN(Color.YELLOW);

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    Season(Color color) {
        this.color = color;
    }



//    @Override
//    public String toString() {
//        return
//                "Season{" +
//                "color=" + color +
//                '}';
//    }
}
