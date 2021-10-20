package Letras_numeros;


public class validar 
{
    public boolean validar_cadena(String cadena){
        boolean respuesta=true;
        int k=0, valor;
        char letra;
        while (k < cadena.length() && respuesta == true){
            letra = cadena.toUpperCase().charAt(k);
            valor = (int) letra;
            if ((valor >= 65 && valor <= 90) || valor == 32)
                k++;
            else
                respuesta = false;
        }
        return respuesta;
    }
    
    public boolean validar_numero(String cadena) {
        boolean respuesta=true;
        int k=0, valor;
        char numero;
        while (k < cadena.length() && respuesta == true){
            numero = cadena.charAt(k);
            valor = (int) numero;
            if (valor >= 48 && valor <= 57)
                k++;
            else
                respuesta = false;
        }
        return respuesta;
    }
}
