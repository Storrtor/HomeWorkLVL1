package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyApp extends JFrame {

    private int value1;
    private int value2;

    MyApp(int initialValue1, int initialValue2){

        Font font1 = new Font("TimesRoman",Font.BOLD,25);
        Font font2 = new Font("TimesRoman",Font.BOLD,20);


        setBounds(1000,500,800,500);
        setTitle("Простой счетчик 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        setLayout(new GridLayout(5,2));

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();

        getContentPane().setBackground(new Color(100,150,180));
        //140,180,150 195,180,150

        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        label1.setFont(font1);
        label2.setFont(font1);

        value1 = initialValue1;
        value2 = initialValue2;

        label1.setText(String.valueOf(value1));
        label2.setText(String.valueOf(value2));

        JButton button1 = new JButton(">");
        JButton button2 = new JButton(">");
        JButton button3 = new JButton("<");
        JButton button4 = new JButton("<");

        button1.setForeground(new Color(0,139,139));
        button2.setForeground(new Color(160, 82, 45));
        button3.setForeground(new Color(0,139,139));
        button4.setForeground(new Color(160, 82, 45));

        button1.setBackground(new Color(230,230,250));
        button2.setBackground(new Color(230,230,250));
        button3.setBackground(new Color(230,230,250));
        button4.setBackground(new Color(230,230,250));

        button1.setFont(font1);
        button2.setFont(font1);
        button3.setFont(font1);
        button4.setFont(font1);

        JLabel compareLabel3 = new JLabel();
        compareLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        compareLabel3.setText("Число №1");
        compareLabel3.setFont(font2);
        add(compareLabel3);

        JLabel compareLabel4 = new JLabel();
        compareLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        compareLabel4.setText("Число №2");
        compareLabel4.setFont(font2);
        add(compareLabel4);

        add(button1);
        add(button2);
        add(label1);
        add(label2);
        add(button3);
        add(button4);


        JLabel compareLabel1 = new JLabel();
        compareLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        add(compareLabel1);

        compareLabel1.setFont(font2);

        JLabel compareLabel2 = new JLabel();
        compareLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        add(compareLabel2);

        compareLabel2.setFont(font2);

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


