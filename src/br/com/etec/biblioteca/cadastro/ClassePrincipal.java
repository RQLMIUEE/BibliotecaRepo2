package br.com.etec.biblioteca.cadastro;

public class ClassePrincipal {

	public static void main(String[] args) {

		ClasseInformacoes info_obj =new ClasseInformacoes();
		ClasseInformacoes info_obj2 = new ClasseInformacoes("Dom Casmurro", "machado de Assis");
		
		
		info_obj.mostrardados();
		info_obj2.mostrardados();
		
		
	}

}
