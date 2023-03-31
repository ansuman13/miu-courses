package prob1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private final int FRAME_WIDTH = 600;
    private final int FRAME_HEIGHT = 400;


    private JLabel nameLabel;
    private JTextField name;

    private JLabel streetLabel;
    private JTextField street;

    private JLabel cityLabel;
    private JTextField city;

    private JLabel stateLabel;
    private JTextField state;

    private JLabel zipLabel;
    private JTextField zip;

    private JButton button;

    public MyFrame(){
        JFrame frame = new JFrame("test");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(100, 25, 100, 30);
        contentPane.add(nameLabel);

        name = new JTextField();
        name.setBounds(100,50, 100, 30);
        contentPane.add(name);

        streetLabel = new JLabel("Street");
        streetLabel.setBounds(250, 25, 100, 30);
        contentPane.add(streetLabel);

        street = new JTextField();
        street.setBounds(250,50, 100, 30);
        contentPane.add(street);

        city = new JTextField();
        city.setBounds(400, 50, 100, 30 );
        contentPane.add(city);

        cityLabel = new JLabel("City");
        cityLabel.setBounds(400, 25, 100, 30);
        contentPane.add(cityLabel);

        stateLabel = new JLabel("State");
        stateLabel.setBounds(150, 100, 100, 30);
        contentPane.add(stateLabel);

        state = new JTextField();
        state.setBounds(150,130, 100, 30);
        contentPane.add(state);

        zipLabel = new JLabel("Zip");
        zipLabel.setBounds(300, 100, 100, 30);
        contentPane.add(zipLabel);

        zip = new JTextField();
        zip.setBounds(300, 130, 100, 30 );
        contentPane.add(zip);


        button = new JButton("Submit");
        button.setBounds(220, 200, 100, 20);
        contentPane.add(button);
        button.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            String nameStr = name.getText();
            String streetStr = street.getText();
            String cityStr = zip.getText();
            String stateStr = state.getText();
            String zipStr = zip.getText();

            System.out.printf("%s%n%s%n%s,%s %s", nameStr, streetStr, cityStr, stateStr, zipStr);
            JOptionPane.showMessageDialog(null, "Thank you, Please check the console.");
        }
    }
}
