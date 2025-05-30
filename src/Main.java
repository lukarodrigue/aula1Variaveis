//Exercicio 1

// Declare variáveis para armazenar:
// - Seu nome
// - Sua idade
// - Sua altura
// - Se é estudante (true/false)

  public  class Main {

      public static void main(String[] args) {
          String nome = "luka";
          int idade = 24;
          double altura = 1.75;
          boolean estudante = true;

          System.out.println("Nome: " + nome );
          System.out.println("Idade: " + idade );
          System.out.println("Altura: " + altura );
          System.out.println("Estudante: " + estudante );

      }

  }

//Exercicio 2

// Crie duas variáveis, `a` e `b`, com valores 5 e 10, respectivamente.
// Troque os valores dessas variáveis sem usar uma terceira variável.
// Depois, imprima os novos valores.
//
    public class Main {

        public static void main(String[] args) {
            int a = 5;
            int b = 10;

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("a = " + a);
            System.out.println("b = " + b);

        }
    }

//Exercicio 3

// Crie quatro variáveis: `num1`, `num2`, `soma`, `subtracao`, `multiplicacao` e `divisao`.
// Atribua valores a `num1` e `num2`, depois calcule e armazene os resultados nas outras variáveis.
// Imprima os resultados no formato:
// "Soma: X", "Subtração: Y", etc.

    public class Main {
        public static void main (String[] args) {
            int num1 = 10;
            int num2 = 4;

            int soma = num1 + num2;
            int sub = num1 - num2;
            int mult = num1 * num2;
            double div = (double) num1 / num2;

            System.out.println("Soma: = " + soma);
            System.out.println("Subtração: = " + sub);
            System.out.println("Multiplicação: = " + mult);
            System.out.println("Divisão: = " + div);

        }
}

//Exercicio 4

// Crie uma variável `celsius` com um valor em graus Celsius.
// Converta para Fahrenheit usando a fórmula: `F = C * 9/5 + 32`.
// Armazene o resultado em `fahrenheit` e imprima.
//
    public class Main{
        public static void main(String[] args) {
            double celsius = 14;

            double fahrenheit = celsius * 9/5 + 32;

            System.out.println("Temperatura em Fahrenheit é de: " + fahrenheit + "°F");
        }
    }

//Exercicio 5

// Crie três variáveis (`nota1`, `nota2`, `nota3`) com valores de 0 a 10.
// Calcule a média e armazene em uma variável `media`.
// Imprima o resultado com duas casas decimais.

public class Main {
        public static void main(String[] args) {
             double nota1 = 4.7;
             double nota2 = 8.3;
             double nota3 = 6.8;

             double media = (nota1 + nota2 + nota3) / 3;

             System.out.printf("Sua média é de: %.2f",  media);

             //Uso printf para formatar saídas com precisão decimal.
        }
}

//Exercicio 6

// Crie uma variável `raio` com um valor qualquer.
// Calcule a área do círculo (use `Math.PI`) e armazene em `area`.
// Imprima o resultado.

public class Main {
    public static void main(String[] args) {
        double raio = 10;
        double area = Math.PI * raio * raio;

        System.out.println("O resultado da aréa do circulo é: " + area);
    }
}

//Exercicio 7

// Crie três variáveis: `nome`, `sobrenome` e `nomeCompleto`.
// Atribua seu nome e sobrenome às duas primeiras variáveis.
// Concatene-as em `nomeCompleto` e imprima.

public class Main {
    public static void main (String[] args) {
        String nome = "luka";
        String primeiroSobrenome = "rodrigues";
        String segundoSobrenome = "goncalves";
        String nomeCompleto = nome + " " + primeiroSobrenome + " " + segundoSobrenome;

        System.out.println("Seu nome é : " + nomeCompleto);

    }
}

//Exercicio 8

// Crie variáveis `anoNascimento` e `anoAtual` com valores numéricos.
// Calcule a idade e armazene em `idade`.
// Imprima: "Sua idade é X anos".

public class Main {
    public static void main(String[] args){
        int anoNascimento = 2000;
        int anoAtual = 2025;

        int idade = anoAtual - anoNascimento;

        System.out.println("Você tem: " + idade + " anos.");
    }
}

//Exercicio 9

// Crie variáveis `salarioBruto`, `descontoINSS` e `salarioLiquido`.
// Atribua um valor ao salário bruto e calcule 10% de desconto para o INSS.
// Armazene o salário líquido e imprima.

public class Main {
    public static void main(String[] args){
        double salarioBruto = 3500;
        double descontoINSS = salarioBruto * 0.10;
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("Seu Salario é: " + salarioBruto);
        System.out.println("Seu desconto de 10% é de: " + descontoINSS);
        System.out.println("Seu Salario com desconto de 10% é de: " + salarioLiquido);

    }
}

//Exercicio 10

// Dada uma variável `minutos` (ex: 125), converta para horas e minutos.
// Armazene os resultados em `horas` e `minutosRestantes`.
// Imprima: "X horas e Y minutos".

public class Main {
    public static void  main(String[] args){
        int minutos = 61;
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        System.out.println(minutos + " minutos equivalem a " + horas + " horas e " + minutosRestantes + " minutos.");
    }
}

//Exercicio 11

// Crie variáveis `peso` (em kg) e `altura` (em metros).
// Calcule o IMC usando a fórmula `IMC = peso / (altura * altura)`.
// Imprima o resultado.

public class Main {
    public static void main(String[] args) {
        double peso = 55;
        double altura = 1.75;

        double IMC = peso / (altura * altura);

        System.out.printf("Seu IMC é de: %.2f", IMC);

        if (IMC < 18.5) {
            System.out.println(" " + "Classificação: Magreza");
        }
        else if (IMC < 24.9) {
            System.out.println(" " +"Classificação: Peso normal");
        }
        else if (IMC < 29.9) {
            System.out.println(" " +"Classificação: Sobrepeso");
        }
        else if (IMC < 34.9) {
            System.out.println(" " +"Classificação: Obesidade grau I");
        }
        else if (IMC < 39.9) {
            System.out.println(" " +"Classificação: Obesidade grau II");
        }
        else {
            System.out.println(" " +"Classificação: Obesidade grau III");
        }
    }
}