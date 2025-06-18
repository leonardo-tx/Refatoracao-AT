package br.com.refactoring.exercise5.factory;

import br.com.refactoring.exercise5.model.EmailChannel;
import br.com.refactoring.exercise5.model.Channel;
import br.com.refactoring.exercise5.model.PushChannel;
import br.com.refactoring.exercise5.model.SmsChannel;

public class ChannelFactory {
    public Channel create(ChannelType channelType) {
        return switch (channelType) {
            case EMAIL -> new EmailChannel();
            case SMS -> new SmsChannel();
            case PUSH -> new PushChannel();
        };
    }
}
