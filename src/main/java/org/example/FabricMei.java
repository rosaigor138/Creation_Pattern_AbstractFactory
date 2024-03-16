package org.example;

public class FabricMei implements AbstractFabric{
    @Override
    public Classification createClassification() {
        return new ClassificationMei();
    }
}
