package com.car.service;

import com.car.entity.TbCameraGunEntity;
import com.car.entity.TbCarEntity;
import com.car.entity.bean.OneImg;

import java.util.List;

public interface ScanService {
    public void scanAndUpload(boolean scanAll);
    public List<OneImg> uploadAll(int gunId, boolean scanAll, TbCameraGunEntity tbCameraGunEntity);
    public TbCarEntity uploadOne(int gunId,String fileName);
}
