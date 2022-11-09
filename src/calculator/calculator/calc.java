package calculator;

public class calc extends javax.swing.JFrame {

    private double first;//this variable used to store the first value
    private double second;//this variable used to store the second value
    private String operation;//thsi variable holds the operation
    private double result;//this variable used to store the final result

    public calc() {
        initComponents();
        setTitle("Calculator");
        setResizable(false);
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btn0 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnBackSpace = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnPercent = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(277, 368));

        jTextField1.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnBackSpace.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btnBackSpace.setText("<-");
        btnBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSpaceActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); 
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btnDot.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btn00.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btn00.setText("00");
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });

        btnMulti.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btnMulti.setText("*");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnPercent.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btnPercent.setText("%");
        btnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
	
   //these will add the String showed on the buttons to the already available string in textfield 
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) { //'1'
            String number=jTextField1.getText()+btn1.getText();
            jTextField1.setText(number);
    }

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) { //'2'
        String number=jTextField1.getText()+btn2.getText();
        jTextField1.setText(number);
    }


    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) { //'3'
         String number=jTextField1.getText()+btn3.getText();
            jTextField1.setText(number);
    }

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) { //'4'
        String number=jTextField1.getText()+btn4.getText();
            jTextField1.setText(number);
    }

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) { //'5'
        String number=jTextField1.getText()+btn5.getText();
            jTextField1.setText(number);
    }

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) { //'6'
        String number=jTextField1.getText()+btn6.getText();
            jTextField1.setText(number);
    }

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) { //'7'
        String number=jTextField1.getText()+btn7.getText();
            jTextField1.setText(number);
    }

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) { //'8'
        String number=jTextField1.getText()+btn8.getText();
            jTextField1.setText(number);
    }

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) { //'9'
        String number=jTextField1.getText()+btn9.getText();
            jTextField1.setText(number);
    }

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) { //cleares the textfield
        jTextField1.setText(null);
    }

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) { //adds a dot '.' to the string available in the textfield
       String number=jTextField1.getText()+btnDot.getText();
       jTextField1.setText(number);
    }

    //whenever the '=' button actions performed it will get the  'first'(already saved)  and typecast the string available in the 'textfield' to (double)'second' value and does the operation based on the value stored in 'operation' variable and will be showed in the textfield.
    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {
        			String answer;//this is used to store the 'result' in string format and passes it to textfield
				second=Double.parseDouble(jTextField1.getText());//typescasts the available string in the textbox to (double) and stores in 'second' variable
				if("+".equals(operation))
				{
					result=first+second;
					answer=String.format("%.2f", result);
					jTextField1.setText(answer);
				}
				else if("-".equals(operation))
				{
					result=first-second;
					answer=String.format("%.2f", result);
					jTextField1.setText(answer);
				}
				else if("*".equals(operation))
				{
					result=first*second;
					answer=String.format("%.2f", result);
					jTextField1.setText(answer);
				}
				else if("/".equals(operation))
				{
					result=first/second;
					answer=String.format("%.2f", result);
					jTextField1.setText(answer);
				}
				else if("%".equals(operation))
				{
					result=first%second;
					answer=String.format("%.2f", result);
					jTextField1.setText(answer);
				}
				
				
    }

    //this button will clear the last value of the string avilable in the textfield
    private void btnBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {
        String backSpace=null;
	if(jTextField1.getText().length()>0){
		StringBuilder str=new StringBuilder(jTextField1.getText());
		str.deleteCharAt(jTextField1.getText().length()-1);
		backSpace=str.toString();
		jTextField1.setText(backSpace);
	}
    }

    //this is used to add '0' to the available string in the textfield
    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {
        String number=jTextField1.getText()+btn0.getText();
            jTextField1.setText(number);
    }

    //this is used to add '00' to the available string stored in the textfield
    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {
        String number=jTextField1.getText()+btn00.getText();
            jTextField1.setText(number);
    }

	
    //whenver these ('+' '-' '*' '/' '%') buttons are pressed the string available on the button stores in the 'operation' variable and the string whatever available in the textfield will be typecasted and stored in (double)'first' variable  
    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) { //'+'
        first=Double.parseDouble(jTextField1.getText());
				jTextField1.setText("");
				operation="+";
    }

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) { //'-'
       first=Double.parseDouble(jTextField1.getText());
				jTextField1.setText("");
				operation="-";
    }

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) { //'*'
       first=Double.parseDouble(jTextField1.getText());
				jTextField1.setText("");
				operation="*";
    }

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) { //'/'
        first=Double.parseDouble(jTextField1.getText());
				jTextField1.setText("");
				operation="/";
    }

    private void btnPercentActionPerformed(java.awt.event.ActionEvent evt) { //'%'
        first=Double.parseDouble(jTextField1.getText());
				jTextField1.setText("");
				operation="%";
    }
	
	
	
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }


    private javax.swing.JButton btn0;
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBackSpace;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton btnPlus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;

}
