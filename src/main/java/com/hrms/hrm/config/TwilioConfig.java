@Configuration
@ConditionalOnProperty(
  name = "twilio.enabled",
  havingValue = "true",
  matchIfMissing = false
)
public class TwilioConfig {
   ...
}
