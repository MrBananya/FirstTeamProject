package model.abstractions;

public interface SorterBuilder {
    public SorterBuilder setDefaultComporator();
    public SorterBuilder setAlternativeComporator();
    public EntitySorter build();
}
