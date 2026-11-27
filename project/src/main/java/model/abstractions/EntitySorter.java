package model.abstractions;

import java.util.Comparator;

import shared.entites.abstractions.Entity;
import shared.entites.abstractions.EntityCollection;

public abstract class EntitySorter {

    protected final Comparator<Entity> comparator;

    public EntitySorter(Comparator<Entity> comparator){
        this.comparator = comparator;
    }

    public abstract EntityCollection sortEntities(EntityCollection users);
}
