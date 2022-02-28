public class Imc {

    public static void main(String[] args) {
        double peso = 74;
        double altura = 1.60;
        double imc = peso / (altura * altura);
        System.out.println(imc);

        if (imc <= 18.5) {
            System.out.println("Sua Classificação é de Magreza");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Sua Classificação Está Dentro do Normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sua Classificação é de Sobrepeso I");
        } else if (imc >= 30.0 && imc <= 39.9) {
            System.out.println("Sua Classificação é Obesidade II");
        } else if (imc >= 40.0 ) {
            System.out.println("Sua Classificação é Obesidade Grave III");
            
        }
    }
}