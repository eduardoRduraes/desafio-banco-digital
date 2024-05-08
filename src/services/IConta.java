import model.Conta;

import java.util.List;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta conta);
    double saldo();
    List<String> extrato();
}