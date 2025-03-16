package com.dev.oralsin.doctorticket;

import com.dev.oralsin.doctorticket.forms.FormMain;
import java.awt.EventQueue;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author samueelg
 */

public class DoctorTicketApplication {
    public static void main(String[] args){
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(FormMain.class)
        .headless(false).run(args);
    
    EventQueue.invokeLater(() -> {
        FormMain form = ctx.getBean(FormMain.class);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
    });
    }
}
