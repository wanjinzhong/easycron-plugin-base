package com.neil.easycron.plugin.bo;
import com.neil.easycron.plugin.constant.JobRunningStatus;

public class JobRunningResult {
    private JobRunningStatus runningStatus;
    private String message;

    public JobRunningStatus getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(JobRunningStatus runningStatus) {
        this.runningStatus = runningStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
