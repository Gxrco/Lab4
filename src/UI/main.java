package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame {

    private static JFrame frame;
    private JCheckBox typeACB;
    private JPanel mainPanel;
    private JCheckBox typeBCB;
    private JCheckBox typeCCB;
    private JButton okButton;
    private JButton cancelButton;

    public String carType;


    public static void main(String[] args) {
        frame = new JFrame("Menú Principal");
        frame.setContentPane(new main().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public main() {

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(typeACB.isSelected()){
                    carType = "A";
                    typeBCB.setSelected(false);
                    typeCCB.setSelected(false);
                    carBoard carBoard_ = new carBoard(carType);

                    carBoard_.setVisible(true);
                }
                else if (typeBCB.isSelected()){
                    carType = "B";
                    typeACB.setSelected(false);
                    typeCCB.setSelected(false);
                    carBoard carBoard_ = new carBoard(carType);
                    carBoard_.setVisible(true);
                }
                else if (typeCCB.isSelected()){
                    carType = "C";
                    typeACB.setSelected(false);
                    typeBCB.setSelected(false);
                    carBoard carBoard_ = new carBoard(carType);
                    carBoard_.setVisible(true);
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });


    }
}
