


public class OlaMundoJava extends javax.swing.JFrame {

  
    public OlaMundoJava() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mensagem = new javax.swing.JLabel();
        botaoClique = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mensagem.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        mensagem.setText("Mensagem aqui");

        botaoClique.setBackground(new java.awt.Color(0, 0, 0));
        botaoClique.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoClique.setForeground(new java.awt.Color(0, 51, 255));
        botaoClique.setText("Clique aqui!");
        botaoClique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCliqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mensagem)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoClique)
                        .addGap(22, 22, 22)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(mensagem)
                .addGap(57, 57, 57)
                .addComponent(botaoClique)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void botaoCliqueActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        mensagem.setText("Hello world!");
    }                                           

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OlaMundoJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoClique;
    private javax.swing.JLabel mensagem;
    // End of variables declaration                   
}


