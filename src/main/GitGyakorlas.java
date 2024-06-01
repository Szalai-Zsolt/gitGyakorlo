
package main;


public class GitGyakorlas {

   private static int[] sorozat=new int[5];
    
   public static void main(String[] args) {
       feladatok();
    }

    private static void feladatok() {
       tombFeltoltes();
       konzolraIr("A sorozat elemei ");  
       kiirTomb(sorozat);
       progTetelekFelhasznalasa();
     
    }

        private static void progTetelekFelhasznalasa() {
           osszegzesBemutatasa();
           megszamlalasBemutatasa();
           minKivalasztBemutatasa();
           maxKivalasztBemutatasa();
           kivalasztasBemutatasa();
           eldontes_LegalabbEgyBemutatasa();
           eldontes_OsszesBemutatasa();
           linearisKeresesBemutatasa();

    } 
    
    private static void osszegzesBemutatasa() {
               
        konzolraIr("a sorozat Összege: " + osszegzes() + "\n");
     }

    private static void megszamlalasBemutatasa() {
        konzolraIr("A páros számok darabszáma: " + megszamlalas() + "\n");
        
    }

    private static void minKivalasztBemutatasa() {
        konzolraIr("A legkisebb érték indexe: " + minKivalaszt() + "\n");
    
    }

    private static void maxKivalasztBemutatasa() {
        konzolraIr("A legnagyobb érték indexe: " + maxKivalaszt() + "\n");
   
    }

        private static void kivalasztasBemutatasa() {
       konzolraIr("");
        }

    private static void eldontes_LegalabbEgyBemutatasa() {
        if (eldontes_LegalabbEgy()){
            konzolraIr("Van benne páratlan érték\n");
        } else {
            konzolraIr("Nincs benne páratlan érték\n");
        }
    }

    private static void eldontes_OsszesBemutatasa() {
        if (eldontes_Osszes()){
            konzolraIr("Nem egyezik az összes érték\n");
        } else {
            konzolraIr("Egyezik az összes érték\n");
        }
        
    }
   
    private static void linearisKeresesBemutatasa() {
      if(linearisKereses()>0){
            konzolraIr("A keresett elem helye: " + linearisKereses());
            konzolraIr("Értéke: " + sorozat[linearisKereses()]);
        }else{
            konzolraIr("nincs a keresésnek megfelelő elem:");
        }
    }
    
    private static int osszegzes(){
       int osszeg = 0;
        
       for (int i = 0; i < sorozat.length; i++) {
            osszeg += sorozat[i];
        }
       

       return osszeg;
    }
    
    private static int megszamlalas(){
        int db = 0;
        for (int i = 0; i < sorozat.length; i++) {
            if (sorozat[i] % 2 == 0) {
                db++; 
            }
        }
        return db;
    }
    
    
    private static int minKivalaszt(){
        int minIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if(sorozat[i] < sorozat[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    private static int maxKivalaszt(){
        int maxIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
           
            if(sorozat[i] > sorozat[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    private static int kivalasztas(){
        int i=0;
        int N=sorozat.length;
        while(sorozat[i] >=-5){
            i++;
        }
        return i;
    }
    
    private static boolean eldontes_LegalabbEgy(){
        int N = sorozat.length;
      
        int i = 0;
        while(i < N && !(sorozat[i] % 2 == 1 )){
            i++;
        }
        boolean valasz = i < N;  
        
    
        return valasz;
    }
    
    private static boolean eldontes_Osszes(){
        
        int N = sorozat.length;
        int ker = -10;
        int i = 0;
        while(i < N && (sorozat[i] > ker)){
            i++;
        }
        boolean valasz = i >= N;
        
        
        return valasz;
    }
    
    private static int linearisKereses(){
        int N = sorozat.length;
        int ker = 15;
        
        int i = 0;
        while(i < N && !(sorozat[i] > ker)){
            i++;
        }
       
        
        if(i < N){
               return i;
        } else{
            return -1;
        }
            
    }
    
    static void tombFeltoltes(){
        
        for (int i = 0; i < sorozat.length; i++) {
            sorozat[i] = (int)(Math.random()*12) + 9;
        }
    }
    
    private static void konzolraIr(String kimenet) {
        System.out.println(kimenet);    
    }
     private static void kiirTomb(int[] tomb) {
        
         for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println("");
    }





   
}
