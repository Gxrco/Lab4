package UI;

import Model.Trip;
import UI.carBoard;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TripData extends JFrame{
    private JTextField dayTXT;
    private JPanel tripPanel;
    private JTextField hourTXT;
    private JTextField placeTXT;
    private JTextField lenghtTXT;
    private JTextField objTXT;
    private JButton okButton;
    private JButton cancelButton;

    private static JFrame frame;


    public TripData(){

        setContentPane(tripPanel);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Trip Data.");

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(dayTXT.getText().equalsIgnoreCase("") || hourTXT.getText().equalsIgnoreCase("") || placeTXT.getText().equalsIgnoreCase("") || lenghtTXT.getText().equalsIgnoreCase("") || objTXT.getText().equalsIgnoreCase("")){
                    carBoard.carA_.getPtrips().add(new Trip(dayTXT.getText(), hourTXT.getText(), placeTXT.getText(), lenghtTXT.getText(), objTXT.getText()));
                    JOptionPane.showMessageDialog(null, "You have assigned a new to trip with destination to: " + placeTXT);
                    frame.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Complete all fields.");
                }
            }
        });
    }

}
