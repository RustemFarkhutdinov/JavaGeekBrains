package Lessons.lesson7.Online;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainWindows extends JFrame {
    private static final int winWIDTH = 500;
    private static final int winHEIGHT = 500;
    private static final int winPosX = 600;
    private static final int winPosY = 250;
    private Setting setting;
    private GameMap gameMap;

    MainWindows(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(winWIDTH, winHEIGHT);
        setLocation(winPosX, winPosY);
        setTitle("Game X/O");
        setResizable(false);

        setting = new Setting(this);
        gameMap = new GameMap();

        JButton buttonStartGame = new JButton("Start New Game");
        buttonStartGame.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setting.setVisible(true);
            }
        });

        JButton buttonExitGame = new JButton("Exit Game");
        buttonExitGame.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });

       JPanel panelForButton = new JPanel();
       panelForButton.setLayout(new GridLayout(1, 2));
       panelForButton.add(buttonStartGame);
       panelForButton.add(buttonExitGame);


        add(panelForButton, BorderLayout.SOUTH);
        add(gameMap);
        setVisible(true);
    }
    void getParamsFromSettingAndStartGame(int mapSizeX, int mapSizeY, int winLength, int madeGame) {
        gameMap.startGameWithParams(mapSizeX, mapSizeY, winLength, madeGame);
    }
}
