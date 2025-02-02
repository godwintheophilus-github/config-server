package tech.with.gt_cloud_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RestControllerTest {
    @Value("${a}")
    private String message;

    @Autowired
    @Qualifier("analyticsJdbcTemplate")
    JdbcTemplate analyticsJdbcTemplate;

    @Autowired
    @Qualifier("mluserJdbcTemplate")
    JdbcTemplate jdbcTemplate;
    @Value("${spring.datasource.url}")
    String url;

    @GetMapping("/message")
    public String getMessage() {
        System.out.println(url);
        jdbcTemplate.execute("create table test(id numeric)");
        analyticsJdbcTemplate.execute("create table test1(id numeric)");
        return message;
    }
}
