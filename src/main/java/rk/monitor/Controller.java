package rk.monitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/uer")
public class Controller {
    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);
    @GetMapping("/{userId}")
    ResponseEntity<?> getByIḍ(@PathVariable int userId){
        LOGGER.info("Start find userId :{}", userId);
        if (userId==1){
            LOGGER.info("found userId :{}", userId);
            return  ResponseEntity.status(HttpStatus.OK).body("found userId : "+userId );
        }else {
            LOGGER.error("not found userId :{}", userId);
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("BAD_REQUEST");
        }
    }
}
