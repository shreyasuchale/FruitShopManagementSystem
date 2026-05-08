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

    int appleQty = 0;
    int bananaQty = 0;
    int mangoQty = 0;
    int orangeQty = 0;
    int grapesQty = 0;
    int watermelonQty = 0;
    int pineappleQty = 0;
    int papayaQty = 0;
    int strawberryQty = 0;

    FruitShopManagementSystem() {

        setTitle("Fruit Shop Management System");
        setSize(1150, 820);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 222, 179));

        // TITLE
        title = new JLabel("FRUIT SHOP MANAGEMENT SYSTEM");
        title.setBounds(120, 20, 900, 50);
        title.setFont(new Font("Arial", Font.BOLD, 34));
        title.setForeground(Color.RED);
        add(title);

        // CUSTOMER NAME
        customerLabel = new JLabel("Customer Name:");
        customerLabel.setBounds(50, 120, 250, 40);
        customerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(customerLabel);

        customerField = new JTextField();
        customerField.setBounds(260, 120, 270, 40);
        customerField.setFont(new Font("Arial", Font.PLAIN, 18));
        add(customerField);

        // MOBILE NUMBER
        mobileLabel = new JLabel("Mobile Number:");
        mobileLabel.setBounds(580, 120, 250, 40);
        mobileLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(mobileLabel);

        mobileField = new JTextField();
        mobileField.setBounds(790, 120, 240, 40);
        mobileField.setFont(new Font("Arial", Font.PLAIN, 18));
        add(mobileField);

        // BUTTONS
        appleBtn = new JButton("Apple Rs.120");
        appleBtn.setBounds(50, 230, 190, 55);
        appleBtn.setBackground(Color.PINK);
        appleBtn.setFont(new Font("Arial", Font.BOLD, 18));
        add(appleBtn);

        bananaBtn = new JButton("Banana Rs.60");
        bananaBtn.setBounds(300, 230, 190, 55);
        bananaBtn.setBackground(Color.YELLOW);
        bananaBtn.setFont(new Font("Arial", Font.BOLD, 18));
        add(bananaBtn);

        mangoBtn = new JButton("Mango Rs.150");
        mangoBtn.setBounds(550, 230, 190, 55);
        mangoBtn.setBackground(Color.ORANGE);
        mangoBtn.setFont(new Font("Arial", Font.BOLD, 18));
        add(mangoBtn);

        orangeBtn = new JButton("Orange Rs.80");
        orangeBtn.setBounds(800, 230, 190, 55);
        orangeBtn.setBackground(Color.CYAN);
        orangeBtn.setFont(new Font("Arial", Font.BOLD, 18));
        add(orangeBtn);

        grapesBtn = new JButton("Grapes Rs.90");
        grapesBtn.setBounds(50, 340, 190, 55);
        grapesBtn.setBackground(Color.MAGENTA);
        grapesBtn.setFont(new Font("Arial", Font.BOLD, 18));
        add(grapesBtn);

        watermelonBtn = new JButton("Watermelon Rs.50");
        watermelonBtn.setBounds(300, 340, 260, 55);
        watermelonBtn.setBackground(Color.GREEN);
        watermelonBtn.setFont(new Font("Arial", Font.BOLD, 18));
        add(watermelonBtn);

        pineappleBtn = new JButton("Pineapple Rs.70");
        pineappleBtn.setBounds(610, 340, 240, 55);
        pineappleBtn.setBackground(Color.LIGHT_GRAY);
        pineappleBtn.setFont(new Font("Arial", Font.BOLD, 18));
        add(pineappleBtn);

        papayaBtn = new JButton("Papaya Rs.60");
        papayaBtn.setBounds(900, 340, 190, 55);
        papayaBtn.setBackground(Color.YELLOW);
        papayaBtn.setFont(new Font("Arial", Font.BOLD, 18));
        add(papayaBtn);

        strawberryBtn = new JButton("Strawberry Rs.200");
        strawberryBtn.setBounds(390, 420, 340, 60);
        strawberryBtn.setBackground(Color.RED);
        strawberryBtn.setForeground(Color.WHITE);
        strawberryBtn.setFont(new Font("Arial", Font.BOLD, 22));
        add(strawberryBtn);

        // BILL BUTTON
        billBtn = new JButton("Generate Final Bill");
        billBtn.setBounds(320, 500, 360, 65);
        billBtn.setBackground(Color.BLACK);
        billBtn.setForeground(Color.WHITE);
        billBtn.setFont(new Font("Arial", Font.BOLD, 28));
        add(billBtn);

        // BILL AREA
        billArea = new JTextArea();
        billArea.setFont(new Font("Monospaced", Font.BOLD, 16));
        billArea.setEditable(false);

        JScrollPane pane = new JScrollPane(billArea);
        pane.setBounds(80, 590, 980, 190);
        add(pane);

        // ACTION LISTENER
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

    // GUI BUTTON ACTIONS
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == appleBtn) {
            total += 120;
            appleQty++;
            JOptionPane.showMessageDialog(this, "Apple Added!");
        }

        if(e.getSource() == bananaBtn) {
            total += 60;
            bananaQty++;
            JOptionPane.showMessageDialog(this, "Banana Added!");
        }

        if(e.getSource() == mangoBtn) {
            total += 150;
            mangoQty++;
            JOptionPane.showMessageDialog(this, "Mango Added!");
        }

        if(e.getSource() == orangeBtn) {
            total += 80;
            orangeQty++;
            JOptionPane.showMessageDialog(this, "Orange Added!");
        }

        if(e.getSource() == grapesBtn) {
            total += 90;
            grapesQty++;
            JOptionPane.showMessageDialog(this, "Grapes Added!");
        }

        if(e.getSource() == watermelonBtn) {
            total += 50;
            watermelonQty++;
            JOptionPane.showMessageDialog(this, "Watermelon Added!");
        }

        if(e.getSource() == pineappleBtn) {
            total += 70;
            pineappleQty++;
            JOptionPane.showMessageDialog(this, "Pineapple Added!");
        }

        if(e.getSource() == papayaBtn) {
            total += 60;
            papayaQty++;
            JOptionPane.showMessageDialog(this, "Papaya Added!");
        }

        if(e.getSource() == strawberryBtn) {
            total += 200;
            strawberryQty++;
            JOptionPane.showMessageDialog(this, "Strawberry Added!");
        }

        // GENERATE BILL
        if(e.getSource() == billBtn) {

            double gst = total * 0.05;
            double finalAmount = total + gst;

            String customer = customerField.getText();
            String mobile = mobileField.getText();

            billArea.setText(
                "Customer Name : " + customer + "\n" +
                "Mobile Number : " + mobile + "\n\n" +

                "============== PURCHASED ITEMS ==============\n\n" +

                (appleQty > 0 ? "Apple        : " + appleQty + " kg\n" : "") +
                (bananaQty > 0 ? "Banana       : " + bananaQty + " dozen\n" : "") +
                (mangoQty > 0 ? "Mango        : " + mangoQty + " kg\n" : "") +
                (orangeQty > 0 ? "Orange       : " + orangeQty + " kg\n" : "") +
                (grapesQty > 0 ? "Grapes       : " + grapesQty + " kg\n" : "") +
                (watermelonQty > 0 ? "Watermelon   : " + watermelonQty + " each\n" : "") +
                (pineappleQty > 0 ? "Pineapple    : " + pineappleQty + " each\n" : "") +
                (papayaQty > 0 ? "Papaya       : " + papayaQty + " each\n" : "") +
                (strawberryQty > 0 ? "Strawberry   : " + strawberryQty + " box\n" : "") +

                "\n=============================================\n\n" +

                "Total Amount : Rs. " + total + "\n" +
                "GST (5%)     : Rs. " + gst + "\n" +
                "Final Amount : Rs. " + finalAmount + "\n\n" +

                "Thank You For Visiting Fruit Shop!"
            );
        }
    }

    // CONSOLE IMPLEMENTATION
    public static void consoleImplementation() {

        Scanner sc = new Scanner(System.in);

        int choice;
        double total = 0;

        do {

            System.out.println("\n================ FRUIT MENU =================");
            System.out.println("1. Apple       - Rs. 120 per kg");
            System.out.println("2. Banana      - Rs. 60 per dozen");
            System.out.println("3. Mango       - Rs. 150 per kg");
            System.out.println("4. Orange      - Rs. 80 per kg");
            System.out.println("5. Grapes      - Rs. 90 per kg");
            System.out.println("6. Watermelon  - Rs. 50 each");
            System.out.println("7. Pineapple   - Rs. 70 each");
            System.out.println("8. Papaya      - Rs. 60 each");
            System.out.println("9. Strawberry  - Rs. 200 per box");
            System.out.println("10. Exit");
            System.out.println("==============================================");

            System.out.print("Enter Your Choice: ");
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
                    total += 80;
                    System.out.println("Orange Added!");
                    break;

                case 5:
                    total += 90;
                    System.out.println("Grapes Added!");
                    break;

                case 6:
                    total += 50;
                    System.out.println("Watermelon Added!");
                    break;

                case 7:
                    total += 70;
                    System.out.println("Pineapple Added!");
                    break;

                case 8:
                    total += 60;
                    System.out.println("Papaya Added!");
                    break;

                case 9:
                    total += 200;
                    System.out.println("Strawberry Added!");
                    break;

                case 10:
                    System.out.println("Generating Final Bill...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 10);

        System.out.println("Final Bill = Rs. " + total);
    }

    // MAIN METHOD
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
