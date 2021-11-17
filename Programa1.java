package ativamterceirobim;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileInputStream;

public class Programa1 {
	public static void main(String args[]) throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Users\\usuario\\Desktop\\testeaaa.txt");
        InputStreamReader aux = new InputStreamReader(aplicmoveis);
        BufferedReader bufred = new BufferedReader(aux);
        String l = bufred.readLine();
        String [] input = new String[3];
        int i = -1;        
        while(l != null) {
        	i = i + 1;
            input[i] = l;
            l = bufred.readLine();
        }
        String[] tam = input[2].split(" ");
        int md = 0;
        int tamint = 0;
        for(int K=0; K < tam.length; K++) {
        	md += Integer.parseInt(tam[K]); 
        }
        md = md / Integer.parseInt(input[0]);
        
        while(md > 0) {
        	for(int K=0; K < tam.length; K++) {
            	tamint += Integer.parseInt(tam[K]) / md;
        	}
        	if(tamint == Integer.parseInt(input[0])) {
        		System.out.println(md);
        		break;
        	}
        	else {
        		md = md - 1;
        		tamint = 0;
        	}
        }
    }
}