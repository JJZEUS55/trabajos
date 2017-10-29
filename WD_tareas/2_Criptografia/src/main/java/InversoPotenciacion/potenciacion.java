/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InversoPotenciacion;

public class potenciacion {

//    public static void main(String[] args) {
//        potenciacion po = new potenciacion();
//        po.pot(28199, 18701, 17465);
//        po.pot(28199, 27707, 209);
//    }

    public String pot(int n, int b, int c)// pot= b^c mod n
    {
        String C = Integer.toBinaryString(c);
        String res = null;
        res = "Algoritmos.potenciacion.pot()" + C + "\n";
        //System.out.println("Algoritmos.potenciacion.pot()"+C);
        int z = 1;
        for (int i = 0; i <= C.length() - 1; i++) {
            z = (z * z) % n;
            //System.out.println(C.charAt(i));
            if (C.charAt(i) == '1') {
                z = (b * z) % n;
                //System.out.println("Entro"+z);
            } else {

                //System.out.println(i+"No Entro"+z);
            }
            res = res + i + " : " + z + "\n";
            //System.out.println(i+" : "+z);
        }
//        System.out.println(z);
        res = res + z;
        return res;
    }

}
