package tp1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrera {
	private int cantidadCorredores, cf,cm,cantidadFinalistas, finalistas[];
	private ArrayList<Corredor> corredores;
	private ArrayList<Categoria> categorias;
	
	
	public Carrera(String miArchivo) throws FileNotFoundException {
		corredores=new ArrayList<Corredor>();
		categorias=new ArrayList<Categoria>();
		
		
		Scanner sc = new Scanner(new File(miArchivo));
		this.cantidadCorredores=sc.nextInt();
		this.cf=sc.nextInt();
		this.cm=sc.nextInt();
		this.cantidadFinalistas=sc.nextInt();
		this.finalistas=new int[cantidadFinalistas];
		
		for(int i=0;i<this.cf;i++)
			categorias.add(new Categoria(i+1,"F",sc.nextInt(),sc.nextInt()));
		for(int i=0;i<this.cm;i++)
			categorias.add(new Categoria(i+1,"M",sc.nextInt(),sc.nextInt()));
	
		for(int i=0;i<this.cantidadCorredores;i++) {
			Corredor c=new Corredor(i+1,sc.nextInt(),sc.next());
			asignarCategoria(c,categorias);
			corredores.add(c);
		}
		
		for(int i=0;i<this.cantidadFinalistas;i++)
			this.finalistas[i]=sc.nextInt();
		
		sc.close();
		
		// desde aca es pegado
		
		for(int i=0; i<this.finalistas.length;i++) {
			int categoria= corredores.get(finalistas[i]-1).getCategoria();
			String sexo=corredores.get(finalistas[i]-1).getSexo();
			for(Categoria cate:categorias) {
				if (cate.getSexo().equals(sexo) && cate.getId()==categoria) {
					if(cate.getOro()==0)
						cate.setOro(finalistas[i]);
					else
						
					if(cate.getPlata()==0)
						cate.setPlata(finalistas[i]);
					else
					if(cate.getBronce()==0)
						cate.setBronce(finalistas[i]);
				}
			}
		}
		PrintWriter fw;
		try {
			fw = new PrintWriter(new File("salida/carrera.out"));
			for(Categoria c:categorias)
				fw.println(c);
				
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		/*for(Categoria c:categorias)
			System.out.println(c);
		for(Corredor cor:corredores)
			System.out.println(cor);
		for(int f:finalistas)
			System.out.println(f);*/
		
	}
	/*
	public void resolver() {
		
		for(int i=0; i<this.finalistas.length;i++) {
			int categoria= corredores.get(finalistas[i]-1).getCategoria();
			String sexo=corredores.get(finalistas[i]-1).getSexo();
			for(Categoria cate:categorias) {
				if (cate.getSexo().equals(sexo) && cate.getId()==categoria) {
					if(cate.getOro()==0)
						cate.setOro(finalistas[i]);
					else
						
					if(cate.getPlata()==0)
						cate.setPlata(finalistas[i]);
					else
					if(cate.getBronce()==0)
						cate.setBronce(finalistas[i]);
				}
			}
		}
		PrintWriter fw;
		try {
			fw = new PrintWriter(new File("carrera.out"));
			for(Categoria c:categorias)
				fw.println(c);
				
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	*/
	public static void asignarCategoria(Corredor c, ArrayList<Categoria> categorias) {
		for(Categoria cate:categorias)
			if(c.getSexo().equals(cate.getSexo()))
				if(c.getEdad()>=cate.getEdadIni() && 
					c.getEdad()<=cate.getEdadFin()	)
						c.setCategoria(cate.getId());
	}
	
	
	

}
