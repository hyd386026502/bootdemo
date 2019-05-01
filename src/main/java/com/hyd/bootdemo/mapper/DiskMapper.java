package com.hyd.bootdemo.mapper;/**
 * @author huangYaDong
 * @date 2019-04-19 21:53
 * @description
 * @other
 */

import com.hyd.bootdemo.entity.Disk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 * @author huangYaDong
 * @date 2019-04-19 21:53
 * @description
 * @other
 */
@Mapper
public interface DiskMapper {

    /**
     * @description
     * 获取文件信息
     * @author huangYaDong
     * @date 2019/4/19
     * @param nodeId 节点
     * @return 一个文件信息的list
     * @other
     */
    @Select("select NODE_ID AS nodeId," +
            "PARENT_ID AS parentId," +
            "FILENAME AS fileName," +
            "FILEPATH AS filePath," +
            "FILETYPE AS fileType," +
            "CU_TIME AS cuTime," +
            "USER_NAME AS userNmae" +
            " FROM disk22.disk where NODE_ID = 1")
//    @Results({
//            @Result(#{nodeId}property = "")
//    })
    List<Disk> getFileInfo(Disk disk);
}
