package abstrato.application;

import abstrato.entitie.Cicle;
import abstrato.entitie.Rectangle;
import abstrato.entitie.Shape;
import abstrato.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape>list= new ArrayList<>();

        System.out.print("Enter the number of Shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.print("Shape " + i + "data: ");
            System.out.print("Rectangle or Circle (r/c)?");
            char type= sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (type == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color,width,height));
            }else {
                System.out.print("Radius:  ");
                double radius =  sc.nextDouble();
                list.add(new Cicle(color,radius));
            }
        }
        System.out.println();
        System.out.println("Shape areas: ");
        for (Shape shape : list){
            System.out.printf(String.format("%>2f",shape.area()));
        }
    }
}
