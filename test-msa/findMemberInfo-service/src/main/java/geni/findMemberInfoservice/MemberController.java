package geni.findMemberInfoservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class MemberController {
    @GetMapping("/findMemberInfo-service")
    public ResponseEntity<?> getNoticeList(){
        try {
            return ResponseEntity.ok().body("***findMemberInfo-service*** api 호출됨");
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
