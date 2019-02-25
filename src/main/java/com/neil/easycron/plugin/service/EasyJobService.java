package com.neil.easycron.plugin.service;
import java.io.InputStream;
import java.util.Map;

import com.neil.easycron.plugin.bo.JobRunningResult;
import com.neil.easycron.plugin.exception.BizException;

public interface EasyJobService {
    /**
     * Get input stream from the configuration file template
     * @return input stream of the file template
     * @throws Exception exception
     */
    InputStream getConfigFile() throws Exception;

    /**
     * Save the data to configuration file
     * @param filePath location of the configuration file
     * @param configData the configuration data
     * @throws BizException exception
     */
    void saveConfigFile(String filePath, Map<String, Object> configData) throws BizException;

    /**
     * serve
     * @return result
     */
    JobRunningResult serve();

    /**
     * test
     * @return result
     */
    JobRunningResult test();

    /**
     * Get version of this plugin
     * @return version
     */
    String getVersion();
}
