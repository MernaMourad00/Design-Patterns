package decorator.example2;

public class RedDecorator extends Decorator{
    public RedDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("red");
    }

}
