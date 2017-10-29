
package InversoPotenciacion;

import java.awt.List;
import java.util.ArrayList;

public class Inverso {
    private long R0aux,R1or;
    private ArrayList<Long> qs = new ArrayList<Long>();
    private StringBuffer Resultado=new StringBuffer("");
    
//   public static void main(String Args[])
//   {
//       String res=Inverso.invertir(121*20857, 51504);
//       System.out.println(res);      
//   }
   
   public String invertir(long R0,long R1)
   {
       Inverso Inv=new Inverso();
       StringBuffer aux;
       if(Inv.TieneInverso(R0, R1)){
           Inv.inverso();
       }
       aux=Inv.getResultado();
       return aux.toString();
   }

    public StringBuffer getResultado() {
        return Resultado;
    }
   
   
   
   public  Boolean TieneInverso(long R0,long R1)
    { 
        if(R1>R0)
        {
            long aux=R0;
            R0=R1;
            R1=aux;
        }
        R0aux=R0;
        R1or=R1;
        return this.TieneInverso(R0,R1,0);
    } 
   
    public  Boolean TieneInverso(long R0,long R1,long i)
    {        
        long q,res;
        q= R0/R1;
        res=R0%R1;
        qs.add(q);
        //System.out.println("Q"+i+" :"+q+" res:"+res);
        Resultado.append("Q"+i+" :"+q+" res:"+res+"\n");
        if(res==1)
            return true;
        if(res==0){
            Resultado.append("No tiene inverso\n");
            return false;
            
        }
        return (TieneInverso(R1, res,i+1));       
    }
    public long inverso()
    {
        return this.inverso(R0aux, 0, 1, 0);
    }
    private long inverso (long R0,long t0,long t1, int i)
    {      
            
            long t2;
            t2=(t0-qs.get(i)*t1);//%R0;
            if(t2<0 && t2>(-R0)){
                //System.out.println("Algoritmos.Inverso.inverso()");
                t2=R0+t2;
            }
            else{
                //System.out.println(t2);
                t2=t2%R0;
                if(t2<0 && t2>(-R0)){
                t2=R0+t2;
                }
                
            }
            //System.out.println("T"+(i+2)+"= (t"+i+" - t"+(i+1)+"*q"+(i+1)+")mod(R0) :"+t2+"");
            //System.out.println("    ("+ t0 +" - "+t1+"*"+qs.get(i)+" )mod("+R0+" )");
            Resultado.append("T"+(i+2)+"= (t"+i+" - t"+(i+1)+"*q"+(i+1)+")mod(R0) :"+t2+"\n"
                    + "    ("+ t0 +" - "+t1+"*"+qs.get(i)+" )mod("+R0+" )"+"\n");
            if(qs.size()==i+1){                
                //System.out.println(R1or+"*"+t2+" =1");
                Resultado.append(R1or+"*"+t2+" mod("+R0+") =1"+"\n");
                Resultado.append("Inverso: "+t2+"\n");
                
                return t2;
            }
            return this.inverso(R0,t1,t2,i+1);
            
      
    }
    
    
    
}
