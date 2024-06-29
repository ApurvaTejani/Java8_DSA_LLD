package S9_DesginPatterns.FlyWeightDesignPattern;

import java.awt.*;

public class PlayerFlyWeight {
    int offensePower;
    int initialHealth;
    Image avatar;

    public PlayerFlyWeight(int offensePower, int initialHealth, Image avatar) {
        this.offensePower = offensePower;
        this.initialHealth = initialHealth;
        this.avatar = avatar;
    }
}
