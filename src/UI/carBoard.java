package UI;

import Model.CarA;
import Model.CarB;
import Model.CarC;
import Model.Song;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * The type Car board.
 */
public class carBoard extends JFrame{

    /**
     * The Volume.
     */
    int volume = 0;

    /**
     * The Station.
     */
    float station = 100.0F;

    private String carType;
    private JPanel cbPanel;
    private JButton volumeUpButton;
    private JButton volumeDownButton;
    private JButton FMModeButton;
    private JButton AMModeButton;
    private JButton stationButton;
    private JButton stationButton1;
    private JButton saveStationButton;
    private JButton chargeStationButton;
    private JComboBox songCB;
    private JButton selectButton;
    private JButton nextButton;
    private JButton previousButton;
    private JRadioButton turnOnARadioButton;
    private JRadioButton radioModeRadioButton;
    private JRadioButton reproductionModeRadioButton;
    private JRadioButton CDRadioButton;
    private JRadioButton MP3RadioButton;
    private JRadioButton spotifyRadioButton1;
    private JRadioButton phoneModeRadioButton;
    private JRadioButton connectDisconnectRadioButton;
    private JComboBox callCB;
    private JButton callButton;
    private JButton endCallButton;
    private JRadioButton speakerONOFFRadioButton;
    private JRadioButton productivityModeRadioButton;
    private JButton planTripButton;
    private JButton typeAButton;
    private JButton typeBButton;
    private JButton typeCButton;
    private JRadioButton turnOnBRadioButton;
    private JButton volumeUpButton1;
    private JButton volumeDownButton1;
    private JRadioButton radioModeRadioButton1;
    private JButton FMModeButton1;
    private JButton AMModeButton1;
    private JButton stationButton2;
    private JButton stationButton3;
    private JButton saveStationButton1;
    private JButton chargeStationButton1;
    private JRadioButton reproductionModeRadioButton1;
    private JRadioButton CDRadioButton1;
    private JRadioButton MP3RadioButton1;
    private JRadioButton spotifyRadioButton;
    private JComboBox songCB1;
    private JButton selectButton1;
    private JRadioButton phoneModeRadioButton1;
    private JRadioButton connectDisconnectRadioButton1;
    private JButton nextButton1;
    private JButton previousButton1;
    private JComboBox callCB1;
    private JButton callButton1;
    private JButton endCallButton1;
    private JButton callLastContactButton;
    private JButton showPresentationCardsButton;
    private JComboBox<Float> stationCB;
    private JComboBox stationCB1;
    private JRadioButton productivityModeRadioButton1;
    private JButton volumeUpButton2;
    private JButton volumeDownButton2;
    private JRadioButton turnOnCRadioButton;
    private JRadioButton radioModeRadioButton2;
    private JButton FMModeButton2;
    private JButton AMModeButton2;
    private JButton stationButton4;
    private JButton stationButton5;
    private JButton saveStationButton2;
    private JComboBox stationCB2;
    private JButton chargeStationButton2;
    private JRadioButton reproductionModeRadioButton2;
    private JRadioButton CDRadioButton2;
    private JRadioButton MP3RadioButton2;
    private JRadioButton spotifyRadioButton2;
    private JComboBox songCB2;
    private JButton selectButton2;
    private JButton nextButton2;
    private JButton previousButton2;
    private JRadioButton phoneModeRadioButton2;
    private JRadioButton connectDisconnectRadioButton2;
    private JComboBox callCB2;
    private JButton callButton2;
    private JButton endCallButton2;
    private JButton putCallOnWaitButton;
    private JRadioButton productivityModeRadioButton2;
    private JButton weatherForecastButton;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;

    /**
     * The constant carA_.
     */
    public static CarA carA_ = new CarA();

    /**
     * The constant carB_.
     */
    public static CarB carB_ = new CarB();

    /**
     * The constant carC_.
     */
    public static CarC carC_ = new CarC();

