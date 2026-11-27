package shared.entites.abstractions;

import java.util.List;

public interface EntityCollectionFactory {
    public EntityCollection createEntityCollection(List<Entity> entities);
}
