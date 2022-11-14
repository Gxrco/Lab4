package UI;

import Model.CarB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class PCards extends JFrame{

    private JList<String> cardList = new JList<>();
    private JPanel cardsPanel;
    private JButton closeButton;
    private JButton showButton;
    private JTable table1;

    private static JFrame frame;

    private DefaultTableModel model = (DefaultTableModel) table1.getModel();


    public PCards(){

        setContentPane(cardsPanel);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Presentation Cards.");

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addColumn("Presentation Cards");
                carBoard.carB_.getPresentationCards();
                for (int i = 0; i < carBoard.carB_.cards.size(); i++) {
                    model.addRow(new String[]{carBoard.carB_.cards.get(i)});
                }
            }

        });


        closeButton.addComponentListener(new ComponentAdapter() {
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}
