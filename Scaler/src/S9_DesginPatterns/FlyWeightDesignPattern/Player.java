package S9_DesginPatterns.FlyWeightDesignPattern;

public class Player {
    Point currrentPosition;
    int currentHealth;
    int score;
    int direction;
    PlayerFlyWeight pfw;

    public Player(Point currrentPosition, int currentHealth, int score, int direction, PlayerFlyWeight pfw) {
        this.currrentPosition = currrentPosition;
        this.currentHealth = currentHealth;
        this.score = score;
        this.direction = direction;
        this.pfw = pfw;
    }
}
