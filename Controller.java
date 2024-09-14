import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class Controller {
    private JFrame f;
    private JPanel page;
    private JTextField input;
    private JLabel labelEnter;
    private JButton btnSubmit;
    private Model m;


    static final int ScreenWidth = 500; 
    static final int ScreeenHeight = 500;

    public Controller(){
        f = new JFrame("Controller");
        addContent();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(new Dimension(ScreenWidth, ScreeenHeight));
        f.setResizable(false);
        f.setLocationRelativeTo(null);
    }
    private void addContent(){
        page = new JPanel();
        page.setBounds(0, 0, ScreenWidth, ScreeenHeight);
        page.setLayout(null);

        labelEnter = new JLabel("Enter 8 digits code: ");
        labelEnter.setBounds(60, 200, 150, 100);

        input = new JTextField();
        input.setBounds(180, 240, 100, 24);

        btnSubmit  = new JButton("SUBMIT");
        btnSubmit.setBounds(190, 264, 80, 20);

        page.add(labelEnter);
        page.add(input);
        page.add(btnSubmit);
        f.add(page);

        initialize();
        
    }
    private void initialize(){
        m = new Model();
        ActionBtn a = new ActionBtn();
        btnSubmit.addActionListener(a);
    }
    private class ActionBtn implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton s = (JButton) e.getSource();

            if (s == btnSubmit){
                m.getData(input.getText());
            }
        }
        
    }
    public void dispose() {
        System.exit(0);
    }
    
}