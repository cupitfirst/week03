package com.bh1ofp.gateway.filter;

import io.netty.handler.codec.http.FullHttpResponse;

public class Week03HeaderHttpResponseFilter implements HttpResponseFilter {
    @Override
    public void filter(FullHttpResponse response) {
        response.headers().set("IARU","CRAC");
    }
}
