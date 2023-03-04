public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(300);
		primeiraConta.deposita(50);
		System.out.println(primeiraConta.getSaldo());
		primeiraConta.saca(25);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta();
		primeiraConta.transfere(100, segundaConta);
		System.out.println(segundaConta.getSaldo());
		
		primeiraConta.setNumero(785848);
		System.out.println(primeiraConta.getNumero());
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Paulo");
		System.out.println(cliente1.getNome());
		primeiraConta.setTitular(cliente1);
		cliente1.setCpf("898.567.896-09");
		System.out.println(primeiraConta.getTitular().getCpf());
		
		primeiraConta.setAgencia(32);
		System.out.println("A agencia é " + primeiraConta.getAgencia());
	}
}
