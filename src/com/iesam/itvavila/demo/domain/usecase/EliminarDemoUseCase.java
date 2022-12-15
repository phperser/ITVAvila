package com.iesam.itvavila.demo.domain.usecase;

public class EliminarDemoUseCase {
    private com.iesam.itvavila.demo.data.OwnerDataStore dataStore = com.iesam.itvavila.demo.data.OwnerDataStore.getInstance();

    public void execute(String codigo) {
        dataStore.eliminar(codigo);
    }
}
