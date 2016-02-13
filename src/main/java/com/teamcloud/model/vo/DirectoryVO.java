package com.teamcloud.model.vo;

public class DirectoryVO{

    private int id;

    private String directoryName;

    private String directoryPath;

    public DirectoryVO(){}

    public String getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    @Override
    public String toString() {
        return "DirectoryVO{" +
                "directoryName='" + directoryName + '\'' +
                ", directoryPath='" + directoryPath + '\'' +
                '}';
    }
}
