package br.com.etec.biblioteca.cadastro;

public class ClasseInformacoes {
String tituloat;
String subtituloat;
int ndepaginas;
String autoresat;
String generosat;

public ClasseInformacoes(){
	
}

public ClasseInformacoes(String autor, String titulo){
this.autoresat = autor;
this.tituloat = titulo;
 
}

public String getTitulo(){
	return tituloat;
}


public String getTSubtitulos(){
	return subtituloat;
}


public String getAutores(){
	return autoresat;
}


public String getGenero(){
	return generosat;
}



public int getNumerodepaginas(){
	return ndepaginas;
}

public void settitulos(String title){
	this.tituloat = title;
}

public void setSubtitulo(String subtitulo){
	this.subtituloat = subtitulo;
}
public void setAutores(String name){
	this.autoresat = name;
}

public void setPaginas(int paginas){
	this.ndepaginas = paginas;
}

public void setGeneros(String genero){
	this.generosat = genero;
}

public void mostrardados(){
	System.out.println("Informações do produto");
	System.out.println(tituloat);
	System.out.println(subtituloat);
	System.out.println(autoresat);
	System.out.println(ndepaginas);
}
}
