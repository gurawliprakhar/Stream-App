package com.stream.app.playload;

import lombok.*;

//@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class CustomMessage {
    private String message;
    private boolean success;


    public CustomMessage(String message, boolean success) {
        this.message = message;
        this.success = success;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    // Builder pattern
    public static class Builder {
        private String message;
        private boolean success;

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public CustomMessage build() {
            return new CustomMessage(message, success);
        }
    }

    // Static method to access the builder
    public static Builder builder() {
        return new Builder();
    }
}

