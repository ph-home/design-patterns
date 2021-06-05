package behavioral.b05_mediator.step2_user_class;

import behavioral.b05_mediator.step1_mediator_class.ChatRoom;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
