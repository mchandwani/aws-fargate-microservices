package com.fargate.services.notifications.core.services;

import com.fargate.services.notifications.core.dtos.EmailMessage;

public interface NotificationService {

	public void sendEmail(EmailMessage emailMessage);

}
