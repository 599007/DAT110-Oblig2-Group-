package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker
    String user;
    String topic;
    public DeleteTopicMsg(String user, String topic) {
        super(MessageType.DELETETOPIC, user);
        this.user = user;
        this.topic = topic;
    }


    public String getUser() {
        return user;
    }

    public String getTopic() {
        return topic;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "DeleteTopicMsg{" +
                "user='" + user + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
    // TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text

}
