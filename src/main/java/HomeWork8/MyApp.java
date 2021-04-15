package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyApp extends JFrame {

    private int value1;
    private int value2;

    MyApp(int initialValue1, int initialValue2){

        Font font = new Font("TimesRoman",Font.BOLD,12);

        setBounds(1000,500,400,300);
        setTitle("Простой счетчик 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(4,2));

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setHorizontalAlignment(SwingConstants.CENTER);


        value1 = initialValue1;
        value2 = initialValue2;

        label1.setText(String.valueOf(value1));
        label2.setText(String.valueOf(value2));

        JButton button1 = new JButton(">");
        JButton button2 = new JButton(">");
        JButton button3 = new JButton("<");
        JButton button4 = new JButton("<");

        add(button1);
        add(button2);
        add(label1);
        add(label2);
        add(button3);
        add(button4);


        JLabel compareLabel1 = new JLabel();
        compareLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        add(compareLabel1);

        JLabel compareLabel2 = new JLabel();
        compareLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        add(compareLabel2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1++;
                label1.setText(String.valueOf(value1));
                compareLabel1.setText(value1 > value2 ? "Данное число больше" : value1 == value2 ? "Числа равны" : "Данное число меньше");
                compareLabel2.setText(value1 < value2 ? "Данное число больше" : value1 == value2 ? "Числа равны" : "Данное число меньше");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value2++;
                label2.setText(String.valueOf(value2));
                compareLabel1.setText(value1 > value2 ? "Данное число больше" : value1 == value2 ? "Числа равны" : "Данное число меньше");
                compareLabel2.setText(value1 < value2 ? "Данное число больше" : value1 == value2 ? "Числа равны" : "Данное число меньше");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1--;
                label1.setText(String.valueOf(value1));
                compareLabel1.setText(value1 > value2 ? "Данное число больше" : value1 == value2 ? "Числа равны" : "Данное число меньше");
                compareLabel2.setText(value1 < value2 ? "Данное число больше" : value1 == value2 ? "Числа равны" : "Данное число меньше");
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value2--;
                label2.setText(String.valueOf(value2));
                compareLabel1.setText(value1 > value2 ? "Данное число больше" : value1 == value2 ? "Числа равны" : "Данное число меньше");
                compareLabel2.setText(value1 < value2 ? "Данное число больше" : value1 == value2 ? "Числа равны" : "Данное число меньше");
            }
        });


        setVisible(true);

    }

    public static void main(String[] args) {
        new MyApp(1,1);

    }

}


