
import java.util.Scanner;

;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double valor;
        ConversorDeMoeda conversorDeMoeda = new ConversorDeMoeda();
        HistoricoMoeda historicoMoeda = new HistoricoMoeda();
        Moeda moeda;

        byte opcao = 0;
        while (opcao != 7){
            String md = """     
                            \n***** ESCOLHA DENTRE ESSAS OPÇÕES *****
                            1 - Dólar Americano para Peso Agentino
                            2 - Peso Agentino para Dólar Americano
                            3 - Dólar Americano para Real Brasileiro
                            4 - Real Brasileiro para Dólar Americano
                            5 - Dólar Americano para Peso Colombiano
                            6 - Peso Colombiano para Dólar Americano
                            7 - Sair 
                        """;
                System.out.println(md);
                opcao = tec.nextByte();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser convertido: ");
                    valor = tec.nextDouble();
                    moeda = conversorDeMoeda.converso("USD","ARS",valor);
                    System.out.println("O valor "+ valor +"["+moeda.base_code()+"]"+" corresponde ao valor final: "
                            + moeda.conversion_result()+ "["+ moeda.target_code()+"]");
                    historicoMoeda.addMoedas(moeda);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser convertido: ");
                    valor = tec.nextDouble();
                    moeda = conversorDeMoeda.converso("ARS","USD",valor);
                    System.out.println("O valor "+ valor +"["+moeda.base_code()+"]"+" corresponde ao valor final: "
                            + moeda.conversion_result()+ "["+ moeda.target_code()+"]");
                    historicoMoeda.addMoedas(moeda);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser convertido: ");
                    valor = tec.nextDouble();
                    moeda = conversorDeMoeda.converso("USD","BRL",valor);
                    System.out.println("O valor "+ valor +"["+moeda.base_code()+"]"+" corresponde ao valor final: "
                            + moeda.conversion_result()+ "["+ moeda.target_code()+"]");
                    historicoMoeda.addMoedas(moeda);
                    break;
                case 4:
                    System.out.print("Digite o valor a ser convertido: ");
                    valor = tec.nextDouble();
                    moeda = conversorDeMoeda.converso("BRL","USD",valor);
                    System.out.println("O valor "+ valor +"["+moeda.base_code()+"]"+" corresponde ao valor final: "
                            + moeda.conversion_result()+ "["+ moeda.target_code()+"]");
                    historicoMoeda.addMoedas(moeda);
                    break;
                case 5:
                    System.out.print("Digite o valor a ser convertido: ");
                    valor = tec.nextDouble();
                    moeda = conversorDeMoeda.converso("USD","COP",valor);
                    System.out.println("O valor "+ valor +"["+moeda.base_code()+"]"+" corresponde ao valor final: "
                                        + moeda.conversion_result()+ "["+ moeda.target_code()+"]");
                    historicoMoeda.addMoedas(moeda);
                    break;
                case 6:
                    System.out.print("Digite o valor a ser convertido: ");
                    valor = tec.nextDouble();
                    moeda = conversorDeMoeda.converso("COP","USD",valor);
                    System.out.println("O valor "+ valor +"["+moeda.base_code()+"]"+" corresponde ao valor final: "
                            + moeda.conversion_result()+ "["+ moeda.target_code()+"]");
                    historicoMoeda.addMoedas(moeda);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        }

            historicoMoeda.historioco();



    }
}