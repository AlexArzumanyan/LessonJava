package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeekbrainsWindow extends JFrame {
    private int randomNubmer;
    private JTextField textField;


    public GeekbrainsWindow() {


        this.randomNubmer = (int) (Math.random() * 10) + 1;
        setTitle("Игра: Угадай число");
        setBounds(600, 300, 600, 160);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);
        textField.setText("Программа загадала число от 1 до 10");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 20);
        textField.setFont(font);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        buttonsPanel.setBackground(Color.BLUE);
        add(buttonsPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);
            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex);
                }
            });


        }
        JButton buttonRepeat = new JButton("Повторить");
        add(buttonRepeat, BorderLayout.SOUTH);
        buttonRepeat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

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

    public void tryToAnswer(int answer) {
        if (answer < randomNubmer) {
            textField.setText("Не угадали! Загаданное число больше!");
            return;
        }
        if (answer > randomNubmer) {
            textField.setText("Не угадали! Загаданное число меньше!");
            return;
        }
        textField.setText("Вы угадали!!! Ответ: " + randomNubmer);
    }
}
