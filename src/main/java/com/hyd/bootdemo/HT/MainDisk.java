package com.hyd.bootdemo.HT;/**
 * @author huangYaDong
 * @date 2019-04-20 20:21
 * @description
 * @other
 */

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.hyd.bootdemo.entity.Disk;
import com.hyd.bootdemo.mapper.DiskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huangYaDong
 * @date 2019-04-20 20:21
 * @description
 * @other
 *
 *
 */
@RestController
@RequestMapping(value = "/main")
public class MainDisk {
     @Autowired
    private DiskMapper diskMapper;

     @RequestMapping (value = "/nodeInfo",method = RequestMethod.POST)
     public List<Disk> getInfo(){
         Disk disk = new Disk();
         disk.setNodeId(1);
         List info =  diskMapper.getFileInfo(disk);
         return  info;
     };
//    public List<Disk> getInfo(@RequestBody Disk disk){
//         System.out.println("--------------"+ disk.getNodeId());
//        List info =  diskMapper.getFileInfo(disk);
//        return  info;
//    };

}
