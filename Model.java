class Model{
    /*
     * Implementa la logica di business di un contatore
     */
    private int x;
    private int n;
    //private boolean resettabile;
    //private boolean decrementabile;
    //private boolean incrementabile;

    public Model(int n){
        this.n = n;//Valore numerico del contatore
        x = n;
        aggiorna();
    }
    private void aggiorna(){
        /*
        resettabile = isResettabile();
        incrementabile = isIncrementabile();
        decrementabile= isDecrementabile(); 
         */
        
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
            x = n;
        aggiorna();
    }

    public int getX(){
        return x;
    }

    public boolean isResettabile(){
        return (x!=n);
    }

    public boolean isDecrementabile(){
        return (x>0);
    }

    public boolean isIncrementabile(){
        return (x<n);
    }
}