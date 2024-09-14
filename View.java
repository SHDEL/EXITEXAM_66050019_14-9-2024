import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
     private JFrame f;
    private JPanel page;
    private JLabel titleLabel;
    private JLabel labelMilkPlain, labelMilkChoco, labelMilkStrawberry;

    static final int ScreenWidth = 500; 
    static final int ScreeenHeight = 500;

    public View(String milk_plain, String milk_choco, String milk_strawberry){
        f = new JFrame("View");
        addContent(milk_plain, milk_choco, milk_strawberry);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setSize(new Dimension(ScreenWidth, ScreeenHeight));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
    }
    private void addContent(String milk_plain, String milk_choco, String milk_strawberry){
        page = new JPanel();
        page.setBounds(0, 0, ScreenWidth, ScreeenHeight);
        page.setLayout(null);

        titleLabel = new JLabel("Milk Calculate Result");
        titleLabel.setBounds(200, 50, 150, 100);
        // สร้าง JLabel สำหรับแสดงผลนมแต่ละชนิด
        labelMilkPlain = new JLabel("Milk Plain: " + milk_plain + " liters");
        labelMilkPlain.setBounds(60, 120, 150, 100);
        labelMilkChoco = new JLabel("Milk Choco: " + milk_choco + " liters");
        labelMilkChoco.setBounds(60, 140, 150, 100);
        labelMilkStrawberry = new JLabel("Milk Strawberry: " + milk_strawberry + " liters");
        labelMilkStrawberry.setBounds(60, 160, 150, 100);

        // เพิ่ม JLabel ลงใน JPanel
        page.add(titleLabel);
        page.add(labelMilkPlain);
        page.add(labelMilkChoco);
        page.add(labelMilkStrawberry);

        // เพิ่ม JPanel ลงใน JFrame
        f.add(page);
    }
}
