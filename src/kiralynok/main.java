
package kiralynok;


public class main {

    
    public static void main(String[] args) {
        Tabla t1 = new Tabla('0');
        t1.Megjelenit();
        t1.Elhelyez(8);
        t1.Megjelenit();
        System.out.println("Üres a 0. oszlop: "+t1.UresOszlop(0));
        System.out.println("Üres a 0. sor: "+t1.UresSor(0));
    }
    
}
