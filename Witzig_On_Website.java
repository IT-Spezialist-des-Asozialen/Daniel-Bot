import java.util.*;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.message.embed;
import org.javacord.api.event.message.reaction.ReactionAddEvent;
import org.javacord.api.event.message.reaction.ReactionRemoveEvent;

public class Witzig_On_Website
{    
    
    static private final long WITZIG_EMOJI = 609012744578007071L;
    static private final long WIT_EMOJI = 577887998310613032;
    //static private final long ZIG_EMOJI = 577888095735906305;
    static private final long NICHT_WITZIG_EMOJI = 818856552014020628;
    static private final long ZITAT_BOT_SPAM_KANAL = 681956716077777070;
    static private final long Superheldenwelt = 845655788240240640;
    private bool Embedj=true;
    private bool WITZIG;
    private bool WIT_ZIG;

    private bool together;
    private bool NICHT_WITZIG;
    
    private bool tother_WEG;
    private bool NICHT_WITZIG_WEG;
    
    private bool WITZIG_WEG;
    private bool WIT_ZIG_WEG;
   
    private void 
    {
        List Embed = new ArrayList();
        List Embed = event.getEmbeds​()
        if Embed.size() != 0
        {
            Embedj=true;
        }
        else
        {
            Embedj=false;
        }
        WITZIG = (event.getEmoji().asCustomEmoji().map(DiscordEntity::getId).orElse(0L) == WITZIG_EMOJI;
        WIT_ZIG = (event.getEmoji().asCustomEmoji().map(DiscordEntity::getId).orElse(0L) == WIT_EMOJI;
        NICHT_WITZIG = (event.getEmoji().asCustomEmoji().map(DiscordEntity::getId).orElse(0L) == NICHT_WITZIG_EMOJI;
        WITZIG_WEG =(event.RemoveEmoji().asCustomEmoji().map(DiscordEntity::getId).orElse(0L) == WITZIG_EMOJI;
        WIT_ZIG_WEG =(event.RemoveEmoji().asCustomEmoji().map(DiscordEntity::getId).orElse(0L) ==WIT_EMOJI;
        NICHT_WITZIG_WEG =(event.RemoveEmoji().asCustomEmoji().map(DiscordEntity::getId).orElse(0L) == NICHT_WITZIG_EMOJI;
        if WITZIG ==true || WIT_ZIG==true;
        {
            togeher = true;
        }
        else
        {
            together = false;
        }
        if WITZIG_WEG ==true || WIT_ZIG_WEG==true;
        {
            togeher_WEG = true;
        }
        else
        {
            together_WEG = false;
        }
        if event.getChannel().getId() == ZITAT_BOT_SPAM_KANAL) &&event.getAuthor().getID()==Superheldenwelt && Embedj=true
        {

            if together==true || NICHT_WITZIG_WEG==true
            {
                curl 'https://asozial.org/api/zitate/383-643/' -H 'Accept: application/json' --data-raw '{"vote":"1"}';
            }
            if NICHT_WITZIG==true || together_WEG==true
            {
                curl 'https://asozial.org/api/zitate/383-643/' -H 'Accept: application/json' --data-raw '{"vote":"-1"}';
            }
        }
    }     
}
