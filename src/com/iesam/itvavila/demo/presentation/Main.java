package com.iesam.itvavila.demo.presentation;

import com.iesam.itvavila.demo.domain.models.*;
import com.iesam.itvavila.demo.domain.usecase.GuardarOwnerUseCase;

public class Main {

    public static void main(String[] args) {
        //Aquí comienza el ejercicio. Revisa la carpeta demo para obtener ejemplos.
        com.iesam.itvavila.demo.presentation.ITVAvilaMain demoMain = new com.iesam.itvavila.demo.presentation.ITVAvilaMain();
        com.iesam.itvavila.demo.presentation.ITVAvilaMain.main();

            Owner owner = new Owner();
            owner.setDni("XXXXXX");
            owner.setName("Pepito");
            owner.setSurname("Pepa");
            owner.setAdress("Calle...");
            owner.setProvince("Avila");
            owner.setCity("Avila");
            owner.setPhone(123445678);


            GuardarOwnerUseCase guardarOwnerUseCase = new GuardarOwnerUseCase();
            guardarOwnerUseCase.execute(owner);

            Truck truck = new Truck();
            truck.setMatricula("4325rff");
            truck.setBrand("Toyota");
            truck.setModel("x323");
            truck.setColor("Rojo");
            truck.setMatricDate("1234abc");
            truck.setTara(987.00);
            truck.setLongi(10.00);


            Car car = new Car();
            car.setMatricula("1235gbh");
            car.setBrand("Audi");
            car.setModel("rt54");
            car.setColor("Negro");
            car.setMatricDate("12/03/2010");
            car.setDoorNumber(4);

            Motorbyke motorbyke = new Motorbyke();
            motorbyke.setMatricula("6543ghf");
            motorbyke.setBrand("Mitsubi");
            motorbyke.setModel("ed56");
            motorbyke.setColor("Blanco");
            motorbyke.setMatricDate("21/09/2013");
            motorbyke.setDiamRuedas(23.00);

            Inspeccion inspeccion = new Inspeccion();
            inspeccion.setCode("1");
            inspeccion.setDate("15/12/2022");
            inspeccion.setResult(true);
            inspeccion.setVehiculo(truck);
            inspeccion.setOwner(owner);


            //-- 2. Recupero un  modelo
      /*  BuscarOwnerUseCase buscarDemoUseCase = new BuscarOwnerUseCase();
        Demo demoBuscado = buscarDemoUseCase.execute("1"); //Pongo el código del Demo que quiero recuperar
        System.out.println("Demo buscado" + demoBuscado.getCodigo() + " | " + demoBuscado.getNombre());

        //-- 3. Modifico un modelo buscado (reutilizo la creación del caso de uso "Buscar" anterior)
        Demo demoAModificar = buscarDemoUseCase.execute("1");
        demoAModificar.setNombre("NombreModificado");
        //Guardo el modelo para salvar las modificaciones (reutilizo el caso de uso guardado)
        guardarDemoUseCase.execute(demoAModificar);

        //-- 4. Elimino un modelo
        EliminarDemoUseCase eliminarDemoUseCase = new EliminarDemoUseCase();
        eliminarDemoUseCase.execute("1"); //Elimino el modelo con código 1. */
        }

    }

