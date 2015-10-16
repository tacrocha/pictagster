package com.tacrocha.pictagster.client;

import com.tacrocha.pictagster.dao.LabelDao;
import com.tacrocha.pictagster.domain.Label;
import com.tacrocha.pictagster.service.LabelService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by tacio on 2015-10-15.
 */
public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext container= new ClassPathXmlApplicationContext("application.xml");

        try {

            LabelService labelService = container.getBean(LabelService.class);
            Label label1 = new Label("landscape");
            labelService.add(label1);

            Label foundLabel = labelService.find("cavalo");
            System.out.println(foundLabel.getName());

            List<Label> allLabels = labelService.getAllLabels();
            for (Label next: allLabels) {
                System.out.println(next.getName());
            }
        } finally {
            container.close();
        }
    }
}
