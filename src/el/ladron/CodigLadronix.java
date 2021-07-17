package el.ladron;

public class CodigLadronix {
    public int Ladrx;
    public int Ladry;
    public int x;
    public int y;
    public int mapa[][]=new int[10][10];

    public CodigLadronix(int Ladrx, int Ladry, int x, int y) {
        this.Ladrx = Ladrx;
        this.Ladry = Ladry;
        this.x = x;
        this.y = y;
    }


    public int imp(int x, int y){
        mapa[Ladrx][Ladry]= 2;
        mapa[this.x][this.y] = 1;
        return mapa[x][y];
        
    }
 
    
    public int Arriba(int des){
        mapa[x][y] = 0;
        x -=des;
        mapa[x][y] = 1;
     return mapa[x][y];
    }
    
    public int Abajo(int des){
         mapa[x][y] = 0;
        x += des;
        mapa[x][y] = 1;
        return mapa[x][y];
    }
    
    public int Izquierda(int des){
        mapa[x][y] = 0;
        y-=des;
        mapa[x][y] = 1;
        return mapa[x][y];
       
    }
    
    public int Derecha(int des){
        mapa[x][y] = 0;
        y +=des;
        mapa[x][y] = 1;
        return mapa[x][y];
    }
    
    
    
    
    
    public void Arribal(){
        mapa[Ladrx][Ladry] = 0;
        Ladrx -=3;
        
    
    }
    
    public void Abajol(){
        mapa[Ladrx][Ladry] = 0;
        Ladrx += 3;
      
    }
    
    public void Izquierdal(){
        mapa[Ladrx][Ladry] = 0;
        Ladry-=3;
        
       
    }
    
    public void Derechal(){
        mapa[Ladrx][Ladry] = 0;
        Ladry +=3;
        
    }
   

}
