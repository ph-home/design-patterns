package behavioral.b05_mediator.step1_mediator_class;

import behavioral.b05_mediator.step2_user_class.User;

import java.util.Date;

public class ChatRoom {
    private ChatRoom() {
    }

    public static void showMessage(User user, String message) {
		System.out.println(new Date() + " [" + user.getName() + "] : " + message);
	}

}
