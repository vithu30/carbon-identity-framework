package org.wso2.carbon.identity.framework.authentication.processor.handler.response;


import org.wso2.carbon.identity.framework.authentication.processor.handler.FrameworkHandlerException;

public class ResponseException extends FrameworkHandlerException {
    public ResponseException(String message) {
        super(message);
    }

    public ResponseException(String message, Throwable cause) {
        super(message, cause);
    }
}
