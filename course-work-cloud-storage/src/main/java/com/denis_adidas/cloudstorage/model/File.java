package com.denis_adidas.cloudstorage.model;

import lombok.Data;

@Data
public class File {
    private Integer fileId;
    private String filename;
    private String contentType;
    private String fileSize;
    private byte[] fileData;
    private int userId;

    public File() {
    }

    public File(Integer fileId, String filename, String contentType, String fileSize, byte[] fileData, int userId) {
        this.fileId = fileId;
        this.filename = filename;
        this.contentType = contentType;
        this.fileSize = fileSize;
        this.fileData = fileData;
        this.userId = userId;
    }


}