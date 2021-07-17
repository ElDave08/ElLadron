package el.ladron;

import javax.swing.JOptionPane;

public class Ladronix {
    
    public static void main (String [] args){
        int Ladrx = (int)(Math.random()*10);
        int Ladry = (int)(Math.random()*10);
        int direc,direcl, des, contador;
        String rep;
        boolean bien, salir = false; 
        CodigLadronix lv = new CodigLadronix(Ladrx, Ladry, 0, 0);
        
        
        JOptionPane.showMessageDialog(null, "PERSIGUIENDO AL LADRON");
        JOptionPane.showMessageDialog(null, "Instrucciones:\n"
                + "El objetivo del juego es que su personaje(1) atrape al ladron(2)\n"
                + "en la menor cantidad de movimientos posibles");
        JOptionPane.showMessageDialog(null, "DATO: El ladron se mueve 3 casillas por turno");
       

        do{
            contador =0;
            lv.x=0;
            lv.y=0;
            System.out.println("Mapa: ");
            for(int i=0; i<10;i++){
                for(int j=0; j<10;j++){
                    System.out.print(lv.imp(i,j)+" ");
                
                }
                System.out.println("");
            
            }

            
            do{
        
                do{
                    bien =true;
                    direcl =(int)((Math.random()*10)/3);
            
                    switch(direcl){
                        case 0: if((lv.Ladrx+3)<10){
                                    lv.Abajol();
                                    }
                                
                                else{
                                    bien =false;
                                }
                        break;
                        
                        case 1: if((lv.Ladry+3)<10){
                                    lv.Derechal();
                                }
                        
                                else{
                                    bien =false;
                                }
                            break;
                
                        case 2: if((lv.Ladry-3)>=0){
                                    lv.Izquierdal();
                                }
                        
                                else{
                                    bien =false;
                                }
                            break;
                            
                        case 3: if((lv.Ladrx-3)>=0){
                                    lv.Arribal();
                                }
                
                                else{
                                    bien =false;
                                }
                            break;
            
        
                    }
                }while(bien == false);
        
        
                do{
                    bien = true;
                    direc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la direccion en la que quiere avanzar:\n"
                            + "1. Arriba\n"
                            + "2. Abajo\n"
                            + "3. Izquierda\n"
                            + "4. Derecha\n"
                            + "5. No Moverse\n"
                            + "6. Salir del Juego"));
          
                    switch(direc){
                        case 1: des = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de casillas a avanzar: "));
                                if((lv.x -des) < 0){
                                    JOptionPane.showMessageDialog(null, "La posicion elegida esta fuera del tablero");
                                    bien = false;
                                }
                                
                                else{lv.Arriba(des);}
                        break;
                        
                        case 2: des = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de casillas a avanzar: "));
                                    if((lv.x +des) > 9){
                                        JOptionPane.showMessageDialog(null, "La posicion elegida esta fuera del tablero");
                                        bien = false;
                                    }
                                    
                                    else{lv.Abajo(des);}
                        break;
                        
                        case 3: des = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de casillas a avanzar: "));
                                    if((lv.y -des) < 0){
                                        JOptionPane.showMessageDialog(null, "La posicion elegida esta fuera del tablero");
                                        bien = false;
                                    }
                                    else{lv.Izquierda(des);}
                        break;
                        
                        case 4: des = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de casillas a avanzar: "));
                                if((lv.y +des) > 9){
                                    JOptionPane.showMessageDialog(null, "La posicion elegida esta fuera del tablero");
                                    bien = false;
                                }
                                
                                else{lv.Derecha(des);}
                        break;
                        
                        case 5: break;
                        
                        case 6: salir =true;
                                break;
                
                        default: JOptionPane.showMessageDialog(null, "El numero elgido no esta entre las opciones");
                            bien = false;
                    }
           
                }while(bien == false);
                bien =false;
                if(salir == false){
                    
                    if(lv.x ==lv.Ladrx && lv.y == lv.Ladry){
                        System.out.println("Ganaste!!! ");
                        for(int i=0; i<10;i++){
                            for(int j=0; j<10;j++){
                                System.out.print(lv.imp(i,j)+" ");
                            }
                        System.out.println("");
                        }
                    }
                    else{
                    
                        System.out.println("Posiciones: ");
                        for(int i=0; i<10;i++){
                            for(int j=0; j<10;j++){
                                System.out.print(lv.imp(i,j)+" ");
                            }
                        System.out.println("");
                        }
                    }
                    
                    contador++;
                    if(lv.x ==lv.Ladrx && lv.y == lv.Ladry){
                        JOptionPane.showMessageDialog(null, "FELICIADES!!! HAS CAPTURADO AL LADRON EN "+contador+" INTENTOS");
                        bien = true;
                    }
                }
                
                else{
                    bien =true;
                }
                
                }while(bien == false);
        
        rep = JOptionPane.showInputDialog("Desea jugar de nuevo? Si/No");
        }while("SI".equals(rep.toUpperCase()));
        
        JOptionPane.showMessageDialog(null, "Gracias por Jugar!!!");
    }
}
