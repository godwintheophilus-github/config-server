package tech.with.gt_cloud_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RestControllerTest {
    @Value("${a}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}
