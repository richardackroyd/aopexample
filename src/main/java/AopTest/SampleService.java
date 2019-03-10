package AopTest;

import org.springframework.stereotype.Service;

@Service

public class SampleService {



    public Sample createSample(String sampleName) {

        Sample sample = new Sample();

        sample.setName(sampleName);

        return sample;

    }

}

