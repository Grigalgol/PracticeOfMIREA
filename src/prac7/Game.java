package prac7;

import prac4.prac4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Stack;

public class Game extends JFrame {
    JButton addButton = new JButton("ADD");
    JButton playButton = new JButton("PLAY");
    JButton resetButton = new JButton("RESET");

    JLabel playerOne = new JLabel("Player 1");
    JLabel playerTwo = new JLabel("Player 2");
    JLabel winner = new JLabel("");
    JLabel winnerText = new JLabel("WINNER:");
    JLabel cardsOfPlayerOne = new JLabel("");
    JLabel cardsOfPlayerTwo = new JLabel("");

    JTextField cards = new JTextField(10);


    public Game() {
        super("Card Game");
        setLayout(null);
        setSize(600, 300);
        this.setDefaultCloseOperation(prac4.EXIT_ON_CLOSE);

        Stack<Integer> firstPlayer = new Stack<>();
        Stack<Integer> secondPlayer = new Stack<>();

        Font fontFoButtons = new Font("Times new Roman", Font.BOLD, 12);
        Font fontFoText = new Font("Times new Roman", Font.BOLD, 14);

        addButton.setBounds(225, 60, 150, 30);
        addButton.setFont(fontFoButtons);
        add(addButton);

        playButton.setBounds(225, 100, 150, 30);
        playButton.setFont(fontFoButtons);
        add(playButton);

        resetButton.setBounds(225, 220, 150, 30);
        resetButton.setFont(fontFoButtons);
        add(resetButton);

        cards.setBounds(250, 30, 100, 25);
        add(cards);

        playerOne.setHorizontalAlignment(JLabel.CENTER);
        playerOne.setFont(fontFoText);
        playerOne.setBounds(50, 45, 100, 20);
        add(playerOne);

        playerTwo.setHorizontalAlignment(JLabel.CENTER);
        playerTwo.setFont(fontFoText);
        playerTwo.setBounds(425, 45, 100, 20);
        add(playerTwo);

        cardsOfPlayerOne.setHorizontalAlignment(JLabel.CENTER);
        cardsOfPlayerOne.setFont(fontFoText);
        cardsOfPlayerOne.setBounds(50, 70, 100, 20);
        add(cardsOfPlayerOne);

        cardsOfPlayerTwo.setHorizontalAlignment(JLabel.CENTER);
        cardsOfPlayerTwo.setFont(fontFoText);
        cardsOfPlayerTwo.setBounds(425, 70, 100, 20);
        add(cardsOfPlayerTwo);

        winnerText.setHorizontalAlignment(JLabel.CENTER);
        winnerText.setFont(fontFoText);
        winnerText.setBounds(225, 140, 150, 20);
        add(winnerText);

        winner.setHorizontalAlignment(JLabel.CENTER);
        winner.setFont(fontFoText);
        winner.setBounds(225, 170, 150, 20);
        add(winner);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cardsString = cards.getText();
                int[] numArr = Arrays.stream(cardsString.split(" ")).mapToInt(Integer::parseInt).toArray();
                if (firstPlayer.size() == 0) {
                    for (int x : numArr) {
                        firstPlayer.add(x);
                    }
                    cardsOfPlayerOne.setText(cardsString);
                } else {
                    for (int x : numArr) {
                        secondPlayer.add(x);
                    }
                    cardsOfPlayerTwo.setText(cardsString);
                }
            }
        });

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                winner.setText(playStart(firstPlayer, secondPlayer));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstPlayer.clear();
                secondPlayer.clear();
                cardsOfPlayerOne.setText("");
                cardsOfPlayerTwo.setText("");
                winner.setText("");
            }
        });
    }

    private String playStart(Stack<Integer> firstPlayer, Stack<Integer> secondPlayer) {
        int count = 0;
        for (int i = 0; i < 106; i++) {
            count++;
            if(firstPlayer.get(0) > secondPlayer.get(0) || firstPlayer.get(0) == 0 && secondPlayer.get(0) == 9 ) {
                firstPlayer.add(firstPlayer.get(0));
                firstPlayer.add(secondPlayer.get(0));
            }
            else if(firstPlayer.get(0) < secondPlayer.get(0) || firstPlayer.get(0) == 9 && secondPlayer.get(0) == 0 ) {
                secondPlayer.add(secondPlayer.get(0));
                secondPlayer.add(firstPlayer.get(0));
            }
            firstPlayer.remove(0);
            secondPlayer.remove(0);

            if(firstPlayer.size() == 0) return "Player 2 with " + count + " moves";
            if(secondPlayer.size() == 0) return "Player 1 with " + count + " moves";
        }
            return "Botva";
    }

    public static void main(String[] args) {
        new Game().setVisible(true);
    }
}
