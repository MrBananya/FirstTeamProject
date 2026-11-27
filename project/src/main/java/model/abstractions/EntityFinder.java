package model.abstractions;

import shared.entites.abstractions.Entity;
import shared.entites.abstractions.EntityCollection;

public interface EntityFinder {
    public int findEntity(EntityCollection collection, Entity target);
}
