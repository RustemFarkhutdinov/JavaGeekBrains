package Lessons.lesson7.Online;

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {

    public static final int GM_HvsH = 0;
    public static final int GM_HvsAI = 1;
    public static final int GM_AIvsAI = -1;

    GameMap(){
        setBackground(new Color(116, 149, 226));
    }
    void startGameWithParams(int mapSizeX, int mapSizeY, int winLength, int modeGame){
    System.out.println("mapSizeX = " + mapSizeX + ". mapSizeY= " + mapSizeY + ". winLength = "  + winLength + ". You Play with = " + + modeGame);
    }
}
