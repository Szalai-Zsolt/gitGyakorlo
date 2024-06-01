
package main;


public class GitGyakorlas {

   private static int[] sorozat=new int[5];
    
   public static void main(String[] args) {
       feladatok();
    }

    private static void feladatok() {
       tombFeltoltes();
       osszegzes();
       megszamlalas();
       minKivalaszt();
    }

    private static int osszegzes(){
       int osszeg = 0;
        
       for (int i = 0; i < sorozat.length; i++) {
            osszeg += sorozat[i];
        }
       
       konzolraIr("a sorozat Összege: " + osszeg + "\n");
       return osszeg;
    }
    
    private static int megszamlalas(){
        int db = 0;
        for (int i = 0; i < sorozat.length; i++) {
            if (sorozat[i] % 2 == 0) {
                db++; 
            }
        }
        konzolraIr("A páros számok darabszáma: " + db + "\n");
        return db;
    }
    
    
    private static int minKivalaszt(){
        int minIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if(sorozat[i] < sorozat[minIndex]){
                minIndex = i;
            }
        }
        konzolraIr("A legkisebb érték indexe: " + minIndex + "\n");
        return minIndex;
    }
    
    private static int maxKivalaszt(){
        int maxIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
           
            if(sorozat[i] > sorozat[maxIndex]){
                maxIndex = i;
            }
        }
        konzolraIr("A legnagyobb érték indexe: " + maxIndex + "\n");
        return maxIndex;
    }
    
    private static int kivalasztas(){
        return 0;
    }
    
    private static boolean eldontes_LegalabbEgy(){
        return false;
    }
    
    private static boolean eldontes_Osszes(){
        return false;
    }
    
    private static int linearisKereses(){
        return -1;
    }
    
    static void tombFeltoltes(){
        
        for (int i = 0; i < sorozat.length; i++) {
            sorozat[i] = (int)(Math.random()*12) + 9;
        }
    }
    
    private static void konzolraIr(String kimenet) {
        System.out.println(kimenet);    
    }
    
}
