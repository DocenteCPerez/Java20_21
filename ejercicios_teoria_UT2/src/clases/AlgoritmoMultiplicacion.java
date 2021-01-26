
public class AlgoritmoMultiplicacion implements Algoritmo
{
// Atributos.
private int num = 0;
// Constructores.
public AlgoritmoMultiplicacion(int param)
{
num = param;
}
// Métodos.
public int encriptar(int param)
{
return param * num;
}
public int desencriptar(int param)
{
return param / num;
}
}
