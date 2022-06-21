
/*a) Faça um vetor em java chamado números com 10 inteiros 
  b) Mostre a tela com os dez inteiros
  c) Descubra o maior número inteiro
  d) Descubra o menor número
  e) Descubra a média dos 10 inteiros
  f) descubra se tem repetidos
*/

public class App {
    public static void main(String[] args) throws Exception {
        int [] numeros = {3,9,5,43,6,4,2,7,8,3};
        int maior = 0;
        int menor = numeros[0];
        double media = 0;
        boolean repetidos = false;
        
        System.out.print("Vetor: ");

        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]);
            System.out.print(" ");
        
            if(maior < numeros[i]){
                maior = numeros[i];
            }
            
            if(menor > numeros[i]){
                menor = numeros[i];
            }

            for (int j = i + 1; j < numeros.length; j++){
                if (numeros[i] == numeros[j])
                    repetidos = true;
            }

         }

         for (int i = 0; i < numeros.length; i++){
            media += numeros[i];
         }
         media = media / numeros.length;

         if (repetidos == true)
            System.out.print("\n\nExistem repetidos.");
         System.out.printf("\nO maior é: %d",maior);
         System.out.printf("\nO menor é: %d",menor);
         System.out.printf("\nA média de todos os números no vetor é: %.2f",media);
    }
}
