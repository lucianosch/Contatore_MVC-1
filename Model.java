class Model{
  /*
  * Implementa la logica di business di un contatore
  */
  
  private int x;
  private boolean resettabile;
	private boolean decrementabile;
	private boolean incrementabile;
  public Model(){
    x = 10;//Valore numerico del contatore
		decrementabile = true;
		incrementabile = false; 
    resettabile = false;
		 //Indica se il contatore è azzerabile
  }
  private void aggiorna(){
		resettabile = isResettabile();
		incrementabile = isIncrementabile();
		decrementabile= isDecrementabile();
  }
	public void incrementa(){
    if(isIncrementabile())
      x++;
    aggiorna();
  }

  public void decrementa(){
    if (isDecrementabile())
			x--;
    aggiorna();
  }

  public void reset(){
    if (isResettabile())
      x = 10;
    aggiorna();
  }

  public int getX(){
    return x;
  }
  
  public boolean isResettabile(){
    return (x<5);//>5
	
  }

	public boolean isDecrementabile(){
		return (x>0);
	}
	public boolean isIncrementabile(){
		return (x<10);
	}
}