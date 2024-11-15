import javax.swing.*;
import java.awt.*;

class View{
    // Definisce gli elementi grafici che costituiscono la vista (GUI)

    private JFrame finestra;
    private JButton btnReset;
    private JButton btnDecrementa;
    private JButton btnIncrementa;
    private JLabel etichetta; 
    private JPanel p; 

    public View(String titolo){
        finestra = new JFrame(titolo);
        finestra.getContentPane().setLayout(new BorderLayout());
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setSize(250,250);
        finestra.setLocationRelativeTo(null);
        finestra.setResizable(false);

        etichetta = new JLabel("");
        etichetta.setHorizontalAlignment(SwingConstants.CENTER);
        etichetta.setFont(new Font(etichetta.getFont().getName(), Font.BOLD, 48));
        finestra.getContentPane().add(etichetta,BorderLayout.CENTER);

        btnReset = new JButton("Reset");
        finestra.getContentPane().add(btnReset,BorderLayout.NORTH);

        p =new JPanel(new FlowLayout());
        btnDecrementa = new JButton("Decrementa");
        btnIncrementa = new JButton("Incrementa");
        p.add(btnDecrementa);
        p.add(btnIncrementa);
        finestra.getContentPane().add(p,BorderLayout.SOUTH);
        finestra.setVisible(true);

    }

    public JButton getBtnIncrementa(){
        return btnIncrementa;
    }

    public void setBtnIncrementa(boolean b){
        btnIncrementa.setEnabled(b);
    }

    public JButton getBtnDecrementa(){
        return btnDecrementa;
    }

    public void setBtnDecrementa(boolean b){
        btnDecrementa.setEnabled(b);
    }

    public JButton getBtnReset(){
        return btnReset;
    }

    public void setBtnReset(boolean b){
        btnReset.setEnabled(b);
    }

    public void setEtichetta(int n){
        etichetta.setText(Integer.toString(n));
    }
}