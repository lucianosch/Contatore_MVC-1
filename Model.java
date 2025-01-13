class Model{
    /*
     * Implementa la logica di business di un contatore
     */
    private int x;
    private int n;

    public Model(int n){
        this.n = n;//Valore numerico del contatore
        x = n;
    }
    
    public void incrementa(){
        if(isIncrementabile())
            x++;
    }

    public void decrementa(){
        if (isDecrementabile())
            x--;
    }

    public void reset(){
        if (isResettabile())
            x = n;
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