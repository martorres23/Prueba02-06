package prueba_02.pkg06;

public class Prueba_0206 {

    public static void main(String[] args) {
      int numero,veces, i, r;
      numero=5;
      veces=2;
      i=0;
      r=1;
      while(i<veces){
          r=(r* numero);
          i++;
      }
      System.out.println("El reultado de la potencia [ "+numero+"^"+veces+" ] es: [ "+r+" ]");
    }
    
}
