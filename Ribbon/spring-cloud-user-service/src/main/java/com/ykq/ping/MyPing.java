package com.ykq.ping;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;

/**
 * @ClassName MyPing
 * @Description TODO
 * @Author ykq
 * @Date 2020/11/17
 * @Version v1.0.0
 */
public class MyPing implements IPing {
    @Override
    public boolean isAlive(Server server) {
        System.out.println("isAlive" + server.getHost() + ":" + server.getPort());
        return true;
    }
}
