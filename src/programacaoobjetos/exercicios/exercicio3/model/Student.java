package programacaoobjetos.exercicios.exercicio3.model;

public class Student {
    public String name;
    public double notaSemestre1;
    public double notaSemestre2;
    public double notaSemestre3;

    public double showFinalGrade(){
        double soma;
        return soma = notaSemestre1 + notaSemestre2 + notaSemestre3;
    }

    public double missing(){
        if(showFinalGrade() < 60){
            return 60 - showFinalGrade();
        }
        else {
            return 0.0;
        }

    }



}
