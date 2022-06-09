import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame implements ActionListener {

    JButton b1 = new JButton("OK");
    JTextField stringp1 = new JTextField("Scrie Polinom");
    JTextField stringp2 = new JTextField("Scrie Polinom");

    Interface(){

        //GridLayout calculatorLayout = new GridLayout(1,2);
        //this.setLayout(calculatorLayout);
        this.setLayout(new FlowLayout());

        ImageIcon i1 = new ImageIcon("CalculatorIcon.png");
        this.setIconImage(i1.getImage());

        stringp1.setPreferredSize(new Dimension(500,35));
        stringp1.setFont(new Font("Consolas",Font.PLAIN,15));
        stringp1.setForeground(Color.BLACK);
        //stringp1.setBackground(new Color(0x9CEE85));
        stringp2.setPreferredSize(new Dimension(500,35));
        stringp2.setFont(new Font("Consolas",Font.PLAIN,15));
        stringp2.setForeground(Color.BLACK);
        //stringp2.setBackground(new Color(0x9CEE85));

        b1.setBorder(BorderFactory.createEtchedBorder());
        b1.setBackground(new Color(0xFF954B));
        b1.setFont(new Font("ComicSans",Font.BOLD,18));
        b1.addActionListener(this);

        this.add(stringp1);
        this.add(stringp2);

        this.add(b1);


        this.setSize(520,160);
        this.setTitle("Calculator pentru operatii cu polinoame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x004C30));
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            Polynomial p1 = new Polynomial(stringp1.getText());
            Polynomial p2 = new Polynomial(stringp2.getText());
            this.dispose();
            new InterfaceOperation(p1,p2);
        }
    }
}
