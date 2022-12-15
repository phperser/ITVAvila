package com.iesam.itvavila.demo.data;

import com.iesam.itvavila.demo.domain.models.Owner;

import java.util.Map;
import java.util.TreeMap;

public class OwnerDataStore {
    private static com.iesam.itvavila.demo.data.OwnerDataStore instance = null;

    private Map<String, Owner> ownerData = new TreeMap<>();

    public void guardar(Owner owner) {
        ownerData.put(owner.getDni(), owner);
    }

    public void eliminar(String dni) {
        ownerData.remove(dni);
    }

    public Owner buscar(String dni) {
        return ownerData.get(dni);
    }

    public void modificar(Owner owner) {
        ownerData.put(owner.getDni(), owner);
    }

    public static com.iesam.itvavila.demo.data.OwnerDataStore getInstance() {
        if (instance == null) {
            instance = new com.iesam.itvavila.demo.data.OwnerDataStore();
        }
        return instance;
    }
}
