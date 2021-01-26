package com.ymc.videodemo.ijk.cache;


import com.ymc.videodemo.ijk.utils.Debuger;
import com.ymc.videodemo.videocache.headers.HeaderInjector;

import java.util.HashMap;
import java.util.Map;

/**
 for android video cache header
 */
public class ProxyCacheUserAgentHeadersInjector implements HeaderInjector {

    public final static Map<String, String> mMapHeadData = new HashMap<>();

    @Override
    public Map<String, String> addHeaders(String url) {
        Debuger.printfLog("****** proxy addHeaders ****** " + mMapHeadData.size());
        return mMapHeadData;
    }
}