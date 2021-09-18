package prac4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class prac4 extends JFrame{
    JButton but1 = new JButton("AC MILAN");
    JButton but2 = new JButton("REAL MADRID");
    JLabel lbl1 = new JLabel("Result 0 X 0");
    JLabel lbl2 = new JLabel("Last Scorer N/A");
    JLabel lbl3 = new JLabel("Winner DRAW");
    private static int mil;
    private static int rm;

    public prac4() {
        setLayout(null);
        setSize(600, 200);
        but1.setBounds(20, 20, 220, 50);
        but2.setBounds(360, 20, 220, 50);
        lbl1.setHorizontalAlignment(JLabel.CENTER);
        lbl1.setBounds(240, 20, 120, 30);
        lbl2.setHorizontalAlignment(JLabel.CENTER);
        lbl2.setBounds(225, 100, 150, 30);
        lbl3.setHorizontalAlignment(JLabel.CENTER);
        lbl3.setBounds(225, 130, 150, 30);
        mil=0;
        rm=0;
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mil+=1;
                lbl1.setText("Result: " + mil + " X " + rm);
                lbl2.setText("Last Scorer: AC Milan");
                if (mil > rm) lbl3.setText("Winner: AC Milan");
                else if (mil == rm) lbl3.setText("Winner: DRAW");
                else lbl3.setText("Winner: Real Madrid");
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rm += 1;
                lbl1.setText("Result: " + mil + " X " + rm);
                lbl2.setText("Last Scorer: Real Madrid");
                if (mil > rm) lbl3.setText("Winner: AC Milan");
                else if (mil == rm) lbl3.setText("Winner: DRAW");
                else lbl3.setText("Winner: Real Madrid");
            }
        });
        add(but1);
        add(but2);
        add(lbl1);
        add(lbl2);
        add(lbl3);
    }

    public static void main(String[]args)
    {
        new prac4().setVisible(true);
    }
}

