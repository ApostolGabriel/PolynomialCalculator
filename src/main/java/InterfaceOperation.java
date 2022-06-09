import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceOperation extends JFrame {

    InterfaceOperation(Polynomial p1,Polynomial p2){


        this.setLayout(new FlowLayout());
        JButton addButton = new JButton("Adunare polinoame");
        addButton.setBorder(BorderFactory.createEtchedBorder());
        addButton.setBackground(new Color(0xFF954B));
        addButton.setFont(new Font("ComicSans",Font.BOLD,25));
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == addButton) {
                    JFrame addpoly = new JFrame("Rezultatul adunarii");

                    JTextField addstring = new JTextField(PolynomialOperations.addPolynomials(p1, p2).toString());
                    addstring.setPreferredSize(new Dimension(500, 35));
                    addstring.setForeground(Color.BLACK);
                    addstring.setFont(new Font("ComicSans", Font.BOLD, 20));
                    addpoly.add(addstring);

                    JButton back = new JButton("Go back");
                    back.setBorder(BorderFactory.createEtchedBorder());
                    back.setBackground(new Color(0xFF954B));
                    back.setFont(new Font("ComicSans", Font.BOLD, 18));
                    back.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            addpoly.dispose();
                        }
                    });

                    addpoly.add(back);

                    addpoly.setLayout(new FlowLayout());
                    addpoly.setSize(520, 300);
                    addpoly.setTitle("Adunarea polinoamelor");
                    addpoly.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    addpoly.setResizable(false);
                    addpoly.setVisible(true);
                    addpoly.getContentPane().setBackground(new Color(0x004C30));

                    ImageIcon i1 = new ImageIcon("CalculatorIcon.png");
                    addpoly.setIconImage(i1.getImage());
                }
            }
        });

        JButton subButton = new JButton("Scadere polinoame");
        subButton.setBorder(BorderFactory.createEtchedBorder());
        subButton.setBackground(new Color(0xFF954B));
        subButton.setFont(new Font("ComicSans",Font.BOLD,25));
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == subButton) {
                    JFrame subpoly = new JFrame("Rezultatul scaderii");

                    JTextField substring = new JTextField(PolynomialOperations.subPolynomials(p1, p2).toString());
                    substring.setPreferredSize(new Dimension(500, 35));
                    substring.setForeground(Color.BLACK);
                    substring.setFont(new Font("ComicSans", Font.BOLD, 20));
                    subpoly.add(substring);

                    JButton back = new JButton("Go back");
                    back.setBorder(BorderFactory.createEtchedBorder());
                    back.setBackground(new Color(0xFF954B));
                    back.setFont(new Font("ComicSans", Font.BOLD, 18));
                    back.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            subpoly.dispose();
                        }
                    });

                    subpoly.add(back);

                    subpoly.setLayout(new FlowLayout());
                    subpoly.setSize(520, 300);
                    subpoly.setTitle("Scaderea polinoamelor");
                    subpoly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    subpoly.setResizable(false);
                    subpoly.setVisible(true);
                    subpoly.getContentPane().setBackground(new Color(0x004C30));

                    ImageIcon i1 = new ImageIcon("CalculatorIcon.png");
                    subpoly.setIconImage(i1.getImage());
                }
            }
        });

        JButton mulButton = new JButton("Inmultire polinoame");
        mulButton.setBorder(BorderFactory.createEtchedBorder());
        mulButton.setBackground(new Color(0xFF954B));
        mulButton.setFont(new Font("ComicSans",Font.BOLD,25));
        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == mulButton) {
                    JFrame mulpoly = new JFrame("Rezultatul inmultirii");

                    JTextField mulstring = new JTextField(PolynomialOperations.multiplicatePolynomials(p1, p2).toString());
                    mulstring.setPreferredSize(new Dimension(500, 35));
                    mulstring.setForeground(Color.BLACK);
                    mulstring.setFont(new Font("ComicSans", Font.BOLD, 20));
                    mulpoly.add(mulstring);

                    JButton back = new JButton("Go back");
                    back.setBorder(BorderFactory.createEtchedBorder());
                    back.setBackground(new Color(0xFF954B));
                    back.setFont(new Font("ComicSans", Font.BOLD, 18));
                    back.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            mulpoly.dispose();
                        }
                    });

                    mulpoly.add(back);

                    mulpoly.setLayout(new FlowLayout());
                    mulpoly.setSize(520, 300);
                    mulpoly.setTitle("Inmultirea polinoamelor");
                    mulpoly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    mulpoly.setResizable(false);
                    mulpoly.setVisible(true);
                    mulpoly.getContentPane().setBackground(new Color(0x004C30));

                    ImageIcon i1 = new ImageIcon("CalculatorIcon.png");
                    mulpoly.setIconImage(i1.getImage());
                }
            }
        });

        JButton divButton = new JButton("Impartire polinoame");
        divButton.setBorder(BorderFactory.createEtchedBorder());
        divButton.setBackground(new Color(0xFF954B));
        divButton.setFont(new Font("ComicSans",Font.BOLD,25));
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == divButton) {
                    JFrame dpoly = new JFrame("Rezultatul impartirii");

                    JLabel dstring1 = new JLabel("Catul este ");
                    dstring1.setSize(new Dimension(40, 35));
                    dstring1.setForeground(Color.WHITE);
                    dstring1.setFont(new Font("ComicSans", Font.BOLD, 23));
                    dpoly.add(dstring1);
                    if(PolynomialOperations.dividePolynomials(p1, p2)[0]!=null) {
                        JTextField divQuotient = new JTextField(PolynomialOperations.dividePolynomials(p1, p2)[0].toString());
                        divQuotient.setPreferredSize(new Dimension(500, 35));
                        divQuotient.setForeground(Color.BLACK);
                        divQuotient.setFont(new Font("ComicSans", Font.BOLD, 20));
                        dpoly.add(divQuotient);
                    }
                    else {
                        JLabel str = new JLabel("Gradul lui p1 e mai mic decat p2");
                        str.setSize(new Dimension(40, 35));
                        str.setForeground(Color.WHITE);
                        str.setFont(new Font("ComicSans", Font.BOLD, 23));
                        dpoly.add(str);
                    }

                    JLabel dstring2 = new JLabel("Restul este");
                    JTextField divResult;
                    if(PolynomialOperations.dividePolynomials(p1, p2)[1]==null) {
                        divResult = new JTextField("Nu se poate calcula restul");
                    }
                    else if(PolynomialOperations.dividePolynomials(p1,p2)[1]!=null && PolynomialOperations.dividePolynomials(p1,p2)[1].toString()==""){
                        divResult = new JTextField("0");
                    }
                    else {
                        divResult = new JTextField(PolynomialOperations.dividePolynomials(p1, p2)[1].toString());
                    }
                    divResult.setPreferredSize(new Dimension(500, 35));
                    divResult.setForeground(Color.BLACK);
                    divResult.setFont(new Font("ComicSans", Font.BOLD, 20));
                    dstring2.setSize(new Dimension(40, 35));
                    dstring2.setForeground(Color.WHITE);
                    dstring2.setFont(new Font("ComicSans", Font.BOLD, 23));
                    dpoly.add(dstring2);
                    dpoly.add(divResult);

                    JButton back = new JButton("Go back");
                    back.setBorder(BorderFactory.createEtchedBorder());
                    back.setBackground(new Color(0xFF954B));
                    back.setFont(new Font("ComicSans", Font.BOLD, 18));
                    back.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dpoly.dispose();
                        }
                    });

                    dpoly.add(back);

                    dpoly.setLayout(new FlowLayout());
                    dpoly.setSize(520, 300);
                    dpoly.setTitle("Impartirea polinoamelor");
                    dpoly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dpoly.setResizable(false);
                    dpoly.setVisible(true);
                    dpoly.getContentPane().setBackground(new Color(0x004C30));

                    ImageIcon i1 = new ImageIcon("CalculatorIcon.png");
                    dpoly.setIconImage(i1.getImage());
                }
            }
        });

        JButton derivButton = new JButton("Derivatele polinoamelor");
        derivButton.setBorder(BorderFactory.createEtchedBorder());
        derivButton.setBackground(new Color(0xFF954B));
        derivButton.setFont(new Font("ComicSans",Font.BOLD,25));
        derivButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == derivButton) {
                    JFrame derpoly = new JFrame("Derivatele polinoamelor");

                    JLabel derstring1 = new JLabel("Derivata primului polinom: ");
                    derstring1.setSize(new Dimension(40, 35));
                    derstring1.setForeground(Color.WHITE);
                    derstring1.setFont(new Font("ComicSans", Font.BOLD, 23));
                    derpoly.add(derstring1);
                    JTextField derivp1 = new JTextField(PolynomialOperations.derivativePolynomial(p1).toString());
                    derivp1.setPreferredSize(new Dimension(500, 35));
                    derivp1.setForeground(Color.BLACK);
                    derivp1.setFont(new Font("ComicSans", Font.BOLD, 20));
                    derpoly.add(derivp1);


                    JLabel derstring2 = new JLabel("Derivata al doilea polinom: ");
                    derstring2.setSize(new Dimension(40, 35));
                    derstring2.setForeground(Color.WHITE);
                    derstring2.setFont(new Font("ComicSans", Font.BOLD, 23));
                    derpoly.add(derstring2);
                    JTextField derivp2 = new JTextField(PolynomialOperations.derivativePolynomial(p2).toString());
                    derivp2.setPreferredSize(new Dimension(500, 35));
                    derivp2.setForeground(Color.BLACK);
                    derivp2.setFont(new Font("ComicSans", Font.BOLD, 20));
                    derpoly.add(derivp2);

                    JButton back = new JButton("Go back");
                    back.setBorder(BorderFactory.createEtchedBorder());
                    back.setBackground(new Color(0xFF954B));
                    back.setFont(new Font("ComicSans", Font.BOLD, 18));
                    back.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            derpoly.dispose();
                        }
                    });

                    derpoly.add(back);

                    derpoly.setLayout(new FlowLayout());
                    derpoly.setSize(520, 300);
                    derpoly.setTitle("Derivatele polinoamelor");
                    derpoly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    derpoly.setResizable(false);
                    derpoly.setVisible(true);
                    derpoly.getContentPane().setBackground(new Color(0x004C30));

                    ImageIcon i1 = new ImageIcon("CalculatorIcon.png");
                    derpoly.setIconImage(i1.getImage());
                }
            }
        });

        JButton integButton = new JButton("Integrarea polinoamelor");
        integButton.setBorder(BorderFactory.createEtchedBorder());
        integButton.setBackground(new Color(0xFF954B));
        integButton.setFont(new Font("ComicSans",Font.BOLD,25));
        integButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == integButton) {
                    JFrame ipoly = new JFrame("Integralele polinoamelor");

                    JLabel istring1 = new JLabel("Integrala primului polinom: ");
                    istring1.setSize(new Dimension(40, 35));
                    istring1.setForeground(Color.WHITE);
                    istring1.setFont(new Font("ComicSans", Font.BOLD, 23));
                    ipoly.add(istring1);
                    JTextField integ1 = new JTextField(PolynomialOperations.integratePolynomial(p1).toString());
                    integ1.setPreferredSize(new Dimension(500, 35));
                    integ1.setForeground(Color.BLACK);
                    integ1.setFont(new Font("ComicSans", Font.BOLD, 20));
                    ipoly.add(integ1);

                    JLabel istring2 = new JLabel("Integrala al doilea polinom: ");
                    istring2.setSize(new Dimension(40, 35));
                    istring2.setForeground(Color.WHITE);
                    istring2.setFont(new Font("ComicSans", Font.BOLD, 23));
                    ipoly.add(istring2);
                    JTextField integ2 = new JTextField(PolynomialOperations.integratePolynomial(p2).toString());
                    integ2.setPreferredSize(new Dimension(500, 35));
                    integ2.setForeground(Color.BLACK);
                    integ2.setFont(new Font("ComicSans", Font.BOLD, 20));
                    ipoly.add(integ2);

                    JButton back = new JButton("Go back");
                    back.setBorder(BorderFactory.createEtchedBorder());
                    back.setBackground(new Color(0xFF954B));
                    back.setFont(new Font("ComicSans", Font.BOLD, 18));
                    back.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            ipoly.dispose();
                        }
                    });

                    ipoly.add(back);

                    ipoly.setLayout(new FlowLayout());
                    ipoly.setSize(520, 300);
                    ipoly.setTitle("Integrarea Polinoamelor");
                    ipoly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ipoly.setResizable(false);
                    ipoly.setVisible(true);
                    ipoly.getContentPane().setBackground(new Color(0x004C30));

                    ImageIcon i1 = new ImageIcon("CalculatorIcon.png");
                    ipoly.setIconImage(i1.getImage());
                }
            }
        });

        JButton backButton = new JButton("Go back");
        backButton.setBorder(BorderFactory.createEtchedBorder());
        backButton.setBackground(new Color(0xFF954B));
        backButton.setFont(new Font("ComicSans",Font.BOLD,18));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfaceOperation.super.dispose();
                new Interface();
            }
        });

        this.add(addButton);
        this.add(subButton);
        this.add(mulButton);
        this.add(divButton);
        this.add(derivButton);
        this.add(integButton);
        this.add(backButton);
        this.setSize(500,500);
        this.setTitle("Calculator pentru operatii cu polinoame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x004C30));

        ImageIcon i1 = new ImageIcon("CalculatorIcon.png");
        this.setIconImage(i1.getImage());
    }

}
