package ativamterceirobim;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileInputStream;

public class Programa3 {
	public static void main(String args[]) throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Users\\usuario\\Desktop\\testeaaa.txt");
        InputStreamReader aux = new InputStreamReader(aplicmoveis);
        BufferedReader bufred = new BufferedReader(aux);
        String l = bufred.readLine();
        int i = -1;
        String [] input = new String[2];     
        do{
        	i = i + 1;
            input[i] = l;
            l = bufred.readLine();
        }while(l != null);
        String[] inputx = input[0].split(" ");
        String[] inputj = input[1].split(" ");
        int [] priinput = new int [inputx.length];
        int [] seginput = new int [inputj.length];
        for(int j=0; j<inputx.length; j++) {
        	priinput[j] = Integer.parseInt(inputx[j]);
        	seginput[j] = Integer.parseInt(inputj[j]);
        }
        if(seginput[0] >= priinput[0] && seginput[0] <= priinput[2] && seginput[1] >= priinput[1] && seginput[1] <= priinput[3]) {
        	System.out.println("1");        	
        } else {
        	if(seginput[2] >= priinput[0] && seginput[2] <= priinput[2] && seginput[3] >= priinput[1] && seginput[3] <= priinput[3]) {        	
        		System.out.println("1");
        	} else {
        		System.out.println("0");
        	}
        }
	}
}
