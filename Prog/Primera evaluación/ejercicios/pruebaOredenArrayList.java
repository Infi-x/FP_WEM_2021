import java.util.ArrayList;

public class pruebaOredenArrayList {
    public static ArrayList<Integer> ordenar1(ArrayList<Integer> numeros) {
    	ArrayList<Integer> aux=new ArrayList<Integer>();
    	boolean sw;
    	for (int i=0;i<numeros.size();i++) {
    		//cogere el elto del original que corresponda
    		
    		sw=true;
    		for (int j=aux.size()-1;j>=0;j--) {
    			if (aux.get(j)<numeros.get(i)) {
    				//he encontrado el sitio
    				aux.add(j+1,numeros.get(i));
    				sw=false;
    				break;
    			}
    		}
    		if (sw) aux.add(0,numeros.get(i));
    		
    	}
    	return aux;
    }
    public static void ordenar2(ArrayList<Integer> numeros) {
    	int aux;
    	for (int i=0;i<numeros.size()-1;i++) {
    		for (int j=i+1;j<numeros.size();j++) {
    			if (numeros.get(i)>numeros.get(j)) {
    				aux=numeros.get(i);
    				numeros.set(i, numeros.get(j));
    				numeros.set(j,aux);
    			}
    		}
    	}
    	
    }
	public static void main(String[] args) {
		ArrayList<Integer> misNums=new ArrayList<Integer>();
		int cuantos=(int)(Math.random()*10)+1;
		for (int i = 0; i < cuantos; i++) {
			int num=(int)(Math.random()*1000)+1;
			misNums.add(num);
		}
		System.out.println(misNums);
		ArrayList<Integer> misNums2=ordenar1(misNums);
		System.out.println(misNums2);
		ordenar2(misNums);
		System.out.println(misNums);

	}

}
