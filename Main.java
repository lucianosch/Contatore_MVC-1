class Main{
  public static void main(String[] args){
    View vista = new View("Contatore");
    Model modello = new Model(5);
    new Controller(vista,modello); 
  }
}