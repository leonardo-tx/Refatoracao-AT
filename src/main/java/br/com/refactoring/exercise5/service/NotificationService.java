package br.com.refactoring.exercise5.service;

import br.com.refactoring.exercise5.factory.ChannelType;
import br.com.refactoring.exercise5.factory.ChannelFactory;
import br.com.refactoring.exercise5.model.Channel;

public class NotificationService {
    private final ChannelFactory channelFactory;

    public NotificationService(ChannelFactory channelFactory) {
        this.channelFactory = channelFactory;
    }

    public void notifyUser(ChannelType channelType, String message) {
        Channel channel = channelFactory.create(channelType);
        channel.send(message);
    }
}
