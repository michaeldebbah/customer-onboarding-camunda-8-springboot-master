package io.berndruecker.onboarding.customer.process;

import io.camunda.zeebe.spring.client.annotation.ZeebeWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class HandleTimeOutAdapter {

    private static Logger logger = LoggerFactory.getLogger(HandleTimeOutAdapter.class);

    @ZeebeWorker(type = "handleTimeOut", autoComplete = true)
    public Map<String, Object> handleTimeOut() {
        HashMap<String, Object> resultVariables = new HashMap<>();

        logger.info("timeout expired...");

        return resultVariables;
    }

}
