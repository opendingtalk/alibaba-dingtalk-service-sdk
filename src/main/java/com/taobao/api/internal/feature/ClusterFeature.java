package com.taobao.api.internal.feature;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.internal.cluster.ClusterManager;
import com.taobao.api.internal.util.WebUtils;

/**
 * 异地多活自动分配集群客户端特性
 */
public abstract class ClusterFeature {

    static {
        WebUtils.setIgnoreHostCheck(true);
    }

    public void init(final DefaultTaobaoClient client) {
        ClusterManager.initRefreshThread(client);
    }
}