package com.iesam.itvavila.demo.presentation;

import com.iesam.demo.domain.models.*;
import com.iesam.itvavila.demo.domain.models.Demo;
import com.iesam.itvavila.demo.domain.usecase.BuscarDemoUseCase;
import com.iesam.itvavila.demo.domain.usecase.EliminarDemoUseCase;
import com.iesam.itvavila.demo.domain.usecase.GuardarDemoUseCase;

import java.util.Scanner;

public class ITVAvilaMain {

    public static void main() {
        Scanner sc = new Scanner(System.in);

        Owner owner = new Owner();
        System.out.println("Datos del propietario");
        System.out.println("DNI");
        owner.setDni(sc.nextLine());
        System.out.println("nombre");
        owner.setName(sc.nextLine());
        System.out.println("apellidos");
        owner.setSurname(sc.nextLine());
        System.out.println("direccion");
        owner.setAdress(sc.nextLine());
        System.out.println("provincia");
        owner.setProvince(sc.nextLine());
        System.out.println("ciudad");
        owner.setCity(sc.nextLine());
        System.out.println("numeros de telefono");
        owner.setPhone(sc.nextInt());

        Truck truck = new Truck();
        System.out.println("Datos del camion");
        System.out.println("Datos de la matricula");
        truck.setMatricula(sc.nextLine());
        System.out.println("Datos de la marca");
        truck.setBrand(sc.nextLine());
        System.out.println("Datos del modelo");
        truck.setModel(sc.nextLine());
        System.out.println("Datos del color");
        truck.setColor(sc.nextLine());
        System.out.println("Datos de la fecha de matriculacion");
        truck.setMatricDate(sc.nextLine());
        System.out.println("Datos del numero de puertas");
        truck.setTara(sc.nextDouble());

        Car car = new Car();
        System.out.println("Datos del coche");
        System.out.println("Datos de la matricula");
        car.setMatricula(sc.nextLine());
        System.out.println("Datos de la marca");
        car.setBrand(sc.nextLine());
        System.out.println("Datos del modelo");
        car.setModel(sc.nextLine());
        System.out.println("Datos del color");
        car.setColor(sc.nextLine());
        System.out.println("Datos de la fecha de matriculacion");
        car.setMatricDate(sc.nextLine());
        System.out.println("Datos del numero de puertas");
        car.setDoorNumber(sc.nextInt());

        Motorbyke motorbyke = new Motorbyke();
        System.out.println("Datos del camion");
        System.out.println("Datos de la matricula");
        motorbyke.setMatricula(sc.nextLine());
        System.out.println("Datos de la marca");
        motorbyke.setBrand(sc.nextLine());
        System.out.println("Datos del modelo");
        motorbyke.setModel(sc.nextLine());
        System.out.println("Datos del color");
        motorbyke.setColor(sc.nextLine());
        System.out.println("Datos de la fecha de matriculacion");
        motorbyke.setMatricDate(sc.nextLine());
        System.out.println("Diametro de rueda");
        motorbyke.setDiamRuedas(sc.nextDouble());

        //-- 1. Guardo el modelo
        GuardarDemoUseCase guardarDemoUseCase = new GuardarDemoUseCase();
        guardarDemoUseCase.execute(demo);

        //-- 2. Recupero un  modelo
        BuscarDemoUseCase buscarDemoUseCase = new BuscarDemoUseCase();
        Demo demoBuscado = buscarDemoUseCase.execute("1"); //Pongo el código del Demo que quiero recuperar
        System.out.println("Demo buscado" + demoBuscado.getCodigo() + " | " + demoBuscado.getNombre());

        //-- 3. Modifico un modelo buscado (reutilizo la creación del caso de uso "Buscar" anterior)
        Demo demoAModificar = buscarDemoUseCase.execute("1");
        demoAModificar.setNombre("NombreModificado");
        //Guardo el modelo para salvar las modificaciones (reutilizo el caso de uso guardado)
        guardarDemoUseCase.execute(demoAModificar);

        //-- 4. Elimino un modelo
        EliminarDemoUseCase eliminarDemoUseCase = new EliminarDemoUseCase();
        eliminarDemoUseCase.execute("1"); //Elimino el modelo con código 1.
    }
}
