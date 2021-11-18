package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeekbrainsWindow extends JFrame {
   private int randomNubmer;



    public GeekbrainsWindow() {


        this.randomNubmer = (int) (Math.random() * 10) +1;
        setTitle("Игра: Угадай число");
        setBounds(600, 300, 600, 160);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
//        setLayout(new FlowLayout());

//        for (int i = 0; i <10; i++) {
//            add(new JButton(" "+i));


//    JButton button = new JButton("Click Me!!");
//
//    add(button);
//
//    button.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println(1);
//        }
//    });
//
//        add(button, BorderLayout.NORTH);
//
//        JTextArea textArea = new JTextArea();
//        add(textArea,BorderLayout.CENTER);


        JTextField textField = new JTextField();
        add(textField, BorderLayout.NORTH);
        textField.setText("Программа загадала число от 1 до 10");
textField.setEditable(false);

         Font font = new Font("Arial", Font.PLAIN, 24);
        textField.setFont(font);

        JPanel buttonsPanel = new JPanel(new GridLayout(1,4));
        buttonsPanel.setBackground(Color.BLUE);
        add(buttonsPanel,BorderLayout.CENTER);
//
//        JButton button1 = new JButton("1");
//        JButton button2 = new JButton("2");
//        JButton button3 = new JButton("3");
//        JButton button4 = new JButton("4");
//        buttonsPanel.add(button1);
//        buttonsPanel.add(button2);
//        buttonsPanel.add(button3);
//        buttonsPanel.add(button4);
// button1.addActionListener(new ActionListener() {
//     @Override
//     public void actionPerformed(ActionEvent e) {
//         textField.setText(textField.getText()+"1");
//     }
// });
//        button2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textField.setText("2");
//            }
//        });
//        button3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textField.setText("3");
//            }
//        });
//        button4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textField.setText("4");
//            }
//        });

        setVisible(true);
    }
}
