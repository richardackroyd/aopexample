package AopTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRest {

    @Autowired
    MyConfigClass myConfigClass;
    @Autowired
    SampleService sampleService;

@RequestMapping("ra")
public void rich() {
    myConfigClass.showVars();
}

    @RequestMapping("test")
    public String runTestRest() {

        Sample sample = sampleService.createSample("this is my sample");

        return sample.getName();

    }

}
