public class Caracol {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[5][5];
		
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz.length; j++)
				matriz[i][j] = 0;
		
		preencherMatriz(matriz, 0, 0, 0, true);
		
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz.length; j++)
				System.out.printf("%d", matriz[i][j]);
			System.out.println();
		}
	}
	
	public static void preencherMatriz(int[][] matriz, int i, int j, int direcao, boolean firstTime){
		boolean isPreenchida = true;
		for (int k = 0; k < matriz.length; k++)
			for (int l = 0; l < matriz.length; l++)
				if(matriz[k][l] == 0) isPreenchida = false;
		
		while(!isPreenchida){
			switch(direcao){
				case 0:
					if(firstTime){
						for (i = 0; i < matriz.length; i++) {
							if(matriz[i][j] == 1) break;
							matriz[i][j] = 1;
						}
					}else{
						for (i = 1; i < matriz.length; i++) {
							if(matriz[i][j] == 1) break;
							matriz[i][j] = 1;
						}
					}
					preencherMatriz(matriz, i, j, direcao++, false);
					break;
				case 1:
					for (j = 1; j < matriz.length; i++) {
						if(matriz[i][j] == 1) break;
						matriz[i][j] = 1;
					}
					preencherMatriz(matriz, i, j, direcao++, false);
					break;
				case 2:
					for (i = matriz.length-1; i >= 0; i--) {
						if(matriz[i][j] == 1) break;
						matriz[i][j] = 1;
					}
					preencherMatriz(matriz, i, j, direcao++, false);
					break;
				case 3:
					for (j = matriz.length-1; j >= 0; i--) {
						if(matriz[i][j] == 1) break;
						matriz[i][j] = 1;
					}
					preencherMatriz(matriz, i, j, direcao++, false);
					break;
				case 4:
					preencherMatriz(matriz, i, j, 0, false);
					break;
			}
		}
	}
}
	
