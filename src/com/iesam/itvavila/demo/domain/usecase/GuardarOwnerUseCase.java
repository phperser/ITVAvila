package com.iesam.itvavila.demo.domain.usecase;

import com.iesam.itvavila.demo.domain.models.Demo;
import com.iesam.itvavila.demo.domain.models.Owner;

public class GuardarOwnerUseCase {
    private com.iesam.itvavila.demo.data.OwnerDataStore dataStore = com.iesam.itvavila.demo.data.OwnerDataStore.getInstance();

    public void execute(Owner owner) {
        dataStore.guardar(owner);
    }
}
