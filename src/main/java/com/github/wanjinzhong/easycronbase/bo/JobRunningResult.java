package com.github.wanjinzhong.easycronbase.bo;
import java.util.ArrayList;
import java.util.List;

import com.github.wanjinzhong.easycronbase.constant.JobRunningStatus;

public class JobRunningResult {
    private JobRunningStatus runningStatus;
    private List<SingleMessage> message = new ArrayList<>();

    public JobRunningStatus getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(JobRunningStatus runningStatus) {
        this.runningStatus = runningStatus;
    }

    public List<SingleMessage> getMessage() {
        return message;
    }

    public void setMessage(List<SingleMessage> message) {
        this.message = message;
    }
}
