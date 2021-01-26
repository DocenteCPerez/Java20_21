
public class AlgoritmoXOR implements Algoritmo
{
// Atributos.
private int num = 0;
// Constructores.
public AlgoritmoXOR(int param)
{
num = param;
}
// Métodos.
public int encriptar(int param)
{
return param ^ num;
}
public int desencriptar(int param)
{
return param ^ num;
}
}

