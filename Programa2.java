package ativamterceirobim;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileInputStream;

public class Programa2 {
	public static void main(String args[]) throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Users\\usuario\\Desktop\\testeaaa.txt");
        InputStreamReader aux = new InputStreamReader(aplicmoveis);
        BufferedReader bufred = new BufferedReader(aux);
        String l = bufred.readLine();
        String inputx = l;
        l = bufred.readLine();
        String [] inputy = inputx.split(" ");
        String [] inputt = new String[Integer.parseInt(inputy[1])];
        int i = -1;        
        do{
        	i = i + 1;
            inputt[i] = l;
            l = bufred.readLine();
        }while(l != null);
        int [] ven = new int [Integer.parseInt(inputy[0])];
        int [] ligatotven2 = new int [Integer.parseInt(inputy[0])];
        int z = 1;
        for(int j = 0; j < ven.length; j++) {
        	try {
        	ven[j] = Integer.parseInt(inputt[j]);
        	inputt[j] = "0";
        	} catch (Exception e) {
        	      System.out.println("Sem ligações suficientes!");
            }
        }
        do{
        	z = 0;
        	for(int j = 0; j < ven.length; j++) {
            	ven[j] = ven[j]-1;
            	if(ven[j] == 0) {
            		ligatotven[j] = ligatotven[j] + 1;
            	}
            }
            for(int j = 0; j < ven.length; j++) {
            	for(int K = 0; K < input.length; K++) {
            		if(ven[j] == 0 && Integer.parseInt(inputt[K])!=0) {
            			try {
            			ven[j] = Integer.parseInt(inputt[K]);
            			inputt[K] = "0";
            			} catch (Exception e) {
                  	      System.out.println("Sem ligações suficientes!");
                        }
            		}
            	}
            }
            for(int j = 0; j < ven.length; j++) {
            	if(ven[j]>0) {
            		z = 1;
            	}
            }
        }while(z == 1);
        for(int j = 0; j < ven.length; j++) {
        	System.out.println(j + 1 + " " + ligatotven[j]);
        }
	}
}
