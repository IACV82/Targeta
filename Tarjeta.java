public class Tarjeta{
    private int saldo;

    public Tarjeta(int saldoInicial){
        saldo = saldoInicial;
    }
    
    public void depositar(int cantidad){
        if(cantidad >= 0){
            saldo = saldo + cantidad;
        }
    }
    
    public void retirar(int cantidad){
        if(cantidad>=0 && cantidad<=saldo){
            saldo = saldo - cantidad;
        }
    }
    
    public int consulta(){
        return saldo;
    }
}
