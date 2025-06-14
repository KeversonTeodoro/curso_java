package arrays.vetores1_e_2.exercicios.video;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class AplicationVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um range: ");
        int range = input.nextInt();
        Pessoas[] vect = new Pessoas[range];

        for(int n = 0; n < range; n++){
            input.nextLine();
            System.out.print("Insert name of " + n + "person");
            String name = input.nextLine();
            System.out.println("Insert age of " + name);
            int age = input.nextInt();
            System.out.println("Now, insert weight of " + name);
            double height = input.nextDouble();

            vect[n] = new Pessoas(name, age, height);
        }

        double sum =0;
        for (int n = 0; n < range; n++){
            sum += vect[n].getWeight();
        }

        Pessoas[] person16 = new Pessoas[vect.length];

        List<String> personMenos16 = new ArrayList<>();

//        for(Pessoas pessoa : vect){
//            if (pessoa.getAge() < 16){
//                String nome = (String) pessoa.getName();
//                personMenos16.add(nome);
//
//            }
//        }

        int sumPerson16 = 0;



        for (int n = 0; n < range; n++){
            int idade = (int) vect[n].getAge();
            String nome = (String) vect[n].getName();
            if(idade < 16){
                personMenos16.add(nome);
                sumPerson16 += idade;

            }
        }

        double porce = sumPerson16 / 100;
        double media = sum / vect.length;



        System.out.println("A quantidade de pessoas com menos de 16 anos é " + personMenos16.size());
        System.out.println(personMenos16);
        System.out.println("A média de altura de todas as pessoas é " + media);

    }


    public static class Pessoas {
        String name;
        int age;
        double weight;

        public Pessoas(){

        }

        public Pessoas(String name, int age, double weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
    }
}
