class Main{
  public static void main(String[] args){
    View vista = new View("Contatore");
    Model modello = new Model();
    Controller controllore = new Controller(vista,modello); 
    controllore.setView();
  }
}