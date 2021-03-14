package com.fyp.finage_user;

public class Notification_Model {

    String name;
    String type;
    String version_number;
    String feature;

    public Notification_Model(String name) {
        this.name=name;
        this.type=type;
        this.version_number=version_number;
        this.feature=feature;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getVersion_number() {
        return version_number;
    }

    public String getFeature() {
        return feature;
    }

}

