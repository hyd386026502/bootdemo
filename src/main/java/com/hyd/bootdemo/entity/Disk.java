package com.hyd.bootdemo.entity;/**
 * @author huangYaDong
 * @date 2019-04-19 21:52
 * @description
 * @other
 */

import org.springframework.stereotype.Component;

/**
 * 网盘信息POJO
 * @author huangYaDong
 * @date 2019-04-19 21:52
 * @description
 * @other
 */
@Component
public class Disk {
    /** 用户名**/
    private String userNmae;
    /** 节点**/
    private Integer nodeId;
    /** 父节点**/
    private Integer parentId;
    /** 文件绝对路径**/
    private String filePath;
    /** 文件名字**/
    private String fileName;
    /** 创建修改时间**/
    private String cuTime;
    /** 文件类型 0 目录 1文件**/
    private Integer fileType;

    public String getUserNmae() {
        return userNmae;
    }

    public void setUserNmae(String userNmae) {
        this.userNmae = userNmae;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCuTime() {
        return cuTime;
    }

    public void setCuTime(String cuTime) {
        this.cuTime = cuTime;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }
}
