
/*a) Faça um vetor em java chamado números com 10 inteiros 
  b) Mostre a tela com os dez inteiros
  c) Descubra o maior número inteiro
  d) Descubra o menor número
  e) Descubra a média dos 10 inteiros
  f) descubra se tem repetidos
*/

public class App {
    public static void main(String[] args) throws Exception {
        int [] numeros = {3,4,5,43,6,4,2,7,8,888};
        int maior = 0;
        int menor = numeros[0];
        double media = 0;
        
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        
            if(maior < numeros[i]){
                maior = numeros[i];
            }
            
            if(menor > numeros[i]){
                menor = numeros[i];
            }
         }

         for (int i = 0; i < numeros.length; i++){
            media += numeros[i];
         }
         media = media / numeros.length;

         System.out.printf("O maior é: %d",maior);
         System.out.printf("\nO menor é: %d",menor);
         System.out.printf("\nA média de todos os números no vetor é: %.2f",media);
    }
}
