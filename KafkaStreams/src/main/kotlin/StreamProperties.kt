import org.apache.kafka.streams.StreamsConfig
import java.util.*
import org.apache.kafka.common.config.SaslConfigs

class StreamProperties {

    fun configureProperties(): Properties {

        val settings = Properties()
        settings.setProperty(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "pkc-41p56.asia-south1.gcp.confluent.cloud:9092")
        settings.setProperty(StreamsConfig.APPLICATION_ID_CONFIG, "streamsId")
        settings.setProperty(StreamsConfig.SECURITY_PROTOCOL_CONFIG, "SASL_SSL")
        settings.setProperty(SaslConfigs.SASL_MECHANISM, "PLAIN")
        settings.setProperty(SaslConfigs.SASL_JAAS_CONFIG, "org.apache.kafka.common.security.plain.PlainLoginModule required username=\"<api key>\" password=\"<api secret>\";")
        settings.setProperty("MODEL_URL", "http://localhost:8000/prediction")
        return settings
    }
}
