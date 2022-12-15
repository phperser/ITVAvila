package com.iesam.itvavila.demo.domain.usecase;

import com.iesam.itvavila.demo.domain.models.Owner;

public class BuscarOwnerUseCase {
    private com.iesam.itvavila.demo.data.OwnerDataStore dataStore = com.iesam.itvavila.demo.data.OwnerDataStore.getInstance();

    public Owner execute(String dni ) {
        return dataStore.buscar(dni);
    }
}
