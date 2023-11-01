package com.LennyPackage;

import java.io.File;
import java.net.URI;

public class SubjectData {

    private URI urlString;

    private File pathOrdner;

    private String stringName;

    public URI getUrlString() {
        return urlString;
    }

    public void setUrlString(String urlString) {
        this.urlString = URI.create(urlString);
    }

    public File getPathOrdner() {
        return pathOrdner;
    }

    public void setPathOrdner(String pathOrdner) {
        this.pathOrdner = new File(pathOrdner);
    }

    public String getStringName() {
        return stringName;
    }

    public void setStringName(String stringName) {
        this.stringName = stringName;
    }

    public SubjectData(URI urlString, File pathOrdner, String stringName) {
        this.urlString  = URI.create(String.valueOf(urlString));
        this.pathOrdner = pathOrdner;
        this.stringName = stringName;
    }
}
