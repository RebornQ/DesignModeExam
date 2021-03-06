package _1_Creational_Pattern.Exam1.work_1_FactoryMethodPattern;

import _1_Creational_Pattern.Exam1.work_1_FactoryMethodPattern.factory.Factory;
import _1_Creational_Pattern.Exam1.work_1_FactoryMethodPattern.player.Player;
import _1_Creational_Pattern.Exam1.work_1_FactoryMethodPattern.playmode.PlayMode;

public class Test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        PlayMode mode = factory.createMode(0); // Easy
        Player player1 = factory.createPlayer(0);// Human
        Player player2 = factory.createPlayer(1);// Computer
        mode.getMode();
        player1.play();
        player2.play();
    }
}
