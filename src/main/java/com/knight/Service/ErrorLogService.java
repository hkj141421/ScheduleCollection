package com.knight.Service;

import com.knight.Bean.ErrorInfo;

import java.util.List;

/**
 * Created by forget on 2019/12/29.
 */
public interface ErrorLogService {

    public boolean insertErrorLog(String errmsg,String location);

    public boolean deleteAllErrorLog();

    public Long countAllErrorLog();

    public Long countErrorLogByLocation(String location);

    public List<ErrorInfo> selectErrorLogByLocation(String location);

}
