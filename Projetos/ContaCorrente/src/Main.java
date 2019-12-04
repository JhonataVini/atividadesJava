
class Main {
 
// CLASSE SOMENTE PARA TESTE DE EXECUÇÃO
// NÃO É NECESSÁRIO ALTERAR

  public static void main(String[] args) {
 
    int numero = 1001;
    int tipo = 1;
    
    Conta conta1 = new Conta(tipo, numero);
    
    Conta conta2 = new Conta(1, 1002);
    conta2.deposita(100);    

    Conta conta3 = new Conta(1, 1003);
    conta3.deposita(500);
    conta3.retira(100);
    
    Conta conta4 = new Conta(1, 1004);
    conta4.deposita(500);
    conta4.retira(500);
    
    Conta conta5 = new Conta(1, 1005);
    conta5.deposita(100);
    conta5.retira(200);
    
    Conta conta6 = new Conta(1, 1006);
    conta6.retira(200);

    System.out.println("Relatório ***");
    System.out.println("CONTA | SALDO");
    System.out.println("-------------");
    System.out.println(conta1.getNumero() + " | R$ " + conta1.getSaldo());
    System.out.println(conta2.getNumero() + " | R$ " + conta2.getSaldo());
    System.out.println(conta3.getNumero() + " | R$ " + conta3.getSaldo());
    System.out.println(conta4.getNumero() + " | R$ " + conta4.getSaldo());
    System.out.println(conta5.getNumero() + " | R$ " + conta5.getSaldo());
    System.out.println(conta6.getNumero() + " | R$ " + conta6.getSaldo());
    



  }
}
