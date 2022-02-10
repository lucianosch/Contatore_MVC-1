import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
// Realizza l'interazione tra Vista e modello

class Controller{
  private View vista;
  private Model modello;

  public Controller(View vista, Model modello){
    this.vista = vista;
    this.modello = modello;
    assegnaGestori();
    setView();
  }

  public void setView(){
    vista.getBtnReset().setEnabled(modello.isResettabile());
		vista.getBtnDecrementa().setEnabled(modello.isDecrementabile());
    vista.setEtichetta(Integer.toString(modello.getX()));
		vista.getBtnIncrementa().setEnabled(modello.isIncrementabile());
  }

  private void assegnaGestori(){

    ActionListener gestoreDecremento;
		ActionListener gestoreIncremento;
    ActionListener gestoreReset;

		gestoreIncremento = new ActionListener(){
      public void actionPerformed(ActionEvent e){
        modello.incrementa();
				setView();
			}
		};

    gestoreDecremento = new ActionListener(){
      public void actionPerformed(ActionEvent e){
        modello.decrementa();
        setView();
      }
    };

    vista.getBtnDecrementa().addActionListener(gestoreDecremento);

    gestoreReset = new ActionListener(){
      public void actionPerformed(ActionEvent e){
        modello.reset();
        setView();
      }
    };

    vista.getBtnReset().addActionListener(gestoreReset);
		vista.getBtnIncrementa().addActionListener(gestoreIncremento);
  }
}