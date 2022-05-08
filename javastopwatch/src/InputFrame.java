import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InputFrame implements ActionListener{
    JFrame askFrame = new JFrame();
    JButton goButton = new JButton("Go");
    JTextField inputhours = new JTextField("00");
    JTextField inputminutes = new JTextField("00");
    JTextField inputseconds = new JTextField("00");

    boolean pressed = false;



    InputFrame() {


        inputhours.setBounds(100, 100, 50, 50);
        inputhours.setFont(new Font("Verdana", Font.PLAIN, 35));
        inputhours.setBorder(BorderFactory.createBevelBorder(1));
        inputhours.setOpaque(true);
        inputhours.setHorizontalAlignment(JTextField.CENTER);

        inputminutes.setBounds(175, 100, 50, 50);
        inputminutes.setFont(new Font("Verdana", Font.PLAIN, 35));
        inputminutes.setBorder(BorderFactory.createBevelBorder(1));
        inputminutes.setOpaque(true);
        inputminutes.setHorizontalAlignment(JTextField.CENTER);

        inputseconds.setBounds(250, 100, 50, 50);
        inputseconds.setFont(new Font("Verdana", Font.PLAIN, 35));
        inputseconds.setBorder(BorderFactory.createBevelBorder(1));
        inputseconds.setOpaque(true);
        inputseconds.setHorizontalAlignment(JTextField.CENTER);

        goButton.setBounds(150, 200, 100, 50);
        goButton.setFont(new Font("Ink Free", Font.PLAIN, 20));
        goButton.setFocusable(false);
        goButton.addActionListener(this);


        askFrame.add(inputhours);
        askFrame.add(inputminutes);
        askFrame.add(inputseconds);
        askFrame.add(goButton);

        askFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        askFrame.setSize(420, 420);
        askFrame.setLayout(null);
        askFrame.setVisible(true);
//        System.out.print("GfG1");


    }
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == goButton) {
                int hours = Integer.parseInt(inputhours.getText());
                int minutes = Integer.parseInt(inputminutes.getText());
                int seconds = Integer.parseInt(inputseconds.getText());
                int elapsedTime = (seconds * 1000)+(minutes * 60000)+(hours*3600000);
                pressed = true;
                askFrame.setVisible(false);
                Countdown timer = new Countdown(elapsedTime,hours,minutes,seconds);



            }
 }}