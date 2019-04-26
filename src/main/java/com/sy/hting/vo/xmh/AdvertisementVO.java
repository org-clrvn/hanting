package com.sy.hting.vo.xmh;

import com.sy.hting.vo.xmh.ImageWidthAndHeightVO;
import com.sy.hting.pojo.Advertisement;

import java.io.Serializable;

public class AdvertisementVO extends Advertisement implements Serializable {
    private ImageWidthAndHeightVO whObj;	//广告大小对象

    public ImageWidthAndHeightVO getWhObj() {
        return whObj;
    }

    public void setWhObj(ImageWidthAndHeightVO whObj) {
        this.whObj = whObj;
    }
}