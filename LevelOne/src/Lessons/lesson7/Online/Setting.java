package Lessons.lesson7.Online;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Setting extends JFrame {
    private static final int winWIDTH = 350;
    private static final int winHEIGHT = 250;

    private final int MinMapSize = 3;
    private final int MaxMapSize = 10;
    private final int MinWinLength = 3;
    private final String MapSizePrefix = "Map size is: ";
    private final String WinLenPrefix = "Win win len is: ";
//    private static final int winPosX = 675;
//    private static final int winPosY = 350;


    private MainWindows mainWindows;

    private JRadioButton humanVsHuman;
    private JRadioButton humanVsAI;
    private JRadioButton AIvsAI;
    private JSlider sliderSetSizeMap;
    private JSlider sliderSetWinLength;
    private JButton buttonStart;

    Setting(MainWindows mainWindows){
        this.mainWindows = mainWindows;
        Rectangle mainWindowBounds = mainWindows.getBounds();

        int posX = (int) mainWindowBounds.getCenterX() - winWIDTH / 2;
        int posY = (int) mainWindowBounds.getCenterY() - winHEIGHT / 2;

        setLocation(posX, posY);
        setSize(winWIDTH, winHEIGHT);
 //       setLocation(winPosX, winPosY);
        setTitle("Settings");
        setResizable(false);
        setLayout(new GridLayout(10, 1));

        setGameModeControl();
        setSizeMapControl();
        finishSetting();

    }

    private void setGameModeControl(){
    add(new JLabel("Choose your game mode"));
    humanVsHuman = new JRadioButton("Human vs. Human", true);
    humanVsAI = new JRadioButton("Human vs. AI");
    AIvsAI = new JRadioButton("AI vs. AI");

    ButtonGroup gameModeGroup = new ButtonGroup();
    gameModeGroup.add(humanVsAI);
    gameModeGroup.add(humanVsHuman);
    gameModeGroup.add(AIvsAI);

    add(humanVsHuman);
    add(humanVsAI);
    add(AIvsAI);
    }

    private void setSizeMapControl(){
        JLabel LbMapSize = new JLabel(MapSizePrefix + MinMapSize);
        JLabel LbWinLen = new JLabel(WinLenPrefix + MinWinLength);

        sliderSetSizeMap = new JSlider(MinMapSize, MaxMapSize, MinMapSize);
        sliderSetSizeMap.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
            int currentMapSize = sliderSetSizeMap.getValue();
            LbMapSize.setText(MapSizePrefix + currentMapSize);
            sliderSetWinLength.setMaximum(currentMapSize);
            }
        });


        sliderSetWinLength = new JSlider(MinWinLength, MaxMapSize, MinMapSize );
        sliderSetWinLength.addChangeListener(new ChangeListener() {
         @Override
         public void stateChanged(ChangeEvent e) {
             LbWinLen.setText(WinLenPrefix + sliderSetWinLength.getValue());
        }
        });


        add(new Label("Choose Map size"));
        add(LbMapSize);
        add(sliderSetSizeMap);
        add(LbWinLen);
        add(sliderSetWinLength);
    }

    private void finishSetting(){
    buttonStart = new JButton("Start Game");
    buttonStart.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            startNextGame();
        }
    });
    add(buttonStart);
    }

    private void startNextGame(){
        int gameMode;

        if(humanVsHuman.isSelected()){
            gameMode = GameMap.GM_HvsH;
        } else if (humanVsAI.isSelected()){
            gameMode = GameMap.GM_HvsAI;
        } else if (AIvsAI.isSelected()){
            gameMode = GameMap.GM_AIvsAI;
        } else {
            throw new RuntimeException("Invalid choose game mode");
        }

        int mapSize = sliderSetSizeMap.getValue();
        int winLen = sliderSetWinLength.getValue();

    mainWindows.getParamsFromSettingAndStartGame(mapSize, mapSize, winLen, gameMode);

    setVisible(false);
    }
}
