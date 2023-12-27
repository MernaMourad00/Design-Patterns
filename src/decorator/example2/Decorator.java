package decorator.example2;

public class Decorator implements Shape{

    Shape shape;

    public Decorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
