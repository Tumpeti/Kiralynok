package kiralynok;

import java.util.Random;


public class Tabla {
    private char T[][];
    private char UresCella;
    
    public Random rnd = new Random();

    public Tabla(char UresCella) {
        T = new char[8][8];
        this.UresCella = UresCella;
        for (int sor = 0; sor < T.length; sor++) {
            for (int oszlop = 0; oszlop < T[sor].length; oszlop++) {
                T[sor][oszlop] = UresCella;
                
            }
        }
    }
    
    public void Megjelenit(){
        for (int sor = 0; sor < this.T.length; sor++) {
            System.out.println("");
            for (int oszlop = 0; oszlop < this.T[sor].length; oszlop++) {
                System.out.print(this.T[sor][oszlop]+" ");
    }
    
} System.out.println("");
    }
    public void Elhelyez(int db){
        int elhelyezettK =0;
        while (db != elhelyezettK) {
            int veletlen0 = rnd.nextInt(0, 8);
            int veletlen1 = rnd.nextInt(0, 8);
            //System.out.println("T[veletlen0][veletlen1]= "+T[veletlen0][veletlen1]);
            if (T[veletlen0][veletlen1]==this.UresCella){
                T[veletlen0][veletlen1] = 'K';
                elhelyezettK+=1;
            }
        }
    }
    
    public boolean UresOszlop(int oszlop){
       
        
        for (int sor = 0; sor < T.length; sor++) {
                if (T[sor][oszlop] != UresCella){
                    
                    return false;
                }
                
            }
        
        
        return true;
    }
    
    public boolean UresSor(int sor){
        
        for (int oszlop =0;oszlop <T[sor].length;oszlop++){
            //System.out.println("T[sor][oszlop]= "+T[sor][oszlop]);
            if(T[sor][oszlop]!=UresCella){
                return false;
                
            }
        }
        return true;
        
    }
}

