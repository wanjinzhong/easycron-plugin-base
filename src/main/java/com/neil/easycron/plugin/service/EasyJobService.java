package com.neil.easycron.plugin.service;
import java.io.InputStream;
import java.util.Map;

import com.neil.easycron.plugin.bo.JobRunningResult;

public interface EasyJobService {
    /**
     * Get input stream from the configuration file template
     *
     * @return input stream of the file template
     * @throws Exception exception
     */
    InputStream getConfigFile() throws Exception;

    /**
     * Validate configuration file
     * @param configData config data
     * @return error
     */
    Map<String/*config item name*/, String /*error*/> validateConfigFile(Map<String, Object> configData);

    /**
     * serve
     *
     * @return result
     */
    JobRunningResult serve();

    /**
     * test
     *
     * @return result
     */
    JobRunningResult test();

    /**
     * Get version of this plugin
     *
     * @return version
     */
    String getVersion();
}
