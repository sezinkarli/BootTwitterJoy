package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author trkarlis (sezin.karli@eu.sony.com)
 * @since 3/19/14 9:26 AM
 *        User: Sezin Karli
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class BootTwitterJoy {
    public static void main(String[] args) throws Exception {
       SpringApplication.run(BootTwitterJoy.class, args);
    }
}
