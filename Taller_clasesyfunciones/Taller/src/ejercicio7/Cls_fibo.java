package ejercicio7;


public class Cls_fibo
{
    public int [] fibo (int n)
    {
        int a,b,c;
        a = 0;
        b = 1;
        int[]numero = new int[n];
        
         for (int i = 0; i < n; i++) 
         {
            numero [i] = a;
            c = a + b;
            a = b;
            b = c;
        }
         return numero;
    }
}
