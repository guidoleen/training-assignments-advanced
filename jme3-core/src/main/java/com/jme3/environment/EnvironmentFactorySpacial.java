package com.jme3.environment;

public class EnvironmentFactorySpacial implements IEnvironmentFactory
{
    public Spatial getSpatialNode()
    {
        return new Node();
    }
    public Spatial getSpatialCameraNode()
    {
        return new CameraNode();
    }
}