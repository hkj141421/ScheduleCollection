package com.knight.Service;

import com.knight.Bean.ErrorInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by forget on 2019/12/29.
 */
@Service
public class ErrorLogServiceImpl implements ErrorLogService {
    @Override
    public boolean insertErrorLog(String errmsg,String location) {
        return false;
    }

    @Override
    public boolean deleteAllErrorLog() {
        return false;
    }

    @Override
    public Long countAllErrorLog() {
        return null;
    }

    @Override
    public Long countErrorLogByLocation(String location) {
        return null;
    }

    @Override
    public List<ErrorInfo> selectErrorLogByLocation(String location) {
        return null;
    }
}
