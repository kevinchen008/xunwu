package com.zku.xunwu.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {

    private int code;

    private String message;

    private Object data;

    private boolean more;


    public static ApiResponse ofSuccess(Object data) {
        return new ApiResponse(Status.SUCCESS.status, Status.SUCCESS.standardMessage, data, false);
    }

    public static ApiResponse ofMessage(int code, String message) {
        return new ApiResponse(code, message, null, false);
    }

    public static ApiResponse ofStatus(Status status) {
        return new ApiResponse(Status.SUCCESS.status, Status.SUCCESS.standardMessage, null, false);
    }


    public enum Status {
        SUCCESS(200, "OK"),
        BAD_REQUEST(400, "Bad Request"),
        INTERNAL_SERVER_ERROR(500, "Unknown Internal Error"),
        NOT_VALID_PARAM(40005, "Not Valid Param"),
        NOT_SUPPORTED_OPERATION(40006, "Not Supported Operation"),
        NOT_LOGIN(50000, "Not Login");

        private int status;
        private String standardMessage;

        Status(int status, String standardMessage) {
            this.status = status;
            this.standardMessage = standardMessage;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getStandardMessage() {
            return standardMessage;
        }

        public void setStandardMessage(String standardMessage) {
            this.standardMessage = standardMessage;
        }
    }

}
