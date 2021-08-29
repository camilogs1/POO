package ejercicio5;



public class Cls_ope
{
    public int facto (int n)
    {
       int facto = 1;
       while ( n!=0) 
       {
            facto = facto*n;
            n--;
       } 
       return facto;
    }
}
