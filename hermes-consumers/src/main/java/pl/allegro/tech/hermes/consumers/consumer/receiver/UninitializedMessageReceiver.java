package pl.allegro.tech.hermes.consumers.consumer.receiver;

import pl.allegro.tech.hermes.consumers.consumer.Message;
import pl.allegro.tech.hermes.consumers.consumer.offset.FailedToCommitOffsets;
import pl.allegro.tech.hermes.consumers.consumer.offset.OffsetsToCommit;
import pl.allegro.tech.hermes.consumers.consumer.offset.SubscriptionPartitionOffset;

import java.util.Optional;

public class UninitializedMessageReceiver implements MessageReceiver {
    @Override
    public Optional<Message> next() {
        throw new ConsumerNotInitializedException();
    }

    @Override
    public FailedToCommitOffsets commit(OffsetsToCommit offsets) {
        throw new ConsumerNotInitializedException();
    }

    @Override
    public void moveOffset(SubscriptionPartitionOffset offset) {
        throw new ConsumerNotInitializedException();
    }
}
