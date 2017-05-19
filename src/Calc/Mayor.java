
package Calc;

/**
 *
 * @author Juan
 */
public class Mayor {
    public static int obt_mayorNumero(int lista[]){
        //int indice,max=Integer.MAX_VALUE;
        int indice,max=Integer.MIN_VALUE;
        /*for(indice=0;indice<lista.length-1;indice++){
            if (lista[indice]>max) {
                max=lista[indice];
            }*/
           for (indice = 0; indice < lista.length;indice++){
            if (lista[indice]>max) {
                max=lista[indice];
            }
        }
        return max;
    }
}
