import java.util.Scanner;

public class ConversorTemperaturaPedro{
        public static void main(String[] args){
            //Declaração de variaveis
            double c, f;
            int op;

            //Criação e instância do objeto de entrada
            Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("\n\t\t\t -- Conversor Simples --\n");
                System.out.println("1. Celsius -> Fahren");
                System.out.println("2. Fahren -> Celsius");
                System.out.println("3. Sair");
                System.out.println("Opção:");
                op = entrada.nextInt();

                //Pedro

                if(op == 1){
                    System.out.println("\n\t\t\tCelsius -> Fahren\n");
                    
                    //Entrada
                    System.out.println("Informe Celsius: ");
                    c = entrada.nextDouble();
                    
                    //Processamento
                    f = (c * 9) / 5 + 32;
                    
                    //Saida
                    System.out.printf(c + " é igual à " + f);

                    //Natally

                }else if(op ==2){
                    System.out.println("n\t\t\tFahren -> Celsius\n");

                    //Entradas
		             System.out.print("Informe graus f: ");
		                f = entrada.nextDouble();
		
		            //Processamento
		            c = (f - 32) * 5 /9 ;
		
		
		            //Saída
		            System.out.println(f + " é igual à " + c);}
        }while(op!=3);
    }
}