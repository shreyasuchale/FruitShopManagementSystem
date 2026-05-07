import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class FruitShopManagementSystem extends JFrame implements ActionListener {

    JLabel title, customerLabel, mobileLabel;
    JTextField customerField, mobileField;
    JTextArea billArea;

    JButton appleBtn, bananaBtn, mangoBtn, orangeBtn,
            grapesBtn, watermelonBtn, pineappleBtn,
            papayaBtn, strawberryBtn, billBtn;

    double total = 0;

    // Constructor
    FruitShopManagementSystem() {

        setTitle("Fruit Shop Management System");
        setSize(850, 750);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 222, 179));

        title = new JLabel("FRUIT SHOP MANAGEMENT SYSTEM");
        title.setBounds(120, 20, 800, 50);
        title.setFont(new Font("Arial", Font.BOLD, 32));
        title.setForeground(Color.RED);
        add(title);

        customerLabel = new JLabel("Customer Name:");
        customerLabel.setBounds(50, 100, 180, 30);
        customerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(customerLabel);

        customerField = new JTextField();
        customerField.setBounds(240, 100, 220, 35);
        add(customerField);

        mobileLabel = new JLabel("Mobile Number:");
        mobileLabel.setBounds(500, 100, 180, 30);
        mobileLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(mobileLabel);

        mobileField = new JTextField();
        mobileField.setBounds(660, 100, 150, 35);
        add(mobileField);

        // Fruit Buttons
        appleBtn = new JButton("Apple Rs.120");
        appleBtn.setBounds(50, 180, 170, 45);
        appleBtn.setBackground(Color.PINK);
        add(appleBtn);

        bananaBtn = new JButton("Banana Rs.60");
        bananaBtn.setBounds(260, 180, 170, 45);
        bananaBtn.setBackground(Color.YELLOW);
        add(bananaBtn);

        mangoBtn = new JButton("Mango Rs.150");
        mangoBtn.setBounds(470, 180, 170, 45);
        mangoBtn.setBackground(Color.ORANGE);
        add(mangoBtn);

        orangeBtn = new JButton("Orange Rs.80");
        orangeBtn.setBounds(670, 180, 140, 45);
        orangeBtn.setBackground(Color.CYAN);
        add(orangeBtn);

        grapesBtn = new JButton("Grapes Rs.90");
        grapesBtn.setBounds(50, 270, 170, 45);
        grapesBtn.setBackground(Color.MAGENTA);
        add(grapesBtn);

        watermelonBtn = new JButton("Watermelon Rs.50");
        watermelonBtn.setBounds(260, 270, 190, 45);
        watermelonBtn.setBackground(Color.GREEN);
        add(watermelonBtn);

        pineappleBtn = new JButton("Pineapple Rs.70");
        pineappleBtn.setBounds(490, 270, 190, 45);
        pineappleBtn.setBackground(Color.LIGHT_GRAY);
        add(pineappleBtn);

        papayaBtn = new JButton("Papaya Rs.60");
        papayaBtn.setBounds(710, 270, 120, 45);
        papayaBtn.setBackground(Color.YELLOW);
        add(papayaBtn);

        strawberryBtn = new JButton("Strawberry Rs.200");
        strawberryBtn.setBounds(300, 360, 250, 50);
        strawberryBtn.setBackground(Color.RED);
        strawberryBtn.setForeground(Color.WHITE);
        strawberryBtn.setFont(new Font("Arial", Font.BOLD, 16));
        add(strawberryBtn);

        billBtn = new JButton("Generate Final Bill");
        billBtn.setBounds(270, 450, 300, 55);
        billBtn.setBackground(Color.BLACK);
        billBtn.setForeground(Color.WHITE);
        billBtn.setFont(new Font("Arial", Font.BOLD, 22));
        add(billBtn);

        billArea = new JTextArea();
        billArea.setBounds(140, 560, 650, 180);
        billArea.setFont(new Font("Monospaced", Font.BOLD, 16));
        add(billArea);

        // Action Listener
        appleBtn.addActionListener(this);
        bananaBtn.addActionListener(this);
        mangoBtn.addActionListener(this);
        orangeBtn.addActionListener(this);
        grapesBtn.addActionListener(this);
        watermelonBtn.addActionListener(this);
        pineappleBtn.addActionListener(this);
        papayaBtn.addActionListener(this);
        strawberryBtn.addActionListener(this);
        billBtn.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // GUI Actions
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == appleBtn) {
            total += 120;
            JOptionPane.showMessageDialog(this, "Apple Added!");
        }

        if(e.getSource() == bananaBtn) {
            total += 60;
            JOptionPane.showMessageDialog(this, "Banana Added!");
        }

        if(e.getSource() == mangoBtn) {
            total += 150;
            JOptionPane.showMessageDialog(this, "Mango Added!");
        }

        if(e.getSource() == orangeBtn) {
            total += 80;
            JOptionPane.showMessageDialog(this, "Orange Added!");
        }

        if(e.getSource() == grapesBtn) {
            total += 90;
            JOptionPane.showMessageDialog(this, "Grapes Added!");
        }

        if(e.getSource() == watermelonBtn) {
            total += 50;
            JOptionPane.showMessageDialog(this, "Watermelon Added!");
        }

        if(e.getSource() == pineappleBtn) {
            total += 70;
            JOptionPane.showMessageDialog(this, "Pineapple Added!");
        }

        if(e.getSource() == papayaBtn) {
            total += 60;
            JOptionPane.showMessageDialog(this, "Papaya Added!");
        }

        if(e.getSource() == strawberryBtn) {
            total += 200;
            JOptionPane.showMessageDialog(this, "Strawberry Added!");
        }

        // Generate Bill
        if(e.getSource() == billBtn) {

            double gst = total * 0.05;
            double finalAmount = total + gst;

            String customer = customerField.getText();
            String mobile = mobileField.getText();

            billArea.setText(
                "Customer Name : " + customer + "\n" +
                "Mobile Number : " + mobile + "\n\n" +
                "Total Amount  : Rs. " + total + "\n" +
                "GST (5%)      : Rs. " + gst + "\n" +
                "Final Amount  : Rs. " + finalAmount + "\n\n" +
                "Thank You For Visiting!"
            );
        }
    }

    // Console-Based Implementation
    public static void consoleImplementation() {

        Scanner sc = new Scanner(System.in);

        int choice;
        double total = 0;

        do {

            System.out.println("\n========== CONSOLE FRUIT SHOP ==========");
            System.out.println("1. Apple - Rs.120");
            System.out.println("2. Banana - Rs.60");
            System.out.println("3. Mango - Rs.150");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    total += 120;
                    System.out.println("Apple Added!");
                    break;

                case 2:
                    total += 60;
                    System.out.println("Banana Added!");
                    break;

                case 3:
                    total += 150;
                    System.out.println("Mango Added!");
                    break;

                case 4:
                    System.out.println("Generating Bill...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);

        System.out.println("Final Bill = Rs. " + total);
    }

    // Main Method
    public static void main(String[] args) {

        // Console-Based Implementation
        consoleImplementation();

        // GUI-Based Implementation
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FruitShopManagementSystem().setVisible(true);
            }
        });
    }
}
