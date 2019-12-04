class Main {
 
// CLASSE SOMENTE PARA TESTE DE EXECUÇÃO
// NÃO É NECESSÁRIO ALTERAR

  public static void main(String[] args) {
 
    //Criando contas bancárias
    Conta conta1 = new Conta(1, 1001);
    Conta conta2 = new Conta(3, 1002);
    Conta conta3 = new Conta(1, 1003);


    //Criando clientes 
    Cliente apu = new Cliente("Apuh Nahasape", 31, "10048945761");
    Cliente ned = new Cliente("Ned Fanders", 38, "30065945453");
    Cliente moe = new Cliente("Moe Szyslak", 34, "40065945984");


    //realizando transações 
    conta1.deposita(100);    
    
    conta2.deposita(600);
    conta2.retira(100);
    
    conta3.retira(100);
    

    

    //Atribuindo contas bancárias
    conta1.setCliente(apu);
    conta2.setCliente(ned);
    conta3.setCliente(moe);


    
    //Mostrando relatorios
    Relatorio relatorio = new Relatorio();

    System.out.println("Relatórios");
    System.out.println("\nCLIENTES:");
    System.out.println("---------");
    relatorio.mostra(apu);
    relatorio.mostra(ned);
    relatorio.mostra(moe);

    System.out.println("\nCONTAS:");
    System.out.println("-------");
    relatorio.mostra(conta1);
    relatorio.mostra(conta2);
    relatorio.mostra(conta3); 
  }
}
