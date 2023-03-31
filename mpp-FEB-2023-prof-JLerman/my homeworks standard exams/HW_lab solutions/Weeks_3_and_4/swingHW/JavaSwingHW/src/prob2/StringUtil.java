package prob2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StringUtil extends JFrame {

    // Components of the Form
    private final int FRAME_WIDTH= 600;
    private final int FRAME_HEIGHT =350;
    private JButton countButton;
    private JButton reverseButton;
    private JButton removeButton;

    private JLabel inputLabel;
    private JLabel outputLabel;
    private JTextField input;
    private JTextField output;

    private Container c;

    // constructor, to initialize the components
    // with default values.
    public StringUtil()
    {
        setTitle("String Utility");
        setBounds(300, 100, FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        countButton = new JButton("Count Letters");
        countButton.setSize(180, 30);
        countButton.setLocation(100, 100);
        c.add(countButton);

        reverseButton = new JButton("Reverse Letters");
        reverseButton.setSize(180, 30);
        reverseButton.setLocation(100, 150);
        c.add(reverseButton);

        removeButton = new JButton("Remove Duplicates");
        removeButton.setSize(180, 30);
        removeButton.setLocation(100, 200);
        c.add(removeButton);

        inputLabel = new JLabel("Input");
        inputLabel.setSize(100, 20);
        inputLabel.setLocation(350, 100);
        c.add(inputLabel);

        input = new JTextField();
        input.setSize(190, 20);
        input.setLocation(350, 120);
        c.add(input);

        outputLabel = new JLabel("Output");
        outputLabel.setSize(100, 20);
        outputLabel.setLocation(350, 140);
        c.add(outputLabel);

        output = new JTextField();
        output.setSize(190, 20);
        output.setLocation(350, 160);
        c.add(output);

        countButton.addActionListener(new MyButtonListener());
        reverseButton.addActionListener(new MyButtonListener());
        removeButton.addActionListener(new MyButtonListener());

    }


    public class MyButtonListener implements ActionListener {
        // method actionPerformed()
        // to get the action performed
        // by the user and act accordingly
        public void actionPerformed(ActionEvent e) {
            Object inputButton = e.getSource();
            String inputValue = input.getText();
            if(inputButton == countButton){
                int inputVal = input.getText().length();
                output.setText(""+inputVal);
            } else if (inputButton == reverseButton) {
                String reversed="";
                for(int i= inputValue.length()-1; i>-1; i--){reversed +=  inputValue.charAt(i);}
                output.setText(reversed);
            } else {
                StringBuilder finalText = new StringBuilder();
                StringBuilder str = new StringBuilder(inputValue);
                int count = 0;
                for(int i = 0; i<str.length(); i++){
                    for(int j =i+1; j<str.length();j++){
                        if(str.charAt(i) == str.charAt(j)){
                            finalText = str.deleteCharAt(j);
                            j--;
                        }
                    }
                }
                output.setText(finalText.toString());
                }
            }
    }//end of class

// Driver Code
    public static void main(String[] args) {
        StringUtil mainform = new StringUtil();
        mainform.setVisible(true);
    }
}
