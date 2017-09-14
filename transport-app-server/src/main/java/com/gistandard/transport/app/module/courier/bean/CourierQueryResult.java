package com.gistandard.transport.app.module.courier.bean;

import com.gistandard.platform.pojo.res.AppBasePagerResult;
import com.gistandard.platform.pojo.req.AppBaseRequest;
import com.gistandard.transport.system.common.courier.bean.Courier;

import java.util.List;

/**
 * Created by m on 2016/10/7.
 */
public class CourierQueryResult  extends AppBasePagerResult {
    private List<Courier> data;

    public CourierQueryResult(AppBaseRequest appBaseRequest) {
        super(appBaseRequest);
    }

    public List<Courier> getData() {
        return data;
    }

    public void setData(List<Courier> data) {
        this.data = data;
    }
}
