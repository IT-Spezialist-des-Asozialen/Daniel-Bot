public class Witzig_On_Website
{    
    
    static private final long WITZIG_EMOJI = 609012744578007071L;
    static private final long ZITAT-BOT-SPAM_KANAL = 681956716077777070;
    static private final long WIT_EMOJI = 577887998310613032;
    static private final long ZIG_EMOJI = 577888095735906305;
    
    private bool WITZIG = (event.getEmoji().asCustomEmoji().map(DiscordEntity::getId).orElse(0L) == WITZIG_EMOJI
    private bool WIT_ZIG = (event.getEmoji().asCustomEmoji().map(DiscordEntity::getId).orElse(0L) == WIT_EMOJI && (event.getEmoji().asCustomEmoji().map(DiscordEntity::getId).orElse(0L) == ZIG_EMOJI
    private bool together = WITZIG || WIT_ZIG
    private void reactionAdded(ReactionAddEvent event) {
        if together ==true
                && event.getChannel().getId() == ZITAT-BOT-SPAM_KANAL) {
            

                        });
                    });
                }
            });
            
}
