import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.managers.AudioManager;

import javax.security.auth.login.LoginException;
import java.io.FileInputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws LoginException {

        Properties properties = new Properties();
        FileInputStream fileInputStream = null;
        String TOKEN = "";
        try {
            fileInputStream = new FileInputStream("src/TOKEN.properties");
            properties.load(fileInputStream);
            TOKEN = properties.getProperty("TOKEN");
        }catch (Exception e){
            e.printStackTrace();
        }
        JDABuilder jdaBuilder = JDABuilder.createDefault(TOKEN);


        jdaBuilder.build();


    }
}
