package org.example;

public class FabricEi implements AbstractFabric{
    @Override
    public Classification createClassification() {
        return new ClassificationEi();
    }
}
