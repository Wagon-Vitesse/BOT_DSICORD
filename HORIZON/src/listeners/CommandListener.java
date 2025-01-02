package listeners;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.GuildVoiceState;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.channel.concrete.VoiceChannel;
import net.dv8tion.jda.api.entities.channel.unions.AudioChannelUnion;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.managers.AudioManager;
import org.jetbrains.annotations.NotNull;

import java.awt.event.ActionListener;

public class CommandListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        System.out.println("User [" + event.getAuthor().getName() + "] send : " + event.getMessage().getContentRaw());
        if (event.getMessage().getContentRaw().startsWith("!")) {

            Member member = event.getMember();
            GuildVoiceState memeberState = member.getVoiceState();
            AudioManager audioManager = event.getGuild().getAudioManager();
            AudioChannelUnion channel = memeberState.getChannel();

            switch (event.getMessage().getContentRaw()) {
                case "!help":
                    event.getChannel().sendMessage("Here is a list of commands").queue();
                    break;
                case "!discord":
                    event.getChannel().sendMessage("Here is a discord command").queue();
                    break;
                case "!join":
                    audioManager.openAudioConnection(channel);
                    break;
                case "!leave":
                    audioManager.closeAudioConnection();
                    break;
                case "!play":
                    event.getChannel().sendMessage("Not done yet").queue();
                    break;
                case "!etem":
                    event.getChannel().sendMessage("SALOPE").queue();
                    break;
                default:
                    event.getChannel().sendMessage("Unknown command").queue();
                    break;
            }
        }
    }
}
