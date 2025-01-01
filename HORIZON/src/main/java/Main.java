import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.managers.AudioManager;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        JDABuilder jdaBuilder = JDABuilder.createDefault("MTA1ODg5ODAyNDgxNTkxOTE2Nw.Grr7g1.mWOL5CSzlse-hhk9EsgueZs5XZyhO8Pu7-Q6-s");

        jdaBuilder.build();


    }
}
