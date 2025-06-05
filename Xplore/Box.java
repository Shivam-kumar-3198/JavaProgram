public class Box {
    private static int width;

    public Box(int width) {
        Box.width = width;
    }

    public static int getWidth() {
        return width;
    }

    public static void setWidth(int width) {
        Box.width = width;
    }

    @Override
    public String toString() {
        return "Box width: " + width;
    }

    public static void main(String[] args) {
        Box b1 = new Box(10);
        System.out.println(b1); // Box width: 10

        Box b2 = new Box(20);
        System.out.println(b1); // Box width: 20
        System.out.println(b2); // Box width: 20
    }
}
