import java.util.Scanner;

public class ex1Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int milhar;
        int centena;
        int dezena;
        int unidade;

        System.out.println("Digite um numero entre 1 e 9999: ");
        num = in.nextInt();

        milhar = num / 1000;
        centena = ((num % 1000) / 100);
        dezena = ((num % 100) / 10);
        unidade = (num % 10);

        if (num < 1 || num > 9999) {
            System.out.print("Erro");
        }
        if (milhar > 0) {
            switch (milhar) {
                case 9:
                    System.out.print("nove mil ");
                    break;
                case 8:
                    System.out.print("oito mil ");
                    break;
                case 7:
                    System.out.print("sete mil ");
                    break;
                case 6:
                    System.out.print("seis mil ");
                    break;
                case 5:
                    System.out.print("cinco mil ");
                    break;
                case 4:
                    System.out.print("quatro mil ");
                    break;
                case 3:
                    System.out.print("tres mil ");
                    break;
                case 2:
                    System.out.print("dois mil ");
                    break;
                case 1:
                    System.out.print("mil ");
                    break;
            }
        }
        if (centena > 0) {
            switch (centena) {
                case 9:
                    System.out.print("novecentos ");
                    break;
                case 8:
                    System.out.print("oitocentos ");
                    break;
                case 7:
                    System.out.print("setecentos ");
                    break;
                case 6:
                    System.out.print("seiscentos ");
                    break;
                case 5:
                    System.out.print("quinhentos ");
                    break;
                case 4:
                    System.out.print("quatrocentos ");
                    break;
                case 3:
                    System.out.print("trezentos ");
                    break;
                case 2:
                    System.out.print("duzentos ");
                    break;
                case 1:
                    System.out.print("cento ");
                    break;
            }
        }
        if (dezena > 0) {
            switch (dezena) {
                case 9:
                    System.out.print("noventa ");
                    break;
                case 8:
                    System.out.print("oitenta ");
                    break;
                case 7:
                    System.out.print("setenta ");
                    break;
                case 6:
                    System.out.print("sessenta ");
                    break;
                case 5:
                    System.out.print("cinquenta ");
                    break;
                case 4:
                    System.out.print("quarenta ");
                    break;
                case 3:
                    System.out.print("trinta ");
                    break;
                case 2:
                    System.out.print("vinte ");
                    break;
                case 1:
                        switch (unidade) {
                            case 9:
                                System.out.print("dezenove");
                                break;
                            case 8:
                                System.out.print("dezoito");
                                break;
                            case 7:
                                System.out.print("dezessete");
                                break;
                            case 6:
                                System.out.print("dezeseis");
                                break;
                            case 5:
                                System.out.print("quinze");
                                break;
                            case 4:
                                System.out.print("quatorze");
                                break;
                            case 3:
                                System.out.print("treze");
                                break;
                            case 2:
                                System.out.print("doze");
                                break;
                            case 1:
                                System.out.print("onze");
                                break;
                            default:
                                System.out.print("dez ");
                                break;

                        }

            }
            if (unidade > 0 && dezena != 1) {
                switch (unidade) {
                    case 9:
                        System.out.print("nove");
                        break;
                    case 8:
                        System.out.print("oito");
                        break;
                    case 7:
                        System.out.print("sete");
                        break;
                    case 6:
                        System.out.print("seis");
                        break;
                    case 5:
                        System.out.print("cinco");
                        break;
                    case 4:
                        System.out.print("quatro");
                        break;
                    case 3:
                        System.out.print("tres");
                        break;
                    case 2:
                        System.out.print("dois");
                        break;
                    case 1:
                        System.out.print("um");
                        break;
                    default:
                        System.out.print("erro");
                }

            }
        }
    }
}
