import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Agenda a = new Agenda();
		Contato c = new Contato();
		
		Scanner sc = new Scanner(System.in);
		int k = -1;
		while(k != 0){
			System.out.println("\n1 - Definir Tamanho\n2 - Add Contato\n3 - Remover Contato\n4 - Buscar Contato\n5 - Listar Contatos\n6 - Agenda Lotada?\n0 - Sair");
			k = sc.nextInt();
			
			switch (k) {
			case 1:
				System.out.println("Digite o tamanho: ");
				a.definirTamanho(sc.nextInt());
				System.out.println("Agenda definida com tamanho " +a.getTamanho());
				break;
			
			case 2:				
				if(!a.estaLotada()){
					System.out.println("Nome: ");
					c.setNome(sc.next());
					System.out.println("Fone: ");
					c.setFone(sc.next());
					System.out.println("Email: ");
					c.setEmail(sc.next());
					if(a.addContato(c))
						System.out.println("Contato inserido com sucesso!");
				}
				else{
					System.out.println("Erro! Agenda lotada. Deseja expandir? (S/N)");
					if(sc.next().equalsIgnoreCase("S")){
						System.out.println("Digite no novo tamanho: ");
						a.setTamanho(sc.nextInt());
						c = new Contato();
						System.out.println("Nome: ");
						c.setNome(sc.next());
						System.out.println("Fone: ");
						c.setFone(sc.next());
						System.out.println("Email: ");
						c.setEmail(sc.next());
						if(a.addContato(c))
							System.out.println("Contato inserido com sucesso!");
					}
					else break;
				}				
				break;
				
			case 3:
				System.out.println("Nome do contato a ser removido:");
				if(a.removerContato(sc.next()))
					System.out.println("Contato removido com sucesso!");
				else System.out.println("Erro! Contato não encontrado.");
				break;
				
			case 4:
				System.out.println("Nome do contato a ser buscado: ");
				c = a.buscarContato(sc.next());
				if(c != null)
					System.out.println("Nome: " +c.getNome()+ "\nFone: " +c.getFone()+ "\nEmail: " +c.getEmail());
				else 
					System.out.println("Contato não encontrado!");
				break;
				
			case 5:
				Contato contatos[] = a.listarContatos();
				for(int i=0;i<contatos.length;i++){
					if(contatos[i] != null)
						System.out.println("\nNome: " +contatos[i].getNome()+ "\nFone: " +contatos[i].getFone()+ "\nEmail: " +contatos[i].getEmail());
				}
				break;
					
			case 6:			
				if(a.estaLotada()) System.out.println("Agenda lotada!");
				else System.out.println("Agenda não está lotada!");
				break;
				
			case 0:
				break;
				
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}

	}

}