    /**
     * Instantiates a new Car board.
     *
     * @param carType the car type
     */
    public carBoard(String carType) {

        enableButtons(carType);
        hideB();

        setContentPane(cbPanel);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Car Board.");
        setSize(800, 600);

        carA_.Contacts.add("Carlos - +502 2280 9876");
        carA_.Contacts.add("Juan - +502 3981 9556");
        carA_.Contacts.add("Pedro - +502 2760 3826");
        carA_.Contacts.add("Nate - +502 2980 8536");
        carA_.Contacts.add("Daniel - +502 1890 4040");

        carB_.Contacts.add("Carlos - +502 2280 9876");
        carB_.Contacts.add("Juan - +502 3981 9556");
        carB_.Contacts.add("Pedro - +502 2760 3826");
        carB_.Contacts.add("Nate - +502 2980 8536");
        carB_.Contacts.add("Daniel - +502 1890 4040");

        carC_.Contacts.add("Carlos - +502 2280 9876");
        carC_.Contacts.add("Juan - +502 3981 9556");
        carC_.Contacts.add("Pedro - +502 2760 3826");
        carC_.Contacts.add("Nate - +502 2980 8536");
        carC_.Contacts.add("Daniel - +502 1890 4040");

        carA_.CD.add(new Song("tokyo", "RM", "mono.", "3:28", "Pop", "1"));
        carA_.CD.add(new Song("seoul (prod. HONNE)", "RM", "mono.", "4:35", "Pop", "2"));
        carA_.CD.add(new Song("moonchild", "RM", "mono.", "3:25", "Pop", "3"));
        carA_.CD.add(new Song("badbye", "RM", "mono.", "1:52", "Pop", "4"));
        carA_.CD.add(new Song("uhgood", "RM", "mono.", "3:14", "Pop", "5"));

        carA_.Spotify.add(new Song("THE BADDEST", "ALL OUT", "K\\DA", "2:42", "K-Pop", "1"));
        carA_.Spotify.add(new Song("MORE", "ALL OUT", "K\\DA", "3:37", "K-Pop", "2"));
        carA_.Spotify.add(new Song("VILLAIN", "ALL OUT", "K\\DA", "3:19", "K-Pop", "3"));
        carA_.Spotify.add(new Song("DRUM GO DUM", "ALL OUT", "K\\DA", "3:20", "K-Pop", "4"));
        carA_.Spotify.add(new Song("I'LL SHOW YOU", "ALL OUT", "K\\DA", "3:18", "K-Pop", "5"));

        carA_.Mp3.add(new Song("Poison", "LOST & FOUND", "Jackson Wang", "3:12", "Pop", "1"));
        carA_.Mp3.add(new Song("Dead", "LOST & FOUND", "Jackson Wang", "2:19", "Pop", "2"));
        carA_.Mp3.add(new Song("I Don't Have It", "LOST & FOUND", "Jackson Wang", "3:07", "Pop", "3"));
        carA_.Mp3.add(new Song("Power", "LOST & FOUND", "Jackson Wang", "3:10", "Pop", "4"));
        carA_.Mp3.add(new Song("Blackout", "LOST & FOUND", "Jackson Wang", "2:36", "Pop", "5"));

        carB_.CD.add(new Song("tokyo", "RM", "mono.", "3:28", "Pop", "1"));
        carB_.CD.add(new Song("seoul (prod. HONNE)", "RM", "mono.", "4:35", "Pop", "2"));
        carB_.CD.add(new Song("moonchild", "RM", "mono.", "3:25", "Pop", "3"));
        carB_.CD.add(new Song("badbye", "RM", "mono.", "1:52", "Pop", "4"));
        carB_.CD.add(new Song("uhgood", "RM", "mono.", "3:14", "Pop", "5"));

        carB_.Spotify.add(new Song("THE BADDEST", "ALL OUT", "K\\DA", "2:42", "K-Pop", "1"));
        carB_.Spotify.add(new Song("MORE", "ALL OUT", "K\\DA", "3:37", "K-Pop", "2"));
        carB_.Spotify.add(new Song("VILLAIN", "ALL OUT", "K\\DA", "3:19", "K-Pop", "3"));
        carB_.Spotify.add(new Song("DRUM GO DUM", "ALL OUT", "K\\DA", "3:20", "K-Pop", "4"));
        carB_.Spotify.add(new Song("I'LL SHOW YOU", "ALL OUT", "K\\DA", "3:18", "K-Pop", "5"));

        carB_.Mp3.add(new Song("Poison", "LOST & FOUND", "Jackson Wang", "3:12", "Pop", "1"));
        carB_.Mp3.add(new Song("Dead", "LOST & FOUND", "Jackson Wang", "2:19", "Pop", "2"));
        carB_.Mp3.add(new Song("I Don't Have It", "LOST & FOUND", "Jackson Wang", "3:07", "Pop", "3"));
        carB_.Mp3.add(new Song("Power", "LOST & FOUND", "Jackson Wang", "3:10", "Pop", "4"));
        carB_.Mp3.add(new Song("Blackout", "LOST & FOUND", "Jackson Wang", "2:36", "Pop", "5"));

        carC_.CD.add(new Song("tokyo", "RM", "mono.", "3:28", "Pop", "1"));
        carC_.CD.add(new Song("seoul (prod. HONNE)", "RM", "mono.", "4:35", "Pop", "2"));
        carC_.CD.add(new Song("moonchild", "RM", "mono.", "3:25", "Pop", "3"));
        carC_.CD.add(new Song("badbye", "RM", "mono.", "1:52", "Pop", "4"));
        carC_.CD.add(new Song("uhgood", "RM", "mono.", "3:14", "Pop", "5"));

        carC_.Spotify.add(new Song("THE BADDEST", "ALL OUT", "K\\DA", "2:42", "K-Pop", "1"));
        carC_.Spotify.add(new Song("MORE", "ALL OUT", "K\\DA", "3:37", "K-Pop", "2"));
        carC_.Spotify.add(new Song("VILLAIN", "ALL OUT", "K\\DA", "3:19", "K-Pop", "3"));
        carC_.Spotify.add(new Song("DRUM GO DUM", "ALL OUT", "K\\DA", "3:20", "K-Pop", "4"));
        carC_.Spotify.add(new Song("I'LL SHOW YOU", "ALL OUT", "K\\DA", "3:18", "K-Pop", "5"));

        carC_.Mp3.add(new Song("Poison", "LOST & FOUND", "Jackson Wang", "3:12", "Pop", "1"));
        carC_.Mp3.add(new Song("Dead", "LOST & FOUND", "Jackson Wang", "2:19", "Pop", "2"));
        carC_.Mp3.add(new Song("I Don't Have It", "LOST & FOUND", "Jackson Wang", "3:07", "Pop", "3"));
        carC_.Mp3.add(new Song("Power", "LOST & FOUND", "Jackson Wang", "3:10", "Pop", "4"));
        carC_.Mp3.add(new Song("Blackout", "LOST & FOUND", "Jackson Wang", "2:36", "Pop", "5"));


        typeAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enableAButtons();
            }
        });

        typeBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enableBButtons();
            }
        });

        typeCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enableCButtons();
            }
        });

        planTripButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TripData tripData_ = new TripData();
                tripData_.setVisible(true);
            }
        });

        radioModeRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(radioModeRadioButton.isSelected()){
                    volumeUpButton.setVisible(true);
                    volumeDownButton.setVisible(true);
                    FMModeButton.setVisible(true);
                    AMModeButton.setVisible(true);
                    stationButton.setVisible(true);
                    stationButton1.setVisible(true);
                    saveStationButton.setVisible(true);
                    chargeStationButton.setVisible(true);
                    label1.setVisible(true);
                    label2.setVisible(true);
                    label3.setVisible(true);
                    stationCB.setVisible(true);
                }else if(!radioModeRadioButton.isSelected()){
                    volumeUpButton.setVisible(false);
                    volumeDownButton.setVisible(false);
                    FMModeButton.setVisible(false);
                    AMModeButton.setVisible(false);
                    stationButton.setVisible(false);
                    stationButton1.setVisible(false);
                    saveStationButton.setVisible(false);
                    chargeStationButton.setVisible(false);
                    label1.setVisible(false);
                    label2.setVisible(false);
                    label3.setVisible(false);
                    stationCB.setVisible(false);
                }

            }
        });

        radioModeRadioButton1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(radioModeRadioButton1.isSelected()){
                    volumeUpButton1.setVisible(true);
                    volumeDownButton1.setVisible(true);
                    FMModeButton1.setVisible(true);
                    AMModeButton1.setVisible(true);
                    stationButton2.setVisible(true);
                    stationButton3.setVisible(true);
                    saveStationButton1.setVisible(true);
                    chargeStationButton1.setVisible(true);
                    label5.setVisible(true);
                    label6.setVisible(true);
                    label7.setVisible(true);
                    stationCB1.setVisible(true);
                }else if(!radioModeRadioButton1.isSelected()){
                    volumeUpButton1.setVisible(false);
                    volumeDownButton1.setVisible(false);
                    FMModeButton1.setVisible(false);
                    AMModeButton1.setVisible(false);
                    stationButton2.setVisible(false);
                    stationButton3.setVisible(false);
                    saveStationButton1.setVisible(false);
                    chargeStationButton1.setVisible(false);
                    label5.setVisible(false);
                    label6.setVisible(false);
                    label7.setVisible(false);
                    stationCB1.setVisible(false);
                }

            }
        });

        radioModeRadioButton2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(radioModeRadioButton2.isSelected()){
                    volumeUpButton2.setVisible(true);
                    volumeDownButton2.setVisible(true);
                    FMModeButton2.setVisible(true);
                    AMModeButton2.setVisible(true);
                    stationButton4.setVisible(true);
                    stationButton5.setVisible(true);
                    saveStationButton2.setVisible(true);
                    chargeStationButton2.setVisible(true);
                    label9.setVisible(true);
                    label10.setVisible(true);
                    label11.setVisible(true);
                    stationCB2.setVisible(true);
                }else if(!radioModeRadioButton2.isSelected()){
                    volumeUpButton2.setVisible(false);
                    volumeDownButton2.setVisible(false);
                    FMModeButton2.setVisible(false);
                    AMModeButton2.setVisible(false);
                    stationButton4.setVisible(false);
                    stationButton5.setVisible(false);
                    saveStationButton2.setVisible(false);
                    chargeStationButton2.setVisible(false);
                    label9.setVisible(false);
                    label10.setVisible(false);
                    label11.setVisible(false);
                    stationCB2.setVisible(false);
                }

            }
        });



        reproductionModeRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(reproductionModeRadioButton.isSelected()){
                    songCB.setVisible(true);
                    selectButton.setVisible(true);
                    nextButton.setVisible(true);
                    previousButton.setVisible(true);
                    CDRadioButton.setVisible(true);
                    spotifyRadioButton.setVisible(true);
                    MP3RadioButton.setVisible(true);
                    label4.setVisible(true);
                }else if(!reproductionModeRadioButton.isSelected()){
                    songCB.setVisible(false);
                    selectButton.setVisible(false);
                    nextButton.setVisible(false);
                    previousButton.setVisible(false);
                    CDRadioButton.setVisible(false);
                    spotifyRadioButton.setVisible(false);
                    MP3RadioButton.setVisible(false);
                    label4.setVisible(false);
                }
            }
        });

        reproductionModeRadioButton1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(reproductionModeRadioButton1.isSelected()){
                    songCB1.setVisible(true);
                    selectButton1.setVisible(true);
                    nextButton1.setVisible(true);
                    previousButton1.setVisible(true);
                    CDRadioButton1.setVisible(true);
                    spotifyRadioButton1.setVisible(true);
                    MP3RadioButton1.setVisible(true);
                    label8.setVisible(true);
                }else if(!reproductionModeRadioButton1.isSelected()){
                    songCB1.setVisible(false);
                    selectButton1.setVisible(false);
                    nextButton1.setVisible(false);
                    previousButton1.setVisible(false);
                    CDRadioButton1.setVisible(false);
                    spotifyRadioButton1.setVisible(false);
                    MP3RadioButton1.setVisible(false);
                    label8.setVisible(false);
                }
            }
        });

        reproductionModeRadioButton2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(reproductionModeRadioButton2.isSelected()){
                    songCB2.setVisible(true);
                    selectButton2.setVisible(true);
                    nextButton2.setVisible(true);
                    previousButton2.setVisible(true);
                    CDRadioButton2.setVisible(true);
                    spotifyRadioButton2.setVisible(true);
                    MP3RadioButton2.setVisible(true);
                    label12.setVisible(true);
                }else if(!reproductionModeRadioButton2.isSelected()){
                    songCB2.setVisible(false);
                    selectButton2.setVisible(false);
                    nextButton2.setVisible(false);
                    previousButton2.setVisible(false);
                    CDRadioButton2.setVisible(false);
                    spotifyRadioButton2.setVisible(false);
                    MP3RadioButton2.setVisible(false);
                    label12.setVisible(false);
                }
            }
        });


        phoneModeRadioButton1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(phoneModeRadioButton1.isSelected()){
                    connectDisconnectRadioButton1.setVisible(true);
                    callCB1.setVisible(true);
                    callButton1.setVisible(true);
                    endCallButton1.setVisible(true);
                    callLastContactButton.setVisible(true);
                    callCB1.setEnabled(false);
                    callButton1.setEnabled(false);
                    endCallButton1.setEnabled(false);
                    callLastContactButton.setEnabled(false);
                }else if(!phoneModeRadioButton.isSelected()){
                    connectDisconnectRadioButton1.setVisible(false);
                    callCB1.setVisible(false);
                    callButton1.setVisible(false);
                    endCallButton1.setVisible(false);
                    callLastContactButton.setVisible(false);
                }
            }
        });

        phoneModeRadioButton1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(phoneModeRadioButton2.isSelected()){
                    connectDisconnectRadioButton2.setVisible(true);
                    callCB2.setVisible(true);
                    callButton2.setVisible(true);
                    endCallButton2.setVisible(true);
                    callLastContactButton.setVisible(true);
                    callCB2.setEnabled(false);
                    callButton2.setEnabled(false);
                    endCallButton2.setEnabled(false);
                    putCallOnWaitButton.setEnabled(false);
                }else if(!phoneModeRadioButton2.isSelected()){
                    connectDisconnectRadioButton2.setVisible(false);
                    callCB2.setVisible(false);
                    callButton2.setVisible(false);
                    endCallButton2.setVisible(false);
                    putCallOnWaitButton.setVisible(false);
                }
            }
        });


        productivityModeRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(productivityModeRadioButton.isSelected()){
                    planTripButton.setVisible(true);
                    label4.setVisible(true);
                }else if(!productivityModeRadioButton.isSelected()){
                    planTripButton.setVisible(false);
                    label4.setVisible(false);
                }
            }
        });

        productivityModeRadioButton1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(productivityModeRadioButton1.isSelected()){
                    showPresentationCardsButton.setVisible(true);
                }else if(!productivityModeRadioButton.isSelected()){
                    showPresentationCardsButton.setVisible(false);
                }
            }
        });

        productivityModeRadioButton2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(productivityModeRadioButton2.isSelected()){
                    weatherForecastButton.setVisible(true);
                }else if(!productivityModeRadioButton2.isSelected()){
                    weatherForecastButton.setVisible(false);
                }
            }
        });

        volumeUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volume = volume + 1;
                label1.setText("Volume: " + volume);
            }
        });

        volumeUpButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volume = volume + 1;
                label5.setText("Volume: " + volume);
            }
        });

        volumeUpButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volume = volume + 1;
                label9.setText("Volume: " + volume);
            }
        });

        volumeDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volume = volume - 1;
                if(volume < 0){
                    volume = 0;
                }

                label1.setText("Volume: " + volume);
            }
        });

        volumeDownButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volume = volume - 1;
                if(volume < 0){
                    volume = 0;
                }

                label5.setText("Volume: " + volume);
            }
        });

        volumeDownButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volume = volume - 1;
                if(volume < 0){
                    volume = 0;
                }

                label9.setText("Volume: " + volume);
            }
        });

        FMModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setText("Mode: " + "FM");
            }
        });

        FMModeButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label6.setText("Mode: " + "FM");
            }
        });
        FMModeButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label10.setText("Mode: " + "FM");
            }
        });

        AMModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setText("Mode: " + "AM");
            }
        });

        AMModeButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label6.setText("Mode: " + "AM");
            }
        });
        AMModeButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label10.setText("Mode: " + "AM");
            }
        });

        stationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                station = station+1F;
                label3.setText(String.valueOf(station));
            }
        });
        stationButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                station = station-1F;
                label3.setText(String.valueOf(station));
            }
        });
        stationButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                station = station+1F;
                label7.setText(String.valueOf(station));
            }
        });
        stationButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                station = station-1F;
                label7.setText(String.valueOf(station));
            }
        });
        stationButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                station = station+1F;
                label11.setText(String.valueOf(station));
            }
        });
        stationButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                station = station-1F;
                label11.setText(String.valueOf(station));
            }
        });
        saveStationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carA_.Stations.add(station);
                stationCB.addItem(station);
            }
        });
        saveStationButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carA_.Stations.add(station);
                stationCB1.addItem(station);
            }
        });
        saveStationButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carA_.Stations.add(station);
                stationCB2.addItem(station);
            }
        });
        chargeStationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label3.setText(Objects.requireNonNull(stationCB.getSelectedItem()).toString());
            }
        });
        chargeStationButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label7.setText(Objects.requireNonNull(stationCB1.getSelectedItem()).toString());
            }
        });
        chargeStationButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label11.setText(Objects.requireNonNull(stationCB1.getSelectedItem()).toString());
            }
        });
        CDRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(CDRadioButton.isSelected()){
                    MP3RadioButton.setSelected(false);
                    spotifyRadioButton.setSelected(false);
                    songCB.removeAllItems();
                    for (int i = 0; i < carA_.CD.size(); i++) {
                        songCB.addItem(carA_.CD.get(i).getTitle() + " - " + carA_.CD.get(i).getArtist());
                    }
                }
            }
        });
        CDRadioButton1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(CDRadioButton1.isSelected()){
                    MP3RadioButton1.setSelected(false);
                    spotifyRadioButton1.setSelected(false);
                    songCB1.removeAllItems();
                    for (int i = 0; i < carA_.CD.size(); i++) {
                        songCB1.addItem(carA_.CD.get(i).getTitle() + " - " + carA_.CD.get(i).getArtist());
                    }
                }
            }
        });
        CDRadioButton2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(CDRadioButton2.isSelected()){
                    MP3RadioButton2.setSelected(false);
                    spotifyRadioButton2.setSelected(false);
                    songCB2.removeAllItems();
                    for (int i = 0; i < carA_.CD.size(); i++) {
                        songCB2.addItem(carA_.CD.get(i).getTitle() + " - " + carA_.CD.get(i).getArtist());
                    }
                }
            }
        });
        MP3RadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(MP3RadioButton.isSelected()){
                    CDRadioButton.setSelected(false);
                    spotifyRadioButton.setSelected(false);
                    songCB.removeAllItems();
                    for (int i = 0; i < carA_.Mp3.size(); i++) {
                        songCB.addItem(carA_.Mp3.get(i).getTitle() + " - " + carA_.Mp3.get(i).getArtist());
                    }
                }
            }
        });
        MP3RadioButton1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(MP3RadioButton1.isSelected()){
                    CDRadioButton1.setSelected(false);
                    spotifyRadioButton1.setSelected(false);
                    songCB1.removeAllItems();
                    for (int i = 0; i < carA_.Mp3.size(); i++) {
                        songCB1.addItem(carA_.Mp3.get(i).getTitle() + " - " + carA_.Mp3.get(i).getArtist());
                    }
                }
            }
        });
        MP3RadioButton2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(MP3RadioButton1.isSelected()){
                    CDRadioButton1.setSelected(false);
                    spotifyRadioButton1.setSelected(false);
                    songCB2.removeAllItems();
                    for (int i = 0; i < carA_.Mp3.size(); i++) {
                        songCB2.addItem(carA_.Mp3.get(i).getTitle() + " - " + carA_.Mp3.get(i).getArtist());
                    }
                }
            }
        });
        spotifyRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(spotifyRadioButton.isSelected()){
                    CDRadioButton.setSelected(false);
                    MP3RadioButton.setSelected(false);
                    songCB.removeAllItems();
                    for (int i = 0; i < carA_.Spotify.size(); i++) {
                        songCB.addItem(carA_.Spotify.get(i).getTitle() + " - " + carA_.Spotify.get(i).getArtist());
                    }
                }
            }
        });
        spotifyRadioButton1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(spotifyRadioButton1.isSelected()){
                    CDRadioButton1.setSelected(false);
                    MP3RadioButton1.setSelected(false);
                    songCB1.removeAllItems();
                    for (int i = 0; i < carA_.Spotify.size(); i++) {
                        songCB1.addItem(carA_.Spotify.get(i).getTitle() + " - " + carA_.Spotify.get(i).getArtist());
                    }
                }
            }
        });
        spotifyRadioButton2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(spotifyRadioButton2.isSelected()){
                    CDRadioButton2.setSelected(false);
                    MP3RadioButton2.setSelected(false);
                    songCB2.removeAllItems();
                    for (int i = 0; i < carA_.Spotify.size(); i++) {
                        songCB2.addItem(carA_.Spotify.get(i).getTitle() + " - " + carA_.Spotify.get(i).getArtist());
                    }
                }
            }
        });
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label4.setText(Objects.requireNonNull(songCB.getSelectedItem()).toString());
            }
        });
        selectButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label8.setText(Objects.requireNonNull(songCB1.getSelectedItem()).toString());
            }
        });
        selectButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label12.setText(Objects.requireNonNull(songCB2.getSelectedItem()).toString());
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label4.setText(Objects.requireNonNull(songCB.getItemAt(songCB.getSelectedIndex()+1)).toString());
                songCB.setSelectedIndex(songCB.getSelectedIndex()+1);
            }
        });
        nextButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label8.setText(Objects.requireNonNull(songCB1.getItemAt(songCB1.getSelectedIndex()+1)).toString());
                songCB1.setSelectedIndex(songCB1.getSelectedIndex()+1);
            }
        });
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label12.setText(Objects.requireNonNull(songCB2.getItemAt(songCB2.getSelectedIndex()+1)).toString());
                songCB2.setSelectedIndex(songCB2.getSelectedIndex()+1);
            }
        });

        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label4.setText(Objects.requireNonNull(songCB.getItemAt(songCB.getSelectedIndex()-1)).toString());
                songCB.setSelectedIndex(songCB.getSelectedIndex()-1);
            }
        });
        previousButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label8.setText(Objects.requireNonNull(songCB1.getItemAt(songCB1.getSelectedIndex()-1)).toString());
                songCB1.setSelectedIndex(songCB1.getSelectedIndex()-1);
            }
        });
        previousButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label12.setText(Objects.requireNonNull(songCB2.getItemAt(songCB2.getSelectedIndex()-1)).toString());
                songCB2.setSelectedIndex(songCB2.getSelectedIndex()-1);
            }
        });
        connectDisconnectRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(connectDisconnectRadioButton.isSelected()){
                    callCB.setVisible(true);
                    callButton.setVisible(true);
                    endCallButton.setVisible(true);
                    speakerONOFFRadioButton.setVisible(true);
                    callCB.setEnabled(true);
                    callButton.setEnabled(true);
                    endCallButton.setEnabled(true);
                    speakerONOFFRadioButton.setEnabled(true);
                    callCB.removeAllItems();
                    for (int i = 0; i < carA_.Contacts.size(); i++) {
                        callCB.addItem(carA_.Contacts.get(i));
                    }
                }else {
                    callCB.setVisible(false);
                    callButton.setVisible(false);
                    endCallButton.setVisible(false);
                    speakerONOFFRadioButton.setVisible(false);
                    callCB.setEnabled(false);
                    callButton.setEnabled(false);
                    endCallButton.setEnabled(false);
                    speakerONOFFRadioButton.setEnabled(false);
                }
            }
        });
        connectDisconnectRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(connectDisconnectRadioButton1.isSelected()){
                    callCB1.setVisible(true);
                    callButton1.setVisible(true);
                    endCallButton1.setVisible(true);
                    callLastContactButton.setVisible(true);
                    callCB1.setEnabled(true);
                    callButton1.setEnabled(true);
                    endCallButton1.setEnabled(true);
                    callLastContactButton.setEnabled(true);
                    callCB1.removeAllItems();
                    for (int i = 0; i < carA_.Contacts.size(); i++) {
                        callCB1.addItem(carA_.Contacts.get(i));
                    }
                }else {
                    callCB1.setVisible(false);
                    callButton1.setVisible(false);
                    endCallButton1.setVisible(false);
                    callLastContactButton.setVisible(false);
                    callCB1.setEnabled(false);
                    callButton1.setEnabled(false);
                    endCallButton1.setEnabled(false);
                    callLastContactButton.setEnabled(false);
                }
            }
        });
        connectDisconnectRadioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(connectDisconnectRadioButton2.isSelected()){
                    callCB2.setVisible(true);
                    callButton2.setVisible(true);
                    endCallButton2.setVisible(true);
                    putCallOnWaitButton.setVisible(true);
                    callCB2.setEnabled(true);
                    callButton2.setEnabled(true);
                    endCallButton2.setEnabled(true);
                    putCallOnWaitButton.setEnabled(true);
                    callCB2.removeAllItems();
                    for (int i = 0; i < carA_.Contacts.size(); i++) {
                        callCB2.addItem(carA_.Contacts.get(i));
                    }
                }else {
                    callCB2.setVisible(false);
                    callButton2.setVisible(false);
                    endCallButton2.setVisible(false);
                    putCallOnWaitButton.setVisible(false);
                    callCB2.setEnabled(false);
                    callButton2.setEnabled(false);
                    endCallButton2.setEnabled(false);
                    putCallOnWaitButton.setEnabled(false);
                }
            }
        });
        callButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Calling: " + callCB.getSelectedItem().toString());
            }
        });
        callButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Calling: " + callCB1.getSelectedItem().toString());
            }
        });
        callButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Calling: " + callCB2.getSelectedItem().toString());
            }
        });


        endCallButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "The call with: " + callCB.getSelectedItem().toString() + "has ended.");
            }
        });
        endCallButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "The calling last contact registered: " + songCB1.getItemAt(songCB1.getSelectedIndex() - 1) + "has ended.");
            }
        });
        endCallButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "The calling last contact registered: " + songCB2.getItemAt(songCB2.getSelectedIndex() - 1) + "has ended.");
            }
        });

        planTripButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TripData tripData = new TripData();
                tripData.setVisible(true);
            }
        });
        showPresentationCardsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PCards pCards = new PCards();
                pCards.setVisible(true);
            }
        });
        weatherForecastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label13.setText(carC_.getWeatherForCast());
            }
        });

        speakerONOFFRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (speakerONOFFRadioButton.isSelected()){
                    JOptionPane.showMessageDialog(null, "Using Speakers.");
                }else{
                    JOptionPane.showMessageDialog(null, "Using Headphones.");
                }
            }
        });
        putCallOnWaitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Putting call with: " + callCB2.getSelectedItem().toString() + "on hold.");
            }
        });
    }


    /**
     * Enable buttons.
     *
     * @param carType the car type
     */
    public void enableButtons(String carType){

        if(carType.equalsIgnoreCase("A")){
            typeAButton.setEnabled(true);
            typeBButton.setEnabled(false);
            typeCButton.setEnabled(false);
            turnOnARadioButton.setEnabled(true);
            turnOnBRadioButton.setEnabled(false);
            turnOnCRadioButton.setEnabled(false);
        }
        else if(carType.equalsIgnoreCase("B")){
            typeAButton.setEnabled(false);
            typeBButton.setEnabled(true);
            typeCButton.setEnabled(false);
            turnOnARadioButton.setEnabled(false);
            turnOnBRadioButton.setEnabled(true);
            turnOnCRadioButton.setEnabled(false);
        }
        else if(carType.equalsIgnoreCase("C")){
            typeAButton.setEnabled(false);
            typeBButton.setEnabled(false);
            typeCButton.setEnabled(true);
            turnOnARadioButton.setEnabled(false);
            turnOnBRadioButton.setEnabled(false);
            turnOnCRadioButton.setEnabled(true);
        }
    }

    /**
     * Enable a buttons.
     */
    public void enableAButtons(){
        buttonsE(turnOnARadioButton, radioModeRadioButton, reproductionModeRadioButton, phoneModeRadioButton, productivityModeRadioButton);
    }

    /**
     * Enable b buttons.
     */
    public void enableBButtons(){
        buttonsE(turnOnBRadioButton, radioModeRadioButton1, reproductionModeRadioButton1, phoneModeRadioButton1, productivityModeRadioButton1);
    }

    /**
     * Enable c buttons.
     */
    public void enableCButtons(){
        buttonsE(turnOnCRadioButton, radioModeRadioButton2, reproductionModeRadioButton2, phoneModeRadioButton2, productivityModeRadioButton2);
    }

    private void buttonsE(JRadioButton turnOnARadioButton, JRadioButton radioModeRadioButton, JRadioButton reproductionModeRadioButton, JRadioButton phoneModeRadioButton, JRadioButton productivityModeRadioButton) {
        if(turnOnARadioButton.isSelected()){
            radioModeRadioButton.setEnabled(true);
            reproductionModeRadioButton.setEnabled(true);
            phoneModeRadioButton.setEnabled(true);
            productivityModeRadioButton.setEnabled(true);
            radioModeRadioButton.setVisible(true);
            reproductionModeRadioButton.setVisible(true);
            phoneModeRadioButton.setVisible(true);
            productivityModeRadioButton.setVisible(true);
        }
        else if(!turnOnARadioButton.isSelected()){
            radioModeRadioButton.setEnabled(false);
            reproductionModeRadioButton.setEnabled(false);
            phoneModeRadioButton.setEnabled(false);
            productivityModeRadioButton.setEnabled(false);
            radioModeRadioButton.setVisible(false);
            reproductionModeRadioButton.setVisible(false);
            phoneModeRadioButton.setVisible(false);
            productivityModeRadioButton.setVisible(false);
        }
    }

    /**
     * Hide b.
     */
    public void hideB(){
        volumeUpButton.setVisible(false);
        volumeDownButton.setVisible(false);
        FMModeButton.setVisible(false);
        AMModeButton.setVisible(false);
        stationButton.setVisible(false);
        stationButton1.setVisible(false);
        saveStationButton.setVisible(false);
        chargeStationButton.setVisible(false);
        songCB.setVisible(false);
        selectButton.setVisible(false);
        nextButton.setVisible(false);
        previousButton.setVisible(false);
        radioModeRadioButton.setVisible(false);
        reproductionModeRadioButton.setVisible(false);
        CDRadioButton.setVisible(false);
        MP3RadioButton.setVisible(false);
        spotifyRadioButton1.setVisible(false);
        phoneModeRadioButton.setVisible(false);
        connectDisconnectRadioButton.setVisible(false);
        callCB.setVisible(false);
        callButton.setVisible(false);
        endCallButton.setVisible(false);
        speakerONOFFRadioButton.setVisible(false);
        productivityModeRadioButton.setVisible(false);

        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
        label6.setVisible(false);
        label7.setVisible(false);
        label8.setVisible(false);
        label9.setVisible(false);
        label10.setVisible(false);
        label11.setVisible(false);
        label12.setVisible(false);
        label13.setVisible(false);

        planTripButton.setVisible(false);
        volumeUpButton1.setVisible(false);
        volumeDownButton1.setVisible(false);
        radioModeRadioButton1.setVisible(false);
        FMModeButton1.setVisible(false);
        AMModeButton1.setVisible(false);
        stationButton2.setVisible(false);
        stationButton3.setVisible(false);
        saveStationButton1.setVisible(false);
        chargeStationButton1.setVisible(false);
        reproductionModeRadioButton1.setVisible(false);
        CDRadioButton1.setVisible(false);
        MP3RadioButton1.setVisible(false);
        spotifyRadioButton.setVisible(false);
        songCB1.setVisible(false);
        selectButton1.setVisible(false);
        phoneModeRadioButton1.setVisible(false);
        connectDisconnectRadioButton1.setVisible(false);
        nextButton1.setVisible(false);
        previousButton1.setVisible(false);
        callCB1.setVisible(false);
        callButton1.setVisible(false);
        endCallButton1.setVisible(false);
        callLastContactButton.setVisible(false);
        showPresentationCardsButton.setVisible(false);
        stationCB.setVisible(false);
        stationCB1.setVisible(false);
        productivityModeRadioButton1.setVisible(false);
        volumeUpButton2.setVisible(false);
        volumeDownButton2.setVisible(false);
        radioModeRadioButton2.setVisible(false);
        FMModeButton2.setVisible(false);
        AMModeButton2.setVisible(false);
        stationButton4.setVisible(false);
        stationButton5.setVisible(false);
        saveStationButton2.setVisible(false);
        stationCB2.setVisible(false);
        chargeStationButton2.setVisible(false);
        reproductionModeRadioButton2.setVisible(false);
        CDRadioButton2.setVisible(false);
        MP3RadioButton2.setVisible(false);
        spotifyRadioButton2.setVisible(false);
        songCB2.setVisible(false);
        selectButton2.setVisible(false);
        nextButton2.setVisible(false);
        previousButton2.setVisible(false);
        phoneModeRadioButton2.setVisible(false);
        connectDisconnectRadioButton2.setVisible(false);
        callCB2.setVisible(false);
        callButton2.setVisible(false);
        endCallButton2.setVisible(false);
        putCallOnWaitButton.setVisible(false);
        productivityModeRadioButton2.setVisible(false);
        weatherForecastButton.setVisible(false);
    }

}
