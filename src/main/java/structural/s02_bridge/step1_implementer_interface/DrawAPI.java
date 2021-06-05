package structural.s02_bridge.step1_implementer_interface;

public interface DrawAPI {
    String DRAW = "Drawing circle [ color: %-10s, radius: %-5d, x: %-5d, y: %-5d ]";

    void drawCircle(int radius, int x, int y);
}
