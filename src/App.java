import aluno.Aluno;
import animal.Animal;
import animal.Gato;
import formaGeometrica.Circulo;
import formaGeometrica.Quadrado;
import pizza.Pizza;
import pizza.PizzaDoce;

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();
        System.out.println("Animal: " + animal.emitirSom());

        Gato gato = new Gato();
        System.out.println("Gato: " + gato.emitirSom());

        //-------------------

        Pizza pizza = new Pizza();
        System.out.println("Pizza: " + pizza.valorPizza() * 2);

        PizzaDoce doce = new PizzaDoce();
        System.out.println("Pizza doce: " + doce.valorPizza() * 2);

        //-------

        Circulo cir = new Circulo();
        System.out.println("Circulo: " + cir.calcularArea(2, 2));

        Quadrado quad = new Quadrado();
        System.out.println("Quadrado: " + quad.calcularArea(2, 2));

        //-------

        Aluno gustavo = new Aluno();
        gustavo.setNome("Gustavo");
        gustavo.setCasa("Sonserina");
        gustavo.setAnoLetivo("2021");

        Aluno jacqueline = new Aluno();
        jacqueline.setNome("Jacqueline");
        jacqueline.setCasa("Grifinória");
        jacqueline.setAnoLetivo("2019");

        System.out.println(gustavo.equals(jacqueline));

        System.out.println(gustavo.toString());
        System.out.println(jacqueline.toString());
    }
}
