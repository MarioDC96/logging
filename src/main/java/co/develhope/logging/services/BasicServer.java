package co.develhope.logging.services;
import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@Data
public class BasicServer {

    @Value("${customEnvs.n1}")
    private int n1;
    @Value("${customEnvs.n2}")
    private int n2;


    public String getPower(int a , int b ){
        this.n1 = a;
        this.n2 = b;
        int resultN1 = n1;
        int resultN2 = n2;
        for(int i = 0; i < n1; i++){
            resultN1 *= n1;
       }
        for(int i = 0; i < n2; i++){
            resultN2 *= n1;
        }
        return "primo valore: " + resultN1 + " secondo valore: " + resultN2;

    }
}
