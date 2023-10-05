package by.volontirov.wtlab1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {
    private List<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public int getBallsWeight() {
        return balls.stream()
                .collect(Collectors.summingInt(Ball::getWeight));
    }

    public long getBlueBallsCount() {
        return balls.stream()
                .filter(ball -> ball.getColor() == Color.BLUE)
                .count();
    }
}
