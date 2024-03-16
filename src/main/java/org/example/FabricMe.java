package org.example;

public class FabricMe implements AbstractFabric{
    @Override
    public Classification createClassification() {
        return new ClassificationMe();
    }
}
