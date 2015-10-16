package com.tacrocha.pictagster.client;

import com.tacrocha.pictagster.dao.LabelDao;
import com.tacrocha.pictagster.domain.Label;
import com.tacrocha.pictagster.service.LabelService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tacio on 2015-10-15.
 */
public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext container= new ClassPathXmlApplicationContext("application.xml");

        try {

            LabelService labelService = container.getBean(LabelService.class);
            Label label1 = new Label("cavalo");
            labelService.add(label1);

            Label foundLabel = labelService.find("cavalo");
            System.out.println(foundLabel.getName());

        } finally {
            container.close();
        }
    }
}
